package MapMethods;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class PutMethod {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<String, Integer>() ;
        map.put("B",11);
        map.put(null,13);
        map.put("D",null);
        map.put(null,null);
    }
}
