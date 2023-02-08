package W3L5.Assignment;

public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[1] = 5;
        arr[3] = 6;
        arr[4] = 3;
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int[]arr1 = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr = arr1;
        System.out.println("=================");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
