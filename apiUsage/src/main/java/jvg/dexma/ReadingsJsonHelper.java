package jvg.dexma;

//TODO need some JUnit test
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.stream.JsonReader;

public class ReadingsJsonHelper {
  
  public List<Readings> readJsonStream(String in) throws IOException {
    JsonReader reader = new JsonReader(new StringReader(in));
    try {
      return readReadingsArray(reader);
    } finally {
      reader.close();
    }    
  }
    
  public List<Readings> readReadingsArray(JsonReader reader) throws IOException {
    List<Readings> listReadings = new ArrayList<Readings>();

    reader.beginArray();
    while (reader.hasNext()) {
      listReadings.add(readReadings(reader));
    }
    reader.endArray();
    return listReadings;
  }
  
  public Readings readReadings(String in) throws IOException {
    JsonReader reader = new JsonReader(new StringReader(in));
    try {
      return readReadings(reader);
    } finally {
      reader.close();
    }
  }

  /*Fills the locations*/
  public Readings readReadings(JsonReader reader) throws IOException {    
    Number value = null;
    String seqnum = null;
    String ts = null;
    String tsutc = null;
    String units = null;
    
       
    reader.beginObject();
    
    while (reader.hasNext()) {
      
      String key = reader.nextName();
      if (key.equals("value")) {
        value = reader.nextDouble();
      } else if (key.equals("seqnum")) {
        seqnum = reader.nextString();
      } else if (key.equals("ts")) {
        ts = reader.nextString();      
      } else if (key.equals("tsutc")) {
        tsutc = reader.nextString();
      } else if (key.equals("units")) {
        units = reader.nextString();        
      } else {
        System.err.println("Unknown key: "+key + " (or composite hasn't body)");
        reader.skipValue();
      }
    }    
    reader.endObject();
    return new Readings (seqnum, ts, tsutc, units, value);
  }  
}