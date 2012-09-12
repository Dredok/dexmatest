package jvg.dexma;

import java.util.List;


/** Facade implementing all the http/json dexma v2 API
 * http://support.dexmatech.com/customer/portal/articles/713475-http-json-api-v2
 *
 */

public class DexmaRestFacade implements DexmaRestI {

  @Override
  public List<Deployment> getAllDeployments() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Deployment getDeployment(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Device> getAllDevices() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Device getDevice(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Device> getDevicesByLocation(Long locationId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Location> getAllLocations() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Location getLocation(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Location> getLocationsByDeployment(Long deploymentId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Readings> getReadings(Long deviceId, Long parameterId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Cost getCost(Long deviceId, EnergyType energyType) {
    // TODO Auto-generated method stub
    return null;
  }

}
