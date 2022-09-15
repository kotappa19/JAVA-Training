import java.io.ObjectInputFilter;
import java.util.*;
public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(10, "Kotappa");
        ht.put(20, "Adam");
        ht.put(30, "Karthik");
        ht.put(40, "Jayanth");
        ht.put(50, "Vinayak");
        ht.put(60, "Girish");
        System.out.println(ht.keySet());
        System.out.println(ht.values());
        System.out.println(ht.containsKey(10));
        System.out.println(ht.get(10));
        System.out.println(ht.containsValue("Kotappa"));
        ht.remove(60);
        System.out.println(ht.entrySet());
        System.out.println(ht);


        // Converting Primitive Integer value to non-Primitive Integer
        int i=10;
        Integer obj=Integer.valueOf(i);
        System.out.println(obj);
        int j=obj.intValue();
        System.out.println(j);
    }
}
