package jvg.dexma;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.junit.*;

public class TestLocationJsonHelper {
  static String jsonFile = "./src/test/resources/locations.json";
  static List<Location> locations;
  
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
  
  @Test
  public void testNumberOfLocations() {
    assertEquals(3,locations.size());
  }
  
  @Test
  public void superMercadoBarcelona() {
    Iterator<Location> it = locations.iterator();
    while (it.hasNext()) {
      Location loc = it.next();
      if (loc.getName().equals("Supermercado Barcelona")) { //found
        assertEquals(10843L,loc.getId());
        assertEquals(15.0,loc.getInfo().getWintertemp());
        assertEquals("SMALL-STORE-FOOD",loc.getInfo().getActivity());
        assertEquals(1230.0,loc.getInfo().getSurface());
        assertEquals(18.0,loc.getInfo().getSummertemp());
        assertEquals(10849,loc.getReference_devices().getOtemp().intValue());
        assertEquals(10695,loc.getReference_devices().getMain().intValue());
        assertEquals(10697,loc.getReference_devices().getLighting().intValue());
        assertEquals(10698,loc.getReference_devices().getFridge().intValue());
        assertEquals(10756,loc.getReference_devices().getHvac().intValue());
        assertEquals(41.3867,loc.getAddress().getLatitude());
        assertEquals("Barcelona",loc.getAddress().getCity());
        assertEquals("Pla\u00e7a catalunya",loc.getAddress().getStreet());
        assertEquals(2.17,loc.getAddress().getLongitude());
      }
    }
  }
}
