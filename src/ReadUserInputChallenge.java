import java.util.Scanner;

public class ReadUserInputChallenge {

    public static void main(String[] args){
        int count = 1, sum =0;
        Scanner scanner = new Scanner(System.in);
        do{
            try {
                System.out.println("Enter number #"+count);
                int num = Integer.parseInt(scanner.nextLine());
                sum+=num;
                count++;
            }catch (NumberFormatException nfe){
                System.out.println("Please enter a valid number");
            }
        }while (count<=5);

        System.out.println("Sum of all 5 enter number is = "+sum);
    }
}
