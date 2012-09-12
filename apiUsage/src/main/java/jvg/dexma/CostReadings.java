package jvg.dexma;

public class CostReadings{
    private Number cost;
    private Number energy;
    private Number period;
    private String ts;

  public CostReadings(Number cost, Number energy, Number period, String ts) {
      super();
      this.cost = cost;
      this.energy = energy;
      this.period = period;
      this.ts = ts;
    }
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
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CostReadings other = (CostReadings) obj;
    if (cost == null) {
      if (other.cost != null)
        return false;
    } else if (!cost.equals(other.cost))
      return false;
    if (energy == null) {
      if (other.energy != null)
        return false;
    } else if (!energy.equals(other.energy))
      return false;
    if (period == null) {
      if (other.period != null)
        return false;
    } else if (!period.equals(other.period))
      return false;
    if (ts == null) {
      if (other.ts != null)
        return false;
    } else if (!ts.equals(other.ts))
      return false;
    return true;
  }
}