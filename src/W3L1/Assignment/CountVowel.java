package W3L1.Assignment;

public class CountVowel {
    public static int count(String str, int i){
        String low = str.toLowerCase();
        if(i==str.length()){
            return 0;
        }
        if(low.charAt(i)=='a'||low.charAt(i)=='e'||low.charAt(i)=='i'||low.charAt(i)=='o' || low.charAt(0) == 'u'){
            return 1+count(str,i+1);
        }else{
            return count(str,i+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(count("JAva is an Object orientEd programm",0));
    }
}
