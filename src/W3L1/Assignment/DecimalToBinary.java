package W3L1.Assignment;

public class DecimalToBinary {
    public static void decToBin(int input){
        if(input<=0){
            return;
        }else
            System.out.print(input%2);
        decToBin(input/2);
    }

    public static void main(String[] args) {
        decToBin(10);
    }
}
