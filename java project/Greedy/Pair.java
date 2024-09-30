package Greedy;
import java.util.*;
public class Pair {
 public static void main(String[] args) {
    int pair[][]={{20,20},{10,40},{45,46},{50,59},{60,90}};
    Arrays.sort(pair,Comparator.comparingDouble(o->o[1]));
    int c=0;
    int lst=pair[0][1];
    for(int i=1;i<pair.length;i++){
        if(pair[i][0]>lst){
          c++;
        }
        lst=pair[i][1];
    }
   System.out.println("max pair:"+c);
 }    
}
