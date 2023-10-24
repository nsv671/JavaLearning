public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int switchCase = 6;

        switch (switchCase){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3,4,5");
                System.out.println("Actual value is "+switchCase);
                break;
            default:
                System.out.println("Value was not 1,2,3,4,5");

    }
        switch (switchCase) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3,4,5");
                System.out.println("Actual value is " + switchCase);
            }
            default -> System.out.println("Value was not 1,2,3,4,5");
        }

        String month = "APRIL";
        System.out.println("This "+month+" is " +getQuater("APRIL")+" Quarter");
    }
    public static String getQuater(String month){
        return switch (month){
            case "JANUARY", "FEBRUARY", "MARCH" -> {yield "1ST ";} // without code block throw error
            case "APRIL", "MAY", "JUNE" -> "2ND ";
            case "JULY", "AUGUST","SEPTMBER" -> "3RD ";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4TH ";
            default -> {
                String responce = month + "is a bad input";
                yield responce;
            }
        };
    }

}