package jvg.dexma;

public class Periods{
    private String currency;
    private String id;
    private String name;
    private Number pricekWh;

  public String getCurrency(){
    return this.currency;
  }
  public void setCurrency(String currency){
    this.currency = currency;
  }
  public String getId(){
    return this.id;
  }
  public void setId(String id){
    this.id = id;
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }
  public Number getPricekWh(){
    return this.pricekWh;
  }
  public void setPricekWh(Number pricekWh){
    this.pricekWh = pricekWh;
  }
}