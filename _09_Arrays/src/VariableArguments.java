public class VariableArguments {
    public static void main(String... args) {
        String[] stringArray = {"first", "second", "third", "forth", "fifth"};
        printStringArray(stringArray);
        System.out.println("-".repeat(30));
        printStringInputs(stringArray);

        System.out.println("-".repeat(30));
        printStringInputs("nitesh","mukesh","aklesh");
//        printStringArray("nitesh","mukesh","aklesh"); // this will throw error science input parameter is string array
    }

    private static void printStringArray(String[] stringArray){
        for(String element : stringArray){
            System.out.println(element);
        }
    }

    private static void printStringInputs(String... stringArray){
        for(String element : stringArray){
            System.out.println(element);
        }
    }
}
