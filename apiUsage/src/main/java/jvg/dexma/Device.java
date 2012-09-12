
package jvg.dexma;


public class Device{    
    private String description;
    private Number id;
    private String name;
    private String networkid;

  public Device(String description, Number id, String name, String networkid) {
    super();
    this.description = description;
    this.id = id;
    this.name = name;
    this.networkid = networkid;
  }

  public String getDescription(){
    return this.description;
  }
  public void setDescription(String description){
    this.description = description;
  }
  public Number getId(){
    return this.id;
  }
  public void setId(Number id){
    this.id = id;
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getNetworkid(){
    return this.networkid;
  }
  public void setNetworkid(String networkid){
    this.networkid = networkid;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Device other = (Device) obj;
    if (description == null) {
      if (other.description != null)
        return false;
    } else if (!description.equals(other.description))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (networkid == null) {
      if (other.networkid != null)
        return false;
    } else if (!networkid.equals(other.networkid))
      return false;
    return true;
  }
}