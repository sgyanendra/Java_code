import java.util.*;
class spiral{

    public static void printArr(int num[][]){
        int startRow=0;
        int startCol=0;
        int endRow=num.length-1;
        int endCol=num.length-1;

        for(int i=startCol;i<=endCol;i++){
          System.out.print(num[startRow][i]+" ");
        }
        for(int i=startRow+1;i<=endRow;i++){
          System.out.print(num[i][startCol]+" ");
        }
        
        for(int i=startCol+1; i<=endCol;i++){
          System.out.print(num[endRow][i]+" ");
        }
        for(int i=startRow+1;i<=endCol-1;i++){
          System.out.print(num[i][startCol]+" ");
        }
        startRow++;
        startCol++;
        endCol--;
        endRow--;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[][]=new int[4][4];
        System.out.println("Enter the Number!!");
        for(int i=0;i<4;i++){
          for(int j=0;j<4;j++){
            num[i][j]=sc.nextInt();
          }
        }
       printArr(num);
    }
}