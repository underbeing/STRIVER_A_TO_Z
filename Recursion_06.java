public class Recursion_06 {
    public static void main(String[] args) {
    System.out.println( sum1(5));
    }
    static int sum1(int n ){
     if (n==0){
         return 1;
     }
     return n*sum1(n-1);
    }
 }