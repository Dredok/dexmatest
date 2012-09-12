package jvg.dexma;

public class Deployment{
    private String account_name;
    private String customer_name;
    private Number id;
    private String name;

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
}