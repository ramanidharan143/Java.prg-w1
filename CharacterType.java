import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an Alphabet.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit.");
        } else if (Character.isWhitespace(ch)) {
            System.out.println("It is a Whitespace character.");
        } else {
            System.out.println(ch + " is a Special Symbol.");
        }
        sc.
