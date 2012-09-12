package jvg.dexma;

import java.util.List;

public class Cost{
    private List<Periods> periods;
    private List<CostReadings> readings;

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
}