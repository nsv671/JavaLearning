import java.util.Scanner;

public class ReadingUserInput {
    public static  void main(String[] args){
        int currentDate = 2023;
        String userDateOfBirth = "1999";
        int dateOfBirth = Integer.parseInt(userDateOfBirth);

        System.out.println("Age = " + (currentDate - dateOfBirth));

//        System.out.println(getInputFromConsole(currentDate));
        System.out.println(getInputFromScanner(currentDate));
    }

    public static  String getInputFromConsole(int currentYear){
        String name = System.console().readLine("What is your name?");
        System.out.println("Hi, "+name+" thanks for taking the java complete course");

        String year = System.console().readLine("What year you were born?");
        int age = currentYear - Integer.parseInt(year);

        return "So you are "+age+" years old";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hi, "+name+" thanks for taking the java complete course");
        System.out.println("What year you were born?");
//        String userDateOfBirth = scanner.nextLine();
//        int age = currentYear - Integer.parseInt(userDateOfBirth);
        boolean flage = false;
        int age =0;
        do{
            try{
                System.out.println("Enter a year of birth >= " + (currentYear - 100) + " and <= " + currentYear);
                age = checkData(currentYear, scanner.nextLine());
                flage = age > 0;
            }catch (NumberFormatException exception){
                System.out.println("Characters not allow!!! please try again");
            }
        }while(!flage);

        return "So you are "+age+" years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        if(dob>currentYear || dob< currentYear-100){
            return -1;
        }

        return currentYear - dob;
    }
}

