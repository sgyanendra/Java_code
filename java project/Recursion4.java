public class Recursion4 {
   public static int tilingProblem(int n){
      if(n==0 || n==1){
          return 1;
      }
      return tilingProblem(n-1)+tilingProblem(n-2);
   }

   public static void removeDupplicate(String str,int idx,StringBuilder newStr,boolean map[]){
         if(idx==str.length()){
          System.out.println(newStr);
          return;
         }
         char currChar=str.charAt(idx);
         if(map[currChar-'a']==true){
           removeDupplicate(str, idx+1, newStr,map);
         }
         else{
            map[currChar-'a']=true;
            removeDupplicate(str, idx+1, newStr.append(currChar),map);
         }
    }
    public static void main(String arg[]){
    //System.out.println(tilingProblem(5));
    String str="appanaCoolege";
    removeDupplicate(str, 0,new StringBuilder(""),new boolean[25]);
   }
    
}
