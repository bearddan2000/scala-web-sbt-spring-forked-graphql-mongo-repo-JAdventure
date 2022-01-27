package example.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import scala.collection.JavaConversions._

import example.model.Weapon;
import example.repository.WeaponRepository;

@Component
class Mutation(weaponRepository: WeaponRepository) extends GraphQLMutationResolver {

  def createWeapon(name: String, description: String ): String = {
    val w = new Weapon(name, description);
    weaponRepository.save(w);
    return w.toString();
  }

}
