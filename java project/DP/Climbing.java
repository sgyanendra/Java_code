package DP;

import java.util.*;

public class Climbing {
    public static int countRec(int n){
        if(n==0 || n==1){
           return 1;
        }
        return countRec(n-1)+countRec(n-2);
    }
    public static int countMem(int n,int ways[]){
        if(n==0){
           return 1;
        }
        if(n<0){
          return 0;
        }
        if(ways[n]!=-1){
          return ways[n];
        }
         ways[n]=countMem(n-1,ways)+countMem(n-2,ways);
         return ways[n];
    }
    public static int countTab(int n){
        int arr[]=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++){
           arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
     public static void main(String arg[]){
        int n=5;
        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countRec(9));
        System.out.println(countMem(n,ways));
        System.out.println(countTab(n));
    }
}
