package W3L1.Classwork;

public class Recursion {
    public static void CountDown(int x){
        if(x<=0){
            System.out.println("Stopped");
        }else {
            System.out.println(x);
            CountDown(x-1);
        }
    }

    public static int power(int num, int exp){
        if(exp==0){
            return 1;
        }else
            return num * power(num,exp-1);
    }

    // Greatest common division
    public static int gcd(int m, int n){
        if(m % n ==0){
            return n;
        } else if (m<n) {
            return gcd(n,m);
        }else
            return gcd(n,m % n);
    }

    public static int factorial(int N){
        if(N<0){
            throw new IllegalArgumentException();
        }
        if(N==0){
            return 1;
        }else
            return N * factorial(N-1);
    }

    public static void printChar(String s){
        if(s==null || s.equals("")){
            return;
        }else
            System.out.print(s.charAt(0)+" ");
        printChar(s.substring(1));
    }
    public static void reverseString(String s){
        if(s==null || s.equals("")){
            return;
        }else
            System.out.print(s.charAt(s.length()-1) + " ");
        reverseString(s.substring(0,s.length()-1));
    }
    public static void reverseString2(String str)
    {
        if (str.isEmpty())
            return ;
        //Calling Function Recursively
        reverseString2(str.substring(1));
        System.out.print(str.charAt(0) + " ");
    }

    // Fibonacci sequence

    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }



    public static void main(String[] args) {
        CountDown(5);
        System.out.println(power(3,4));
        System.out.println(factorial(4));
        printChar("Java");
        System.out.println();
        reverseString("JAVA");
        System.out.println();
        reverseString2("Java");
        System.out.println();
        System.out.println(gcd(152,4));

        System.out.println(fibonacci(9));
    }
}
