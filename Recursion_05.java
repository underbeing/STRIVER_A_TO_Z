// sum of n numbers
public class Recursion_05 {
   public static void main(String[] args) {
    sum(3,0);
   System.out.println( sum1(3));
   } 
   static void sum(int i , int sum){
    if(i<1){
        System.out.println(sum);
        return;
    }
    sum(i-1, sum+i);
   }
   static int sum1(int n ){
    if (n==0){
        return 0;
    }
    return n+sum1(n-1);
   }
}
