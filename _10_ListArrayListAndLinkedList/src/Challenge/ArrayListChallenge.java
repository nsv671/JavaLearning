package Challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();
        boolean flag = true;

        String textBox = """
                """;

        while (flag){
            int inputNumber = input();
            if(inputNumber==0){
                break;
            }else if(inputNumber==1){
                System.out.print("Enter the list of item to add, separated by comma : ");
                add(arrayList,sc.nextLine().split(","));
            } else if (inputNumber==2) {
                System.out.print("Enter the list of item to remove separated by comma : ");
                remove(arrayList, sc.nextLine().split(","));
            }else{
                System.out.println("Wrong input!! please a  number 0 to 2 both inclusive");
            }

//            switch (inputNumber){
//                case 1 -> {
//                    System.out.print("Enter the list of item to add, separated by comma : ");
//                    add(arrayList,sc.nextLine().split(","));
//                }
//                case 2 -> {
//                    System.out.print("Enter the list of item to remove separated by comma : ");
//                    remove(arrayList, sc.nextLine().split(","));
//                }
//                default -> flag=false;
//            }
        }
    }

    private static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 to shutdown, 1 to add item, 2 to remove item. : ");
        return Integer.parseInt(sc.nextLine());
    }

    private static void add(ArrayList<String> arrayList, String... items){
        for(String item : items) {
            if (!arrayList.contains(item)) {
                if(!item.trim().isEmpty()) {
                    arrayList.add(item.trim());
                }
            }
        }
        sortAndPrint(arrayList);
    }

    private static void remove(ArrayList<String> arrayList, String... items){
        for(String item : items) {
            if (!arrayList.contains(item)) {
                arrayList.remove(item.trim());
            }
        }
            sortAndPrint(arrayList);
    }

    private static void sortAndPrint(ArrayList<String> arrayList){
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);
    }
}
