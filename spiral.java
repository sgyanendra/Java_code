import java.util.*;
class spiral{

    public static void printArr(int num[][]){
        int startRow=0;
        int startCol=0;
        int endRow=num.length-1;
        int endCol=num.length-1;
  while(startRow<=endRow && startCol<=endCol){
    //top
        for(int i=startCol;i<=endCol;i++){
          System.out.print(num[startRow][i]+" ");
        }
        //left
        for(int i=startRow+1;i<=endRow;i++){
          if(startCol==endCol){
            break;
          }
          System.out.print(num[i][startCol]+" ");
        }
        //right
        for(int i=startRow+1; i<=endRow;i++){
          System.out.print(num[i][endCol]+" ");
        }
        //bottom
        for(int i=endCol-1;i>=startCol+1;i--){
           if(startRow==startCol){
             break;
           }
          System.out.print(num[endRow][i]+" ");
        }
        startRow++;
        startCol++;
        endCol--;
        endRow--;
        System.out.println();
    }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[][]={
          {1,2,3,4},
          {5,6,7,8},
          {9,10,11,12},
          {13,14,15,16}
        };
       /* System.out.println("Enter the Number!!");
        for(int i=0;i<4;i++){
          for(int j=0;j<4;j++){
            num[i][j]=sc.nextInt();
          }
        }*/
       printArr(num);
    }
}