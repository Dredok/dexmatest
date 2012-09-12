package jvg.dexma;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

public class LocationJsonHelper {
  
  public List<Location> readJsonStream(String in) throws IOException {
    JsonReader reader = new JsonReader(new StringReader(in));
    try {
      return readLocationArray(reader);
    } finally {
      reader.close();
    }    
  }
  
  public List<Location> readJsonStream(InputStream in) throws IOException {
    JsonReader reader = new JsonReader(new InputStreamReader(in, "UTF-8"));
    try {
      return readLocationArray(reader);
    } finally {
      reader.close();
    }
  }

  public List<Location> readLocationArray(JsonReader reader) throws IOException {
    List<Location> locations = new ArrayList<Location>();

    reader.beginArray();
    while (reader.hasNext()) {
      locations.add(readLocation(reader));
    }
    reader.endArray();
    return locations;
  }

  /*Fills the locations*/
  public Location readLocation(JsonReader reader) throws IOException {
    Address address = null;
    long id = -1;
    Info info = null;
    String name = null;
    Reference_devices reference_devices = null;
       
    reader.beginObject();
    while (reader.hasNext()) {
      
      String key = reader.nextName();
      if (key.equals("id")) {
        id = reader.nextLong();
      } else if (key.equals("name")) {
        name = reader.nextString();
      //responsability of creating an Address belongs to this helper... 
      } else if (key.equals("address") && reader.peek() != JsonToken.NULL) {
        address = readAddress(reader);
      //responsability of creating an Info belongs to this helper... 
      } else if (key.equals("info") && reader.peek() != JsonToken.NULL) {
        info = readInfo(reader);   
      //responsability of creating a Reference_devices belongs to this helper... 
      } else if (key.equals("reference_devices") && reader.peek() != JsonToken.NULL) {
        reference_devices = readReferenceDevices(reader);
      } else {
        System.err.println("Unknown key: "+key + " (or composite hasn't body)");
        reader.skipValue();
      }
    }    
    reader.endObject();
    return new Location(address, id, info, name, reference_devices);
  }
  
  /* readers for each composite type*/   
  public Address readAddress(JsonReader reader) throws IOException {
    String city = null;
    Number latitude = null;
    String street = null;
    Number longitude = null;
    
    reader.beginObject();
    while (reader.hasNext()) {
      String key = reader.nextName();
      if (key.equals("city")) {
        city = reader.nextString();
      } else if (key.equals("latitude")) {
        latitude = reader.nextDouble();
      } else if (key.equals("street")) {
        street = reader.nextString();
      } else if (key.equals("longitude")) {
        longitude = reader.nextDouble();
      } else {
        System.err.println("Building Address: Unknown key: "+key);
        reader.skipValue();
      }
    }
    reader.endObject();
    return new Address(city,latitude,street,longitude);
  }
  
  public Info readInfo(JsonReader reader) throws IOException {
    String activity = null;
    Number summertemp = null;
    Number surface = null;
    Number wintertemp = null;
    
    reader.beginObject();
    while (reader.hasNext()) {
      String key = reader.nextName();
      if (key.equals("activity")) {
        activity = reader.nextString();
      } else if (key.equals("summertemp")) {
        summertemp = reader.nextDouble();
      } else if (key.equals("surface")) {
        surface = reader.nextDouble();
      } else if (key.equals("wintertemp")) {
        wintertemp = reader.nextDouble();        
      } else {
        System.err.println("Building Info: Unknown key: "+key);
        reader.skipValue();
      }
    }
    reader.endObject();
    return new Info(activity, summertemp, surface, wintertemp);
  }
  public Reference_devices readReferenceDevices(JsonReader reader) throws IOException {
    Number fridge = null;
    Number hvac = null;
    Number lightning = null;
    Number main = null;
    Number otemp = null;
    
    reader.beginObject();
    while (reader.hasNext()) {
      String key = reader.nextName();
      if (key.equals("fridge")) {
        fridge = reader.nextDouble();
      } else if (key.equals("hvac")) {
        hvac = reader.nextDouble();
      } else if (key.equals("lighting")) {
        lightning = reader.nextDouble();
      } else if (key.equals("main")) {
        main = reader.nextDouble();
      } else if (key.equals("otemp")) {
        otemp = reader.nextDouble();   
      } else {
        System.err.println("Building Info: Unknown key: "+key);
        reader.skipValue();
      }
    }
    reader.endObject();
    return new Reference_devices(fridge, hvac, lightning, main, otemp);
  }
}