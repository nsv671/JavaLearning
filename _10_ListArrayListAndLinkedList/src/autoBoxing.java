import java.util.ArrayList;
import java.util.Arrays;

public class autoBoxing {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); //prefer but unnecessary
        Integer deprecatedBoxInt = new Integer(15); //deprecated science JDK9
        int unboxInt  = boxedInt.intValue();  // unnecessary

        //Automatic
        Integer autoBoxing = 15;
        int autoUnboxing = autoBoxing;
        System.out.println(autoBoxing.getClass().getName());
//        System.out.println(autoUnboxing.getClass().getName());  // it will through error as we can't use method like this in primitive data

        double resultAutoUnbox = getDoubleObject();
        double resultAutoBox = getLiteralDoublePrimitive();

        Integer[] integerArray = new Integer[5];
        integerArray[0] = 671; // autoboxing
        System.out.println(Arrays.toString(integerArray));

        Character[] chaArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(chaArray));

        var integerBoxing = getInteger(15);
        var integerUnboxing = getInt(25);

        var ourList = getList(1,2,3,4,5);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(int... varargs){
        ArrayList<Integer> list = new ArrayList<>();
        for(var arg : varargs){
            list.add(arg);
        }

        return list;
    }

    private static int getInt(Integer i){
        return i;
    }

    private static Integer getInteger(int i){
        return i;
    }

    private static Double getDoubleObject(){
        return Double.valueOf(15.23);
    }

    private static double getLiteralDoublePrimitive(){
        return 15.23;
    }
}
