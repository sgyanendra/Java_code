/*public class Rec2 {
    public static int convert(int n){
       String str="";
        if(n<10){
            //System.out.println("Dfg");
        return n;
       }
       int r;
       r=n%10;
       
    if(n>0){  
       if(r==0){
        str+="zero";
       }
       else if(r==1){
         str+="one";
       }
       else if(r==2){
        str+="two";
      }
      else if(r==3){
        str+="three";
      }
      else if(r==4){
        str+="four";
      }
      else if(r==5){
        str+="five";
      }
      else if(r==6){
        str+="six";
      }
      else if(r==7){
        str+="seven";
      }
      else if(r==8){
        str+="eight";
      }
      else if(r==9){
        str+="nine";
      }
     return convert(n/10);
    }
    else{
        System.out.println(str);
    }
    return 0;
}
    public static void main(String arg[]){
      convert(2019);
    }
}*/

public class Rec2 {

    private static final String[] digitWords = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

    public static String numberToWords(int n) {
        // Base case: If the number is a single digit, return its word representation
        if (n < 10) {
            return digitWords[n];
        }

        // Recursive case: Convert the number to words by converting the last digit and recursively calling the function
        int lastDigit = n % 10;
        int remainingDigits = n / 10;
        return numberToWords(remainingDigits) + " " + digitWords[lastDigit];
    }

    public static void main(String[] args) {
        int number = 2019;
        String result = numberToWords(number);
        System.out.println(result);
    }
}

