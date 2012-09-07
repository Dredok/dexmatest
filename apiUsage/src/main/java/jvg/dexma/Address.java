
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
}
