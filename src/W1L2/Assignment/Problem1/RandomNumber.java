package W1L2.Assignment.Problem1;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random ran = new Random();

    KWArrayListInt intArr = new KWArrayListInt();

        for (int i = 0; i < 50; i++) {
            intArr.add(ran.nextInt(101));
        }
        System.out.println("Array before testing behaviors");
        System.out.println(intArr);
        System.out.println("Size of an Array" + " [" + intArr.size() + "]");
        System.out.println("Getting value of an Array at index 3" + " [" + intArr.getIndexOf(3) + "]");
        intArr.removeDuplicates();
        System.out.println("Duplicates removed");
        int[] subArray = intArr.sublist(1,4);
        System.out.println(intArr);
        System.out.println("Substracting an another array from current array in range from index 1-4");
        for (int i = 0; i < subArray.length; i++) {
            System.out.print(subArray[i] + " ");
        }
        System.out.println();
        intArr.set(1,15);
        System.out.println("Setting Another value(15) at index 1");
        System.out.println(intArr);
        System.out.println("New size after testing all the behaviors");
        System.out.println(intArr.size());
        intArr.removeAll();
        System.out.println("All data removed from an Array\nNew size is now" );
        System.out.println(intArr.size());
    }
}
