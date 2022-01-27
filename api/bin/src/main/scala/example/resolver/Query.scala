package example.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import scala.collection.JavaConversions._

import example.model.Weapon;
import example.repository.WeaponRepository;

@Component
class Query(weaponRepository: WeaponRepository) extends GraphQLQueryResolver {

  def findAllWeapons(): String = {
    var sb = new StringBuilder();
    for ( w <- weaponRepository.findAll() ) {
      sb.append(w.toString()+"\n");
    }
    return sb.toString();
  }

  def countAll(): Long = weaponRepository.count();

}
