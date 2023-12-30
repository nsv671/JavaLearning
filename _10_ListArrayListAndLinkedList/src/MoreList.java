import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] item = {"Apple","Orange", "Banana", "PineApple"};
        List<String> stringList = List.of(item);

        System.out.println(stringList);
        System.out.println(stringList.getClass().getName()); //List is immutable

        ArrayList<String> fruitList = new ArrayList<>(stringList);
        System.out.println(fruitList);
        System.out.println(fruitList.getClass().getName());
        fruitList.add(0,"Mango");
        fruitList.add(3,"Mango");
        fruitList.add(5,"Mango");
        System.out.println(fruitList);

        ArrayList<String> nextFruitList = new ArrayList<>(List.of("Guava", "Peach", "Papaya"));
        System.out.println(nextFruitList);

        fruitList.addAll(nextFruitList);
        System.out.println(fruitList);

        //get, contains, indexOf and lastIndexOf
        System.out.println("second element = "+ fruitList.get(1));
        System.out.println("is fruitList contains mango? = "+ fruitList.contains("Mango"));
        System.out.println("First index = "+ fruitList.indexOf("Mango"));
        System.out.println("Last index = "+ fruitList.lastIndexOf("Mango"));

        //remove element
        //by using - index, element name, remove all, retain all
        System.out.println(fruitList);
        fruitList.remove(4);
        System.out.println(fruitList);
        fruitList.remove("Mango");
        System.out.println(fruitList);
        fruitList.removeAll(List.of("Mango")); //removeAll method takes Collection list as argument
        System.out.println(fruitList);
        fruitList.retainAll(Arrays.asList("Orange", "PineApple", "Guava"));
        System.out.println(fruitList);

        //clear, isEmpty
        fruitList.clear();
        System.out.println("Is fruit list empty? \n"+ fruitList.isEmpty());

        //add element via 2 type aslist and Array.list
        //sort the list natural and rever
        //var
        fruitList.addAll(List.of("Orange", "PineApple", "Guava"));
        fruitList.addAll(Arrays.asList("Apple","Orange", "Banana", "PineApple"));

        System.out.println(fruitList);
        fruitList.sort(Comparator.naturalOrder());
        System.out.println(fruitList);
        fruitList.sort(Comparator.reverseOrder());
        System.out.println(fruitList);
        //var
        var newFruitList = fruitList.toArray(new String[fruitList.size()]);
        System.out.println(Arrays.toString(newFruitList));
    }
}
