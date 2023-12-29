package Challenge;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String... args) {
        reverse(2,5,9,4,8,6,1,78,8,6,4,3);

        System.out.println(Arrays.toString(reverseArrayCopy(2,5,9,4,8,6,1,78,8,6,4,3)));
    }

    private static void reverse(int... array){
//        int[] intArray = array;
        System.out.println(Arrays.toString(array));

        int length = array.length;
        int temp;
        for(int i=0; i< length/2; i++){
            temp = array[i];
            array[i] = array[length-i-1];
            array[length-i-1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    private static int[] reverseArrayCopy(int... integerArray){
        int length = integerArray.length;
        int[] reverseArray = new int[length];

        for(int element : integerArray){
            reverseArray[--length] = element;
        }

        return reverseArray;
    }
}
