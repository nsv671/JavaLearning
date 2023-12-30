import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        String[] originalArray = {"First","Second","Third"};

        // this list is mutable and not resizable
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("Original List  - "+ originalList);
        System.out.println("Original Array  - "+ Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("Original List  - "+ originalList);
        System.out.println("Original Array  - "+ Arrays.toString(originalArray));

        // will throw error during run time - UnsupportedOperationException
//        originalList.remove(0);
//        originalList.add("forth");

        // this list is immutable and not resizable
        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);
    }
}
