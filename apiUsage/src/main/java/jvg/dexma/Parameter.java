package jvg.dexma;

public class Parameter{
    private String freq;
    private String i18n;
    private Number id;
    private String name;
    private String units;

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
}