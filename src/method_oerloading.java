
public class method_oerloading {
    // same method with different parameters

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int result1 = sum(2, 3, 5);
        System.out.println(result1);
    }
}
