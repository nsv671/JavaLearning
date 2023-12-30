import java.util.ArrayList;
import java.util.Arrays;

record GrosoryRecord(String name, String type, int count){
        public GrosoryRecord(String name){
            this(name,"Dairy", 1);
        }

        @Override
        public String toString(){
            return String.format("%s %d in %s", name, count, type);
        }
}

public class Main {
    public static void main(String[] args) {
        Object[] groceryObjectArray = new Object[3];
        groceryObjectArray[0] = new GrosoryRecord("Milk");
        groceryObjectArray[1] = new GrosoryRecord("apple", "Fruit", 9);
        groceryObjectArray[2] = new GrosoryRecord("Orange", "fruit", 7);

        System.out.println(Arrays.toString(groceryObjectArray));

        ArrayList arrayListObject = new ArrayList();
        arrayListObject.add(new GrosoryRecord("vinagar", "product", 1));
        arrayListObject.add("Yogot");
        System.out.println(arrayListObject);


        ArrayList<GrosoryRecord> arrayList = new ArrayList<GrosoryRecord>();
//        ArrayList<GrosoryRecord> arrayList = new ArrayList<>(); // can also be written like this
        arrayList.add(new GrosoryRecord("Yogot"));
        arrayList.add(new GrosoryRecord("Button"));
        arrayList.add(new GrosoryRecord("milk"));
        arrayList.add(new GrosoryRecord("vinagar", "product", 1));
        System.out.println(arrayList);
        arrayList.add(0, new GrosoryRecord("apple", "Fruit", 10));
        System.out.println(arrayList);
        arrayList.set(0,  new GrosoryRecord("orange", "Fruit", 7));
        System.out.println(arrayList);
    }
}