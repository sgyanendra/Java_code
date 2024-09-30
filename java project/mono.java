import java.util.ArrayList;
import java.util.Scanner;

public class mono {

    public static boolean find(ArrayList<Integer> list){
    //  int lp=0,rp=list.size();
     int a=0,d=0;
     for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<=list.get(i+1)){
              a++;
            }
            if(list.get(i)>=list.get(i+1)){
               d++;
            }
      }
      if(a==list.size()-1){
        return true;
      }
      else if(d==list.size()-1){
        return true;
      }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            list.add(sc.nextInt());
        }
       System.out.println(find(list));
    }
}
