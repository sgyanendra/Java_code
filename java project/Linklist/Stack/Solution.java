class Solution {
    public static int jump(int[] nums) {

     int arr[]=new int[nums.length];
     
     for(int i=0;i<nums.length;i++){
       arr[i]=Integer.MAX_VALUE;
     }
     arr[0]=0;
     for(int i=0;i<nums.length;i++){
         int r=nums[i];
         for(int j=1;j<=r;j++){
              if((i+j)<nums.length){
                 arr[i+j]=Math.min(arr[i+j],arr[i]+1);
              }
         }
     }
     return arr[nums.length-1];
}

public static void main(String arf[]){
 int nums[]={2,3,1,1,4};
 System.out.println(jump(nums));
}
}
