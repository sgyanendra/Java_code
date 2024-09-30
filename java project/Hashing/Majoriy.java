package Hashing;
import java.util.*;

public class Majoriy {
   public static void main(String[] args) {
    int arr[]={1,3,2,5,1,3,5,5,5};
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
       if(map.containsKey(arr[i])){
         map.put(arr[i],map.get(arr[i])+1);
       }else{
        map.put(arr[i],1);
       }
    }
    Set<Integer> key=map.keySet();
    for (Integer i : key) {
        if(map.get(i)>arr.length/3){
          System.out.println(i);
        }
    }
   }    
}
