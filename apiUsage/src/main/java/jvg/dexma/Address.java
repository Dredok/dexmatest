
package jvg.dexma;

public class Address{
   	private String city;
   	private Number latitude;
   	private String street;
   	private Number longitude;   	

 	public Address(String city, Number latitude, String street, Number longitude) {
      super();
      this.city = city;
      this.latitude = latitude;
      this.street = street;
      this.longitude = longitude;
    }
  public String getCity(){
		return this.city;
	}
	public void setCity(String city){
		this.city = city;
	}
 	public Number getLatitude(){
		return this.latitude;
	}
	public void setLatitude(Number latitude){
		this.latitude = latitude;
	}
 	public Number getLongitude(){
		return this.longitude;
	}
	public void setLongitude(Number longitude){
		this.longitude = longitude;
	}
  public String getStreet() {
    return this.street;
  }
  public void setStreet(String street) {
    this.street = street;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Address other = (Address) obj;
    if (city == null) {
      if (other.city != null)
        return false;
    } else if (!city.equals(other.city))
      return false;
    if (latitude == null) {
      if (other.latitude != null)
        return false;
    } else if (!latitude.equals(other.latitude))
      return false;
    if (longitude == null) {
      if (other.longitude != null)
        return false;
    } else if (!longitude.equals(other.longitude))
      return false;
    if (street == null) {
      if (other.street != null)
        return false;
    } else if (!street.equals(other.street))
      return false;
    return true;
  }
}
