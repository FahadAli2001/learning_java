
public class methods {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int c;
        c = sum(5, 6);
        System.out.println(c);
    }

    static int sum(int a, int b) {
        int z;
        if (a > b) {
            z = a + b;
        } else {
            z = (a + b) * 5;
        }
        return z;
    }
}
