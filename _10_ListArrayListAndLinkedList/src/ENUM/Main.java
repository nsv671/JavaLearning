package ENUM;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek fridayDay = DayOfTheWeek.FRI;
        System.out.println(fridayDay);

        for(int i=0; i<10; i++){
            System.out.printf("Name is %s, Original value = %d%n", getRandomdayOfTheWeek().name(), getRandomdayOfTheWeek().ordinal());

            if(getRandomdayOfTheWeek() == DayOfTheWeek.FRI){
                System.out.println("Found a Friday!!!");
            }
        }

        System.out.println("-".repeat(40));

        switchDayOfTheWeek(getRandomdayOfTheWeek());

        System.out.println("-".repeat(40));

        var toppings = Toppings.values();
        for(var topping : toppings){
            System.out.println(topping.name() +" : "+topping.getPrice(topping));
        }
    }

    private static DayOfTheWeek getRandomdayOfTheWeek(){
        var week = DayOfTheWeek.values();
        var index  = new Random().nextInt(7);

        return week[index];
    }

    private static void switchDayOfTheWeek(DayOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal()+1;

        switch (weekDay){
            case TUES -> System.out.println("Tuesday is day "+ weekDayInteger);
            case FRI -> System.out.println("Wednesday is day "+ weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0)+weekDay.name().substring(1).toLowerCase()+" is day "+weekDayInteger);
        }
    }
}
