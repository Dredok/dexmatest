
package jvg.dexma;


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
  
	@Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Location other = (Location) obj;
    if (address == null) {
      if (other.address != null)
        return false;
    } else if (!address.equals(other.address))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (info == null) {
      if (other.info != null)
        return false;
    } else if (!info.equals(other.info))
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (reference_devices == null) {
      if (other.reference_devices != null)
        return false;
    } else if (!reference_devices.equals(other.reference_devices))
      return false;
    return true;
  }
}
