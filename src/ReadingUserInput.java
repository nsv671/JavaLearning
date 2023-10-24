public class ReadingUserInput {
    public static  void main(String[] args){
        int currentDate = 2023;
        String userDateOfBirth = "1999";
        int dateOfBirth = Integer.parseInt(userDateOfBirth);

        System.out.println("Age = " + (currentDate - dateOfBirth));
    }
}

