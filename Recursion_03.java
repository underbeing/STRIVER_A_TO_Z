/// print in opposite order
public class Recursion_03 {
    static void reverse(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        reverse(i-1, n);
    }
    public static void main(String[] args) {
        reverse(5,5);
    }
}
