import java.util.Arrays;
import java.util.Random;

public class RandomArrayElement {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        System.out.println();
        int[] secondArray = getRandomArray(10);
        int[] thirdArray = Arrays.copyOf(secondArray,secondArray.length);
        Arrays.sort(thirdArray);
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(thirdArray));

        int[] smallArray = Arrays.copyOf(secondArray, 5);
        int[] largeArray = Arrays.copyOf(secondArray, 15);
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(smallArray));
        System.out.println(Arrays.toString(largeArray));


        String[] stringArray = {"nitesh","mukesh","bijay","anita"};
        Arrays.sort(stringArray);
        if(Arrays.binarySearch(stringArray, "nitesh") >=0){
            System.out.println("Element present in the array");
        }else{
            System.out.println("Element is present in the array");
        }

        int[] integer1 = {1,2,3,3,5,};
        int[] integer2 = {5,2,3,3,1};

        if(Arrays.equals(integer1, integer2)){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");

        }
    }

    private static int[] getRandomArray(int length){
        Random random = new Random();
        int[] array = new int[length];

        for(int i=0; i<length; i++){
            array[i] = random.nextInt(100);
        }

        return array;
    }
}
