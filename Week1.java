import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer.");
            return;
        }
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
        sc.close();
    }
}
