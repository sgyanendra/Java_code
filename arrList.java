import java.util.*;
class arrList{

    public static  List<List<Integer>> find(int num[]){
      List<List<Integer>> result=new ArrayList<List<Integer>>();
      for(int i=0;i<num.length;i++){
        for(int j=i+1;j<num.length;j++){
           for(int k=j+1;k<num.length;k++){
             List<Integer> tp=new ArrayList<Integer>();
              if(num[i]+num[j]+num[k]==0){
                  tp.add(num[i]);
                  tp.add(num[j]);
                  tp.add(num[k]);
                  Collections.sort(tp);
                  result.add(tp);
              }
           }
        }
      }
       result=new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
       //System.out.println(result);
       return result;
    }
    public static void main(String agr[]){
        int num[]={2,2,-4,5};
        List<List<Integer>> r=new ArrayList<List<Integer>>();
        r=find(num);
        System.out.println(r);
    }
}