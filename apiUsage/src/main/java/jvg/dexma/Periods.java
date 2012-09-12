package jvg.dexma;

public class Periods{
    private String currency;
    private String id;
    private String name;
    private Number pricekWh;

  public Periods(String currency, String id, String name, Number pricekWh) {
      super();
      this.currency = currency;
      this.id = id;
      this.name = name;
      this.pricekWh = pricekWh;
    }
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
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Periods other = (Periods) obj;
    if (currency == null) {
      if (other.currency != null)
        return false;
    } else if (!currency.equals(other.currency))
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
    if (pricekWh == null) {
      if (other.pricekWh != null)
        return false;
    } else if (!pricekWh.equals(other.pricekWh))
      return false;
    return true;
  }
}