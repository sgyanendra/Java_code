package Hashing;

import java.util.HashMap;

public class SubArray {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        int sum=0;
        int len=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
          sum+=arr[i];
          if(map.containsKey(sum)){
            len=i-map.get(sum);
          }else{
            map.put(sum, i);
          }
        }
        System.out.println("Largest SubArray: "+len);
    }
}
