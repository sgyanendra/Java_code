package Hashing;
import java.util.*;
public class ClassRoom {
 public static void main(String[] args) {
    int arr[]={7,3,9};
    int arr1[]={6,3,9,2,9,4};
    HashSet<Integer> hs=new HashSet<>();
    for(int i=0;i<arr.length;i++){
       hs.add(arr[i]);
    }
    for(int i=0;i<arr1.length;i++){
        hs.add(arr1[i]);
     }
    System.out.println("Union Number:"+hs);
    hs.clear();
    for(int i=0;i<arr.length;i++){
        hs.add(arr[i]);
     }
    //  System.out.println(hs);
     HashSet<Integer> hs1=new HashSet<>();
     for(int i=0;i<arr1.length;i++){
        if(hs.contains(arr1[i])){
           hs1.add(arr1[i]);
        }
     }
     System.out.println("Intersection"+hs1);
 }
}