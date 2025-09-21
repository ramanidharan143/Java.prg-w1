import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 3 and 5.");
        } else if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3 only.");
        } else if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5 only.");
        } else {
            System.out.println(num + " is not divisible by 3 or 5.");
        }
        sc.close();
    }
}
