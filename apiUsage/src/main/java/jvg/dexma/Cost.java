package jvg.dexma;

import java.util.List;

public class Cost{
    private List<Periods> periods;
    private List<CostReadings> readings;

  public Cost(List<Periods> periods, List<CostReadings> readings) {
      super();
      this.periods = periods;
      this.readings = readings;
    }
  public List<Periods> getPeriods(){
    return this.periods;
  }
  public void setPeriods(List<Periods> periods){
    this.periods = periods;
  }
  public List<CostReadings> getReadings(){
    return this.readings;
  }
  public void setReadings(List<CostReadings> readings){
    this.readings = readings;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Cost other = (Cost) obj;
    if (periods == null) {
      if (other.periods != null)
        return false;
    } else if (!periods.equals(other.periods))
      return false;
    if (readings == null) {
      if (other.readings != null)
        return false;
    } else if (!readings.equals(other.readings))
      return false;
    return true;
  }
}