package W2L2.Assignment;

public class Palindrome {
    String input;

    public Palindrome (String input){
        this.input = input;
    }
    public String reverseString(){
        String str = "";
        char c;
        for (int i = 0; i <input.length(); i--) {
            str = str + input.charAt(i);
        }
        return str;
    }

    // checking is palindRome with reverse String method
    public boolean isPalindrome(){
        if(input.equalsIgnoreCase(reverseString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Palindrome pal = new Palindrome("Madam");

        System.out.println(pal.isPalindrome());
    }
}
