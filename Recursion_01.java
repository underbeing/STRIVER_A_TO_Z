// Print name N times
public class Recursion_01 {
    static  int fun(int i,int n){
        if(i>n){
            return i;
        }   
        System.out.println("saroj");
                return fun(i+1, n);
        
    }
    public static void main(String[] args) {
        int i = 5;
        fun(1,i);
    }
}
