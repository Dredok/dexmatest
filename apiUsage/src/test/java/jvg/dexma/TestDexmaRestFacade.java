package jvg.dexma;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.junit.*;

public class TestDexmaRestFacade {
  static String jsonFile = "./src/test/resources/locations.json";
  static List<Location> locations;
  static DexmaRestFacade dexmaRestFacade;
  
  @BeforeClass
  public static void testReadJsonStream() {    
    LocationJsonHelper jsonHelper = new LocationJsonHelper();
    try {
      String curDir = System.getProperty("user.dir");
      System.out.println("CurDir: "+curDir);
      FileInputStream in = new FileInputStream(jsonFile);
      locations = jsonHelper.readJsonStream(in);      
    } catch (IOException e) {
      fail("Test not properly configured. IOException: "+e);      
    }    
  }
  
  @BeforeClass
  public static void initDexmaRestFacade() {
    dexmaRestFacade = new DexmaRestFacade("o5v19Rsc7BJ1Crla");
  }
  
  @Test
  public void testGetAllLocations() throws IOException {
    List<Location> remoteLocations = dexmaRestFacade.getAllLocations();     
    assertEquals(3,remoteLocations.size());
    Iterator<Location> itRemote = remoteLocations.iterator();    
    while (itRemote.hasNext()) {
      Location loc = itRemote.next();
      /*iteration over the local list. This operation is slow (O(N2)) but for test purposes
       * is more than enough
       */      
      Iterator<Location> itLocal = locations.iterator();
      boolean notFound = true;      
      int i=0;
      while (itLocal.hasNext() && notFound) {        
        notFound = !loc.equals(itLocal.next());
      }
      assertEquals(notFound,false);
    }
  }
  @Test
  public void testGetLocation() throws IOException {
    Location loc = dexmaRestFacade.getLocation(10845L);
    assertNotNull(loc);
    assertEquals(loc.getName(),"Supermercado Bilbao");    
  }
}