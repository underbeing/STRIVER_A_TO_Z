//print from 1 to N
public class Recursion_02 {
    static void linear(int i, int n) {  // Change return type to void
        if (i > n) {  
            return;  // Stop recursion
        }
        System.out.println(i);  // Print i
        linear(i + 1, n);  // Recursive call with i incremented
    }

    public static void main(String[] args) {
        linear(1, 10);
    }
}