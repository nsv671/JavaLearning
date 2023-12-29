public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] intArrayUnAssign;
        int[] intArrayUnAssign2ndKind;
        int[] intArrayOneKind = new int[5]; //need to give the size of the array
        int[] intArrayDeclaration2ndKind = new int[] {1,2,5,3,6,8};
        int[] intArrayDeclaration3ndKind = {1,2,5,3,6,8};
        String[] stringArray = {"nitesh","mukesh", "harish"};
        String stringArray2ndKind[] = new String[10];
        //intArrayUnAssign = {5,3,5,9,8,4}; //not possible it will throw error
        intArrayUnAssign = new int[5];
        intArrayUnAssign2ndKind = new int[] {1,2,5,3,8,6,7};

        System.out.println("-".repeat(30));

        int[] forIntArray = new int[5];
        for(int i=0; i<forIntArray.length; i++){
            forIntArray[i] = i+1;
        }

        for(int element : forIntArray){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("-".repeat(30));

        Object[] objectArray = new Object[4];
        objectArray[0] = 1;
        objectArray[1] = "String";
        objectArray[2] = 'c';
        objectArray[3] = new StringBuilder();

        for (Object element : objectArray){
            System.out.println(element);
        }
    }
}