package example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "weapon")
class Weapon {

  @Id
  var id: String = "";

  @Indexed
  var name: String =  "";
  var description: String = "";
  var position: String = "";
  var level: Int = 0;
  var properties: Properties = new Properties();

  def this(newName: String, newDescription: String) {
    this();
    this.name = newName;
    this.description = newDescription;
    this.position = "right";
    this.level = 1;
    this.properties = new Properties();
  }

  override def toString(): String = {
    var sb = new StringBuilder()
    sb.append("{")
    sb.append(" 'id': '" + id + "'")
    sb.append(", 'name': '" + name + "'")
    sb.append(", 'description': '" + description + "'")
    sb.append(", 'position': '" + position + "'")
    sb.append(", 'level': " + level)
    sb.append(", 'properties': " + properties.toString())
    sb.append("}")
    return sb.toString()
  }
}
