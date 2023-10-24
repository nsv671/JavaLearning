public class DayOfTheWeekChallenge {
    public static void main(String[] args){
        int i=0;
        while(i<8){
            printDayOfTheWeek(i);
            i++;
        }
        int day = 3;
        if(day==0){
            System.out.println("Day-"+day+" = Sunday");
        }else if(day==1){
            System.out.println("Day-"+day+" = Monday");
        }if(day==2){
            System.out.println("Day-"+day+" = Tuesday");
        }if(day==3){
            System.out.println("Day-"+day+" = Wednesday");
        }if(day==4){
            System.out.println("Day-"+day+" = Thursday");
        }if(day==5){
            System.out.println("Day-"+day+" = Friday");
        }if(day==6){
            System.out.println("Day-"+day+" = Saturday");
        }
    }

    public static void printDayOfTheWeek(int number){
        String day = switch (number){
            case  0 -> "Sunday";
            case  1 -> "Monday";
            case  2 -> "Tuesday";
            case  3 -> "Wednesday";
            case  4 -> "Thursday";
            case  5 -> "Friday";
            case  6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println("Day-"+number+" = "+day);
    }
}
