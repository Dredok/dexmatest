package jvg.dexma;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.stream.JsonReader;

public class DeploymentJsonHelper {
  
  public List<Deployment> readJsonStream(String in) throws IOException {
    JsonReader reader = new JsonReader(new StringReader(in));
    try {
      return readDeploymentArray(reader);
    } finally {
      reader.close();
    }    
  }
    
  public List<Deployment> readDeploymentArray(JsonReader reader) throws IOException {
    List<Deployment> deployments = new ArrayList<Deployment>();

    reader.beginArray();
    while (reader.hasNext()) {
      deployments.add(readDeployment(reader));
    }
    reader.endArray();
    return deployments;
  }
  
  public Deployment readDeployment(String in) throws IOException {
    JsonReader reader = new JsonReader(new StringReader(in));
    try {
      return readDeployment(reader);
    } finally {
      reader.close();
    }
  }

  /*Fills the locations*/
  public Deployment readDeployment(JsonReader reader) throws IOException {
    long id = -1;    
    String name = null;
    String account_name = null;
    String customer_name = null;
    
       
    reader.beginObject();
    
    while (reader.hasNext()) {
      
      String key = reader.nextName();
      if (key.equals("id")) {
        id = reader.nextLong();
      } else if (key.equals("name")) {
        name = reader.nextString();
      } else if (key.equals("account_name")) {
        account_name = reader.nextString();
      } else if (key.equals("customer_name")) {
        customer_name = reader.nextString();
      } else {
        System.err.println("Unknown key: "+key + " (or composite hasn't body)");
        reader.skipValue();
      }
    }    
    reader.endObject();
    return new Deployment (account_name, customer_name, id, name);
  }  
}