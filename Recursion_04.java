// sum of given n digits
public class Recursion_04 {
    static void sum(int i,int n){
        if(i<1){
            System.out.println(n);
            return;
        }
       sum(i-1,n+i);
    }
  public static void main(String[] args) {
      int n = 5;
      sum(5,0);
  }  
}
