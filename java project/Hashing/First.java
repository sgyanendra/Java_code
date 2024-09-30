package Hashing;
import java.util.*;
public class First {
   public static void main(String[] args) {
    HashMap<String,Integer> hm=new HashMap<>();
    hm.put("India",100);
    hm.put("China",150);
    hm.put("Japan",190);
    hm.put("USA",120);
    System.out.println(hm);  

    Set<String> keys=hm.keySet();
    System.out.println(keys);

    for (String k : keys) {
        System.out.println(hm.get(k));
    }
 }  
}