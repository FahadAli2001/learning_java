
import java.util.Scanner;

public class scanners {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // taking input from keyboard
        String scanned = sc.next(); // .next take string
        // int scanned1 = sc.nextInt(); // for int
        // int a = Integer.parseInt(scanned); //type casting
        System.out.println(scanned);
        // System.err.println(scanned1);

        if (scanned.equals("fahad")) {
            System.out.println("you typed fahad");
        }
    }
}
