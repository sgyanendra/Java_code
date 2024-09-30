class len{
    public static int count(String str){
       if(str.equals("")){
         return 0;
       }
       else{
        return 1+count(str.substring(1));
       }
    }
    public static void main(String arg[]){
     String str="Hello Java How Are you";
     System.out.println(count(str));
     System.out.println(str.substring(1));
    }
}