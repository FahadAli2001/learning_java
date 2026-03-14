public class recursion {
     public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(factorial(5));
    }


    static int factorial(int n){
        if (n ==0 || n ==1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
