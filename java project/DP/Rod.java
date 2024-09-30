package DP;

public class Rod {

   public static int findPrice(int length[],int price[],int rodLength){
     int n=length.length;
     int dp[][]=new int[n+1][rodLength+1];
     for(int i=0;i<n+1;i++){
       for(int j=0;j<rodLength+1;j++){
           if(i==0 || j==0){
            dp[i][j]=0;
           }else if(length[i-1]<=j){
             dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
           }else{
            dp[i][j]=dp[i-1][j];
           }
       }
     }
     return dp[n][rodLength];
   }
   public static void main(String[] args) {
    int price[]={1,5,8,9,10,17,17,20};
    int length[]={1,2,3,4,5,6,7,8};
    int rodLength=9;
    System.out.println(findPrice(length,price,rodLength));
   }    
}
