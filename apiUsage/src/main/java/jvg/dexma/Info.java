
package jvg.dexma;

import java.util.List;

public class Info{
   	private String activity;
   	private Number summertemp;
   	private Number surface;
   	private Number wintertemp;

 	public Info(String activity, Number summertemp, Number surface,
        Number wintertemp) {
      super();
      this.activity = activity;
      this.summertemp = summertemp;
      this.surface = surface;
      this.wintertemp = wintertemp;
  }
  public String getActivity(){
		return this.activity;
	}
	public void setActivity(String activity){
		this.activity = activity;
	}
 	public Number getSummertemp(){
		return this.summertemp;
	}
	public void setSummertemp(Number summertemp){
		this.summertemp = summertemp;
	}
 	public Number getSurface(){
		return this.surface;
	}
	public void setSurface(Number surface){
		this.surface = surface;
	}
 	public Number getWintertemp(){
		return this.wintertemp;
	}
	public void setWintertemp(Number wintertemp){
		this.wintertemp = wintertemp;
	}
}
