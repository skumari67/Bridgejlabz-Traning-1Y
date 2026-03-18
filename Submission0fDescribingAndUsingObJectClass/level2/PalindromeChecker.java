package level2;


class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String rev = new StringBuilder(text).reverse().toString();
        return text.equals(rev);
    }

    void display() {
        if (isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        p.text = "madam";
        p.display();
    }
}