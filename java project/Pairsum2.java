import java.util.ArrayList;
import java.util.Scanner;

public class Pairsum2 {
    public static boolean pair2(ArrayList<Integer> list,int target){
        int bp=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
           if(list.get(i)>list.get(i+1)){
             bp=i;
             break;
           }
        }
        int lp=bp+1;
        int rp=bp;
        while (lp!=rp) {
             if(list.get(lp)+list.get(rp)==target){
                 return true;
             }
             if(list.get(lp)+list.get(rp)<target){
               lp=(lp+1)%n;
             }
             else{
                 rp=(n+rp-1)%n;
             }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<6;i++){
             list.add(sc.nextInt());
        }

        System.out.println(pair2(list,16));
    }
}
