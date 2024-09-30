import java.util.ArrayList;

public class mulList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> manilist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=1;i<=5;i++){
          list1.add(i*1);
          list2.add(i*2);
          list3.add(i*3);
        }
        manilist.add(list1);
        manilist.add(list2);
        manilist.add(list3);

        System.out.println(manilist);

        for(int i=0;i<manilist.size();i++){
           ArrayList<Integer> curr=manilist.get(i);
           for(int j=0;j<curr.size();j++){
              System.out.print(curr.get(j)+" ");
           }
          System.out.println();
        }
    }
}
