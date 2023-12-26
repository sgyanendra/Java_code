class pat3{
    public static void main(String arg[]){
        for(int i=0;i<5;i++){
            for(int k=0;k<5-i;k++){
             System.out.print(" ");
            }
            for(int j=0;j<9;j++){
              System.out.print("*");
            }
            System.out.println();
        }

          for(int i=0;i<5;i++){
            for(int k=0;k<5-i;k++){
             System.out.print(" ");
            } 
            for(int j=0;j<9;j++){
                if(i==0 || i==4 || j==0 || j==8){
              System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
}