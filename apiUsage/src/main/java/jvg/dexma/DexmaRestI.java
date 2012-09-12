package jvg.dexma;

import java.util.List;

public interface DexmaRestI {
  /* deployments calls*/
  public List<Deployment> getAllDeployments();
  public Deployment getDeployment(Long id);
  
  /* devices calls*/
  public List<Device> getAllDevices();
  public Device getDevice(Long id);
  public List<Device> getDevicesByLocation(Long locationId);
  
  /* locations calls*/
  public List<Location> getAllLocations();
  public Location getLocation(Long id);
  public List<Location> getLocationsByDeployment(Long deploymentId);
  
  /* readings calls
   * TODO optional parameters:
          start=YYYYMMDDHHMMSS
          end=YYYYMMDDHHMMSS
   */  
  public List<Readings> getReadings(Long deviceId, Long parameterId);
  
  /* cost calls
   * TODO options:
          start=YYYYMMDDHHMMSS
          end=YYYYMMDDHHMMSS
          period=HOUR | DAY | WEEK | MONTH | YEAR
          grouped=true | false
          Energy type can be: ELECTRICAL, GAS, WATER
   */  
  public Cost getCost(Long deviceId, EnergyType energyType);
}
