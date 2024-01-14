class findNumber{

    public static void find(String st){
        int f=1;
        for(int i=0;i<st.length();i++){
            if(i==0){
              System.out.print(st.charAt(0));
            }
            else if(st.charAt(i)==st.charAt(i-1)){
               f++;
               i++;
           }
          /* else if(f!=1){
                 System.out.print(f);
                 f=1;
               }*/
            else{
                System.out.print(st.charAt(i));
            }
        }
    }
    public static void main(String arg[]){
      String st="aaabbcd";
      find(st);
    }
}