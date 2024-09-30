import java.util.ArrayList;

public class arrList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // list.add(0,90);

        // int a=list.get(1);
        // System.out.println(a);
        // list.remove(3);
        list.set(0, 9);
        System.out.println(list.contains(1));
      System.out.println(list);
    }
}
