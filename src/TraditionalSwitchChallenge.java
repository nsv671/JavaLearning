public class TraditionalSwitchChallenge {
    public static void main(String[] args){
        char alphabet = 'C';
        switch(alphabet){
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charli");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println("For "+alphabet + "case not found");
        }

        printNumberInWord(2);
    }

    public static void printNumberInWord(int number){
        switch(number){
            case 0 -> {System.out.println("ZERO");}
            case 1 -> {System.out.println("ONE");}
            case 3 -> {System.out.println("THREE");}
            case 4 -> {System.out.println("FOUR");}
            case 5 -> {System.out.println("FIVE");}
            case 6 -> {System.out.println("SIX");}
            case 7 -> {System.out.println("SEVEN");}
            case 8 -> {System.out.println("EIGHT");}
            case 9 -> {System.out.println("NINE");}
            default -> {System.out.println("OTHER");}
        }
    }
}
