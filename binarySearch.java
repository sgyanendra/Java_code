import java.util.*;
class binarySearch{
    public static boolean search(int num[],int target){
        int l=0,h=num.length-1;
        while(h>=l){
            int mid=l+(h-l)/2;
            if(num[mid]==target){
              return true;
            }
            if(num[mid]<target){
              l=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int num[]=new int[10];
        int t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Element!!!");
        for(int i=0;i<10;i++){
           num[i]=sc.nextInt();
        }
        System.out.println("Enter the Search Element!!");
        t=sc.nextInt();

        if(search(num,t)){
            System.out.println("Found!!!");
        }
        else{
            System.out.println("Not Found!!");
        }
    }
}