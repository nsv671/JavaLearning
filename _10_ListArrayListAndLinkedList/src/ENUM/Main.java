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
    }

    private static DayOfTheWeek getRandomdayOfTheWeek(){
        var week = DayOfTheWeek.values();
        var index  = new Random().nextInt(7);

        return week[index];
    }
}
