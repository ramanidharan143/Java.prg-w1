import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[4];
        System.out.println("Enter 4 numbers:");
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println("Numbers in descending order:");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}
