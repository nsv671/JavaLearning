package Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class MiniumElementChallenge {
    public static void main(String[] args) {
        String string = "1,5,3,6,7,8,9,4";
        int[] intArray = readIntegers();

        int minium = minValue(intArray);

        System.out.println("minimum value = "+ minium);
    }

    private static int[] readIntegers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of integers, separated by comma: ");
        String string = sc.nextLine();
        String[] stringsArray = string.split(",");
        int[] intArray = new int[stringsArray.length];
        for(int i=0; i< stringsArray.length; i++){
            intArray[i] = Integer.parseInt(stringsArray[i].trim());
        }

        return intArray;
    }

    private static int minValue(int... integer){
        int[] integerArray = Arrays.copyOf(integer, integer.length);
        Arrays.sort(integerArray);

        return integerArray[0];
    }
}
