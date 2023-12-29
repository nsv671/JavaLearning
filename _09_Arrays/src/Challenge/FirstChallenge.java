package Challenge;

import java.util.Arrays;
import java.util.Random;

public class FirstChallenge {
    public static void main(String[] args) {
        int[] firstArray = randomArray(5);
//        int[] secondArray = Arrays.copyOf(firstArray, firstArray.length);
        int[] sortedArray = sortInteger(firstArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(sortedArray));

//        Arrays.sort(firstArray);
//        for(int i= firstArray.length-1; i>=0; i--){
//            secondArray[i] = firstArray[firstArray.length - i-1];
//        }
//        System.out.println(Arrays.toString(secondArray));
    }

    private static int[] randomArray(int length){
        Random random = new Random();
        int[] array = new int[length];
        for(int i=0; i<length; i++){
            array[i] = random.nextInt(1000);
        }

        return array;
    }

    private static int[] sortInteger(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);

        Arrays.sort(sortedArray);
        for(int i=0; i<sortedArray.length/2; i++){
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length-1-i];
            sortedArray[sortedArray.length-1-i] = temp;
        }

        return sortedArray;
    }
}

