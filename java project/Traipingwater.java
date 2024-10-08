import java.util.ArrayList;

public class Traipingwater {
    
    // public static int scopewater(ArrayList<Integer> height){
    //     int max=0;
    //     for(int i=0;i<height.size();i++){
    //         for(int j=i+1;j<height.size();j++){
    //           int min=Math.min(height.get(i),height.get(j));
    //           int width=j-i;
    //           int curr=width*min;
    //           max=Math.max(max, curr);
    //         }
    //     }
    //     return max;
    // }

    public static int  scopewater(ArrayList<Integer> height){
         int max=0;
         int lp=0;
         int rp=height.size()-1;
         while(lp<rp){
            int min=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int curr=min*width;
            max=Math.max(max, curr);

            if(height.get(lp)<height.get(rp)){
                  lp++;
            }
            else{
                rp--;
            }
         }
         return max;
    }
     public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(scopewater(height));

     }
}
