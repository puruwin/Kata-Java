import java.util.*;
import java.lang.*;
import java.io.*;

public class TrafficLights {

  public static String updateLight(String current) {
    Map <String, String> update_light = new HashMap <String, String> ();
    update_light.put("green", "yellow");
    update_light.put("yellow", "red");
    update_light.put("red", "green");
    return update_light.get(current);
  }
  
}
