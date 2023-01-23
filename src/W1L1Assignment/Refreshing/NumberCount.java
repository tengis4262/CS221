package W1L1Assignment.Refreshing;

public class NumberCount {
    int input, even, odd, zero;

    public NumberCount(){

    }
    public void numSort(int input){
        while(input>0) {
            if(input%2==0){
                even++;
//            else
                odd++;
            }
            input = input / 10;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number");
    }
}
