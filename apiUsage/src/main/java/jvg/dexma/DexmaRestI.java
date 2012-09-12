package jvg.dexma;

import java.io.IOException;
import java.util.List;

public interface DexmaRestI {
  /* deployments calls*/
  public List<Deployment> getAllDeployments() throws IOException;
  public Deployment getDeployment(Long id) throws IOException;
  
  /* devices calls*/
  public List<Device> getAllDevices() throws IOException;
  public Device getDevice(Long id) throws IOException;
  public List<Device> getDevicesByLocation(Long locationId) throws IOException;
  
  /* locations calls*/
  public List<Location> getAllLocations() throws IOException;
  public Location getLocation(Long id) throws IOException;
  public List<Location> getLocationsByDeployment(Long deploymentId) throws IOException;
  
  /* readings calls
   * TODO optional parameters:
          start=YYYYMMDDHHMMSS
          end=YYYYMMDDHHMMSS
   */  
  public List<Readings> getReadings(Long deviceId, Long parameterId) throws IOException;
  
  /* cost calls
   * TODO options:
          start=YYYYMMDDHHMMSS
          end=YYYYMMDDHHMMSS
          period=HOUR | DAY | WEEK | MONTH | YEAR
          grouped=true | false          
   */  
  public Cost getCost(Long deviceId, EnergyType energyType) throws IOException;
}
