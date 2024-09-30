package DP;
import java.util.*;
public class Increasing {
    public static int find(int arr[]){
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
          set.add(arr[i]);
        }
        int arr1[]=new int[set.size()];
        int k=0;
        for(int num:set){
           arr1[k]=num;
           k++;
        }
        Arrays.sort(arr1);
        int m=arr1.length;
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
          for(int j=1;j<m+1;j++){
            if(arr[i-1]==arr1[j-1]){
               dp[i][j]=dp[i-1][j-1]+1;
             }else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
             }
         }
        }
        return dp[n][m];
    }
    public static void main(String arg[]){
     int arr[]={50,3,10,7,40,80};
     System.out.println(find(arr));
    }
}
