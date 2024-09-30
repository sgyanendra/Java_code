import java.util.ArrayList;

public class most {
    public static int find(ArrayList<Integer> list,int key){
        int t=0;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==key){
               t=list.get(i+1);
               break;
            }
        }
        return t;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(find(list,2));
    }
}
