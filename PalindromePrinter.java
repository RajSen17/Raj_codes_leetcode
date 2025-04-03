import java.util.Scanner;

public class PalindromePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range (start end): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
       System.out.println("Palindrome numbers within the range " + start + " to " + end + " are:");
       printPalindromes(start, end);
    }

    public static void printPalindromes(int start, int end) {
       for (int i = start; i <= end; i++) {
           if (isPalindrome(i)) {
               System.out.println(i);
            }
      }
    }

    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return original == reverse;
    }
}
