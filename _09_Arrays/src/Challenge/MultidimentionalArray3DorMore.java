package Challenge;

import java.util.Arrays;

public class MultidimentionalArray3DorMore {
    public static void main(String[] args) {
        System.out.println();
        Object[] anyArray = new Object[3];
        System.out.println(Arrays.deepToString(anyArray));

        System.out.println();
        System.out.println("*".repeat(40));
        System.out.println();

        anyArray[0] = new String[]{"1","2","3"};
//        anyArray[0] = new int[]{1,2,3};

        System.out.println(Arrays.deepToString(anyArray));

        System.out.println();
        System.out.println("*".repeat(40));
        System.out.println();

        anyArray[1] = new String[][]{
                {"a","b"},
                {"c","d","e","f"},
                {"g","h"},
                {"i","j","k"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        System.out.println();
        System.out.println("*".repeat(40));
        System.out.println();

        anyArray[2] = new int[2][2][2];
//      anyArray[2] = "hello";
        System.out.println(Arrays.deepToString(anyArray));

        System.out.println();
        System.out.println("*".repeat(40));
        System.out.println();

        for(Object object : anyArray){
            System.out.println("Element Type = "+ object.getClass().getSimpleName());
            System.out.println("Element toString() = "+ object);
            System.out.println(Arrays.deepToString((Object[]) object));
        }
        //Exception in thread "main" java.lang.ClassCastException: class [I cannot be cast to class [Ljava.lang.Object; ([I and [Ljava.lang.Object; are in module java.base of loader \'bootstrap\')

        //This is a common Java runtime exception that occurs when you try to cast an object of one type to another type that is not compatible. For example, you cannot cast an Integer object to a String object, or a BigDecimal object to a String object. The exception message tells you the types of the objects involved and where the error occurred.
    }
}
