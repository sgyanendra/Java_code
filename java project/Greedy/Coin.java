package Greedy;

public class Coin {
    public static void main(String[] args) {
        int coin[]={2000,500,200,100,50,20,10,5,2,1};
        int c=0;
        int val=500;
        for(int i=0;i<coin.length;i++){
           if(coin[i]<=val){
              c++;
              val=val-coin[i];
           }
        }
        System.out.println("Total coins:"+c);
    }
}
