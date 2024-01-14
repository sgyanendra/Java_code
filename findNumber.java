class findNumber{

    public static void find(String st){
        for(int i=0;i<st.length();i++){
            Integer f=1;
            while(i<st.length()-1 && st.charAt(i)==st.charAt(i+1)){
              f++;
              i++;
            }
            System.out.print(st.charAt(i));
            if(f>1){
                System.out.print(f);
            }
        }
        //System.out.println(st2);
    }
    public static void main(String arg[]){
      String st="aaabbcd";
      find(st);
    }
}