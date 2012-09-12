
package jvg.dexma;


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
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Info other = (Info) obj;
    if (activity == null) {
      if (other.activity != null)
        return false;
    } else if (!activity.equals(other.activity))
      return false;
    if (summertemp == null) {
      if (other.summertemp != null)
        return false;
    } else if (!summertemp.equals(other.summertemp))
      return false;
    if (surface == null) {
      if (other.surface != null)
        return false;
    } else if (!surface.equals(other.surface))
      return false;
    if (wintertemp == null) {
      if (other.wintertemp != null)
        return false;
    } else if (!wintertemp.equals(other.wintertemp))
      return false;
    return true;
  }
}
