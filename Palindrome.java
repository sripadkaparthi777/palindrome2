public class Palindrome {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a word to check!");
            return;
        }
        String word = args[0];
        if (isPalindrome(word)) {
            System.out.printlnx(word + " is a palindrome!");
        } else {
            System.out.println(word + " is NOT a palindrome!");
        }
    }
    public static boolean isPalindrome(String str) {
        String reversed = nexw StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
