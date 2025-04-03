public class PalindromeNumber {
        public static boolean isPalindrome(int x) {
            // A negative number is not a palindrome
            if (x < 0) {
                return false;
            }

            // Convert the number to a string
            String originalStr = Integer.toString(x);

            // Reverse the string
            String reversedStr = new StringBuilder(originalStr).reverse().toString();

            // Compare the original string with the reversed string
            return originalStr.equals(reversedStr);
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println(isPalindrome(121));  // Output: true
            
        }

}
