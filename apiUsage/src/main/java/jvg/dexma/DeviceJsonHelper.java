package jvg.dexma;

//TODO need some JUnit test
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

public class DeviceJsonHelper {
  
  public List<Device> readJsonStream(String in) throws IOException {
    JsonReader reader = new JsonReader(new StringReader(in));
    try {
      return readDeviceArray(reader);
    } finally {
      reader.close();
    }    
  }
    
  public List<Device> readDeviceArray(JsonReader reader) throws IOException {
    List<Device> devices = new ArrayList<Device>();

    reader.beginArray();
    while (reader.hasNext()) {
      devices.add(readDevice(reader));
    }
    reader.endArray();
    return devices;
  }
  
  public Device readDevice(String in) throws IOException {
    JsonReader reader = new JsonReader(new StringReader(in));
    try {
      return readDevice(reader);
    } finally {
      reader.close();
    }
  }

  /*Fills the locations*/
  public Device readDevice(JsonReader reader) throws IOException {
    long id = -1;    
    String name = null;
    String description = null;
    String networkid = null;
    
       
    reader.beginObject();
    
    while (reader.hasNext()) {
      
      String key = reader.nextName();
      if (key.equals("id")) {
        id = reader.nextLong();
      } else if (key.equals("name")) {
        name = reader.nextString();
      } else if (key.equals("description")) {
        if (reader.peek() == JsonToken.NULL) {
          reader.nextNull();
          description = "";
        } else {
          description = reader.nextString();
        }
      } else if (key.equals("networkid")) {
        networkid = reader.nextString();
      } else {
        System.err.println("Unknown key: "+key + " (or composite hasn't body)");
        reader.skipValue();
      }
    }    
    reader.endObject();
    return new Device (description,id,name,networkid);
  }  
}