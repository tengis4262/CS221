package W2L2.Assignment;

public class Palindrome2 {

    String input;

    public Palindrome2(String input){
        this.input = input;
    }

    public boolean isPalindrome() {
        int n = input.length();
        for (int i = 0; i < n/2; i++) {
            System.out.println(i + " " + (n-1-i));
        }
        for (int i = 0; i < n / 2; i++) {
            if (input.charAt(i) != input.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome2 pal = new Palindrome2("Madame");
        Palindrome2 pa2 = new Palindrome2("MadaM");

        System.out.println(pal.isPalindrome());
        System.out.println(pa2.isPalindrome());
    }
}
