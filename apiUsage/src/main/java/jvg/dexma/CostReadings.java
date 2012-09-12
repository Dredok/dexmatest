package jvg.dexma;

public class CostReadings{
    private Number cost;
    private Number energy;
    private Number period;
    private String ts;

  public Number getCost(){
    return this.cost;
  }
  public void setCost(Number cost){
    this.cost = cost;
  }
  public Number getEnergy(){
    return this.energy;
  }
  public void setEnergy(Number energy){
    this.energy = energy;
  }
  public Number getPeriod(){
    return this.period;
  }
  public void setPeriod(Number period){
    this.period = period;
  }
  public String getTs(){
    return this.ts;
  }
  public void setTs(String ts){
    this.ts = ts;
  }
}