
package jvg.dexma;

import java.util.List;

public class Reference_devices{
   	private Number fridge;
   	private Number hvac;
   	private Number lighting;
   	private Number main;
   	private Number otemp;

 	public Reference_devices(Number fridge, Number hvac, Number lighting,
        Number main, Number otemp) {
      super();
      this.fridge = fridge;
      this.hvac = hvac;
      this.lighting = lighting;
      this.main = main;
      this.otemp = otemp;
    }
  public Number getFridge(){
		return this.fridge;
	}
	public void setFridge(Number fridge){
		this.fridge = fridge;
	}
 	public Number getHvac(){
		return this.hvac;
	}
	public void setHvac(Number hvac){
		this.hvac = hvac;
	}
 	public Number getLighting(){
		return this.lighting;
	}
	public void setLighting(Number lighting){
		this.lighting = lighting;
	}
 	public Number getMain(){
		return this.main;
	}
	public void setMain(Number main){
		this.main = main;
	}
 	public Number getOtemp(){
		return this.otemp;
	}
	public void setOtemp(Number otemp){
		this.otemp = otemp;
	}
}
