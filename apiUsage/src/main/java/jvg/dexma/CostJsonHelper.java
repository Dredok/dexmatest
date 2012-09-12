package jvg.dexma;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;

public class CostJsonHelper {
      
  public Cost readCost(String in) throws IOException {
    JsonReader reader = new JsonReader(new StringReader(in));
    try {
      return readCost(reader);
    } finally {
      reader.close();
    }
  }

  /*Fills the costs*/
  public Cost readCost(JsonReader reader) throws IOException {
    List<CostReadings> readings = null;
    List<Periods> periods = null;
       
    reader.beginObject();
    while (reader.hasNext()) {
      
      String key = reader.nextName();
      
      //responsability of creating a CostReadings belongs to this helper... 
      if (key.equals("readings") && reader.peek() != JsonToken.NULL) {
        readings = readListReadings(reader);
      //responsability of creating a Periods belongs to this helper... 
      } else if (key.equals("periods") && reader.peek() != JsonToken.NULL) {
        periods = readListPeriods(reader);   
      } else {
        System.err.println("Unknown key: "+key + " (or composite hasn't body)");
        reader.skipValue();
      }
    }    
    reader.endObject();
    return new Cost(periods,readings);
  }
  
  
  /* readers for each composite type*/
  public List<CostReadings> readListReadings(JsonReader reader) throws IOException {
    List<CostReadings> costReadings = new ArrayList<CostReadings>();
    reader.beginArray();
    
    while (reader.hasNext()) {
      costReadings.add(readReadings(reader));
    }
    reader.endArray();
    return costReadings;
  }    
  
  public CostReadings readReadings(JsonReader reader) throws IOException {
    Number period = null;
    Number cost = null;
    Number energy = null;
    String ts = null;
    
    
    reader.beginObject();
    while (reader.hasNext()) {
      String key = reader.nextName();
      if (key.equals("period")) {
        period = reader.nextLong();
      } else if (key.equals("energy")) {
        energy = reader.nextDouble();      
      } else if (key.equals("cost")) {
        cost = reader.nextDouble();
      } else if (key.equals("ts")) {
        ts = reader.nextString();        
      } else {
        System.err.println("Building CostReadings: Unknown key: "+key);
        reader.skipValue();
      }
    }
    reader.endObject();
    return new CostReadings(cost, energy, period, ts);
  }  
  
  public List<Periods> readListPeriods(JsonReader reader) throws IOException {
    List<Periods> periods = new ArrayList<Periods>();
    reader.beginArray();
    
    while (reader.hasNext()) {
      periods.add(readPeriods(reader));
    }
    reader.endArray();
    return periods;
  }    
  
  public Periods readPeriods(JsonReader reader) throws IOException {
    String currency = null;
    String id = null;
    String name = null;
    Number pricekWh = null;
    
    
    
    reader.beginObject();
    while (reader.hasNext()) {
      String key = reader.nextName();
      if (key.equals("currency")) {
        currency = reader.nextString();
      } else if (key.equals("id")) {
        id = reader.nextString();      
      } else if (key.equals("name")) {
        name = reader.nextString();
      } else if (key.equals("pricekWh")) {
        pricekWh = reader.nextDouble();        
      } else {
        System.err.println("Building Periods: Unknown key: "+key);
        reader.skipValue();
      }
    }
    reader.endObject();
    return new Periods(currency, id, name, pricekWh);
  }
}