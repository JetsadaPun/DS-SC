package SoftwareCon7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyClass {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("MemberID", "1");
        map.put("Name", "Weerachai");
        map.put("Tel", "0819876107");
        Iterator<String> Vmap = map.keySet().iterator();
        while (Vmap.hasNext()) {
            String key = (String) (Vmap.next()); // Key
            String val = map.get(key); // Value
            System.out.println(key + " = " + val);
        }
        map.clear();
    }
}
