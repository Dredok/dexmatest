package jvg.dexma;

public class Parameter{
    private String freq;
    private String i18n;
    private Number id;
    private String name;
    private String units;

  public Parameter(String freq, String i18n, Number id, String name,
        String units) {
      super();
      this.freq = freq;
      this.i18n = i18n;
      this.id = id;
      this.name = name;
      this.units = units;
    }
  public String getFreq(){
    return this.freq;
  }
  public void setFreq(String freq){
    this.freq = freq;
  }
  public String getI18n(){
    return this.i18n;
  }
  public void setI18n(String i18n){
    this.i18n = i18n;
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
  public String getUnits(){
    return this.units;
  }
  public void setUnits(String units){
    this.units = units;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Parameter other = (Parameter) obj;
    if (freq == null) {
      if (other.freq != null)
        return false;
    } else if (!freq.equals(other.freq))
      return false;
    if (i18n == null) {
      if (other.i18n != null)
        return false;
    } else if (!i18n.equals(other.i18n))
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
    if (units == null) {
      if (other.units != null)
        return false;
    } else if (!units.equals(other.units))
      return false;
    return true;
  }
}