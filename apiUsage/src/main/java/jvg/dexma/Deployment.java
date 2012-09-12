package jvg.dexma;

public class Deployment{
    private String account_name;
    private String customer_name;
    private Number id;
    private String name;

  public Deployment(String account_name, String customer_name, Number id,
        String name) {
      super();
      this.account_name = account_name;
      this.customer_name = customer_name;
      this.id = id;
      this.name = name;
  }
  
  public String getAccount_name(){
    return this.account_name;
  }
  public void setAccount_name(String account_name){
    this.account_name = account_name;
  }
  public String getCustomer_name(){
    return this.customer_name;
  }
  public void setCustomer_name(String customer_name){
    this.customer_name = customer_name;
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

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Deployment other = (Deployment) obj;
    if (account_name == null) {
      if (other.account_name != null)
        return false;
    } else if (!account_name.equals(other.account_name))
      return false;
    if (customer_name == null) {
      if (other.customer_name != null)
        return false;
    } else if (!customer_name.equals(other.customer_name))
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
    return true;
  }
}