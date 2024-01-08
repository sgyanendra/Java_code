class duplicateArray{
    
     public static boolean containDuplicate(int[] num){
      for(int i=0;i<num.length;i++){
        for(int j=i+1;j<num.length;j++){
          if(num[i]==num[j]){
            return true;
          }
        }
      }
      return false;
     }
    public static void main(String args[]){
     int num[]={2,4,5,6,7,3};
     if(containDuplicate(num)){
       System.out.println("True");
     }
     else{
        System.out.println("False");
     }
    }
}