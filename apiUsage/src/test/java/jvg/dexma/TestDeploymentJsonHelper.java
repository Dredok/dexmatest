package jvg.dexma;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.*;

public class TestDeploymentJsonHelper {
  static String jsonFile = "./src/test/resources/deployments.json";
  static List<Deployment> deployments;
  
  @BeforeClass
  public static void testReadJsonStream() {    
    DeploymentJsonHelper jsonHelper = new DeploymentJsonHelper();
    try {
      String curDir = System.getProperty("user.dir");
      System.out.println("CurDir: "+curDir);
      FileInputStream in = new FileInputStream(jsonFile);
      deployments = jsonHelper.readJsonStream(IOUtils.toString(in,"UTF-8"));      
    } catch (IOException e) {
      fail("Test not properly configured. IOException: "+e);      
    }    
  }
  
  @Test
  public void testNumberOfDeployments() {
    assertEquals(1,deployments.size());
  }
  
  @Test
  public void supermercados() {
    Iterator<Deployment> it = deployments.iterator();
    while (it.hasNext()) {
      Deployment dep = it.next();
      assertEquals(dep.getId(), 265L);
      assertEquals(dep.getCustomer_name(), "Supermercados");
      assertEquals(dep.getAccount_name(),"demoDEXMA");
      assertEquals(dep.getName(), "Demo Supermercados");      
    }
  }
}
