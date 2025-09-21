import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        
        // handle negative numbers
        num = Math.abs(num);

        int count = 0;
        if (num == 0) {
            count = 1; // special case: 0 has 1 digit
        } else {
            while (num > 0) {
                num = num / 10;
                count++
