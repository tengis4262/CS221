package W3L1.Assignment;

public class SumOfNum {
    public static int sumNum(int num){
        if(num<0){
            throw new IllegalArgumentException();
        }
        if(num == 0){
            return 0;
        }else
            return num + sumNum(num-1);
    }

    public static void main(String[] args) {
        System.out.println(sumNum(5));
    }
}
