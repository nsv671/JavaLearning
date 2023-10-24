import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        System.out.println("Enter a number, or any character to exit the application:");
        while(true){
            try{
                double number = Double.parseDouble(scanner.nextLine());
                max = Math.max(max, number);
                min = Math.min(min, number);
                System.out.println("MAX = "+max+" MIN = "+min);
            }catch (NumberFormatException nfg){
                System.out.println("You have quit the application");
                break;
            }
        }
    }
}
