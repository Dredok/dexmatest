
package jvg.dexma;

import java.util.List;

public class Location{   	
    private Address address;
   	private Number id;
   	private Info info;
   	private String name;
   	private Reference_devices reference_devices;
   	
 	public Location(Address address, Number id, Info info, String name,
        Reference_devices reference_devices) {
    super();
    this.address = address;
    this.id = id;
    this.info = info;
    this.name = name;
    this.reference_devices = reference_devices;
  }
 	public Address getAddress(){
		return this.address;
	}
	public void setAddress(Address address){
		this.address = address;
	}
 	public Number getId(){
		return this.id;
	}
	public void setId(Number id){
		this.id = id;
	}
 	public Info getInfo(){
		return this.info;
	}
	public void setInfo(Info info){
		this.info = info;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public Reference_devices getReference_devices(){
		return this.reference_devices;
	}
	public void setReference_devices(Reference_devices reference_devices){
		this.reference_devices = reference_devices;
	}
}
