
package jvg.dexma;


public class Device{
    private String description;
    private Number id;
    private String name;
    private String networkid;

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
}