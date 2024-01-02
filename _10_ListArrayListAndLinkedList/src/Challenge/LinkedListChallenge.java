package Challenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListChallenge {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<TownAndDistance> placeList= new LinkedList<>();
        var adelaide = new TownAndDistance("Adelaide",1374);
        addToVisitPlace(placeList,adelaide);
        addToVisitPlace(placeList, new TownAndDistance("adelaide",1374));
        addToVisitPlace(placeList, new TownAndDistance("Alice Springs",2771));
        addToVisitPlace(placeList, new TownAndDistance("Brisbane",917));
        addToVisitPlace(placeList, new TownAndDistance("Darwin",3972));
        addToVisitPlace(placeList, new TownAndDistance("melbourne",877));
        addToVisitPlace(placeList, new TownAndDistance("perth",3923));

        placeList.addFirst(new TownAndDistance("Sydney",0));
        var iterator = placeList.listIterator();

        String consoleString = """
                Available actions (Select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";
        System.out.println(consoleString);
        boolean flag = true;
        while(flag){
            String input = sc.nextLine();
            switch(input.toLowerCase()){
                case "f", "forward" -> nextPlace(iterator);
                case "b", "backward" -> previousPlace(iterator);
                case "l", "list Place" -> {
                    System.out.println("Enter the number between 0 to "+ (placeList.size()-1));
                    particularPlace(placeList, sc.nextInt());
                }
                case "m", "menu" -> menu(iterator);
                case "q", "quit" -> flag=false;
            }
            if(flag){
                System.out.println(consoleString);
            }
        }

    }


    private static void menu(ListIterator<TownAndDistance> iterator){
        System.out.println(iterator.getClass().getName());
        while(iterator.hasNext()){
            var place = iterator.next();
            System.out.printf("Town - %s distance from Sydney - %dKm %n", place.getName(), place.getDistance());
        }
    }

    private static void addToVisitPlace(LinkedList<TownAndDistance> list, TownAndDistance place){
        if(list.contains(place)){
            System.out.println("Found duplicate :"+place);
            return;
        }

        for(var p : list){
            if(p.getName().equalsIgnoreCase(place.getName())){
                System.out.println("Found duplicate :"+place);
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlace : list){
            if(listPlace.getDistance()>place.getDistance()){
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;

        }

        list.add(place);
    }

    private static void previousPlace(ListIterator<TownAndDistance> iterator){
        if(iterator.hasPrevious()){
            var place = iterator.previous();
            System.out.println("Previous place is - "+place.getName());
        }else{
            System.out.println("You are at the first visited place");
        }
    }
    private static void nextPlace(ListIterator<TownAndDistance> iterator){
        if(iterator.hasNext()){
            var place = iterator.next();
            System.out.println("Next place is - "+place.getName());
        }else{
            System.out.println("Y0u are at the last visited place");
        }
    }

    private static void particularPlace(LinkedList<TownAndDistance> town, int index){
        boolean flag = true;
        while(flag) {
            if (index >= 0 && index <= town.size()) {
                var place = town.listIterator(index);
                System.out.println(index + " place is - " + place.next().getName());
                flag=false;
            } else {
                System.out.println("Index out of bound!!!, please enter correct index");
                particularPlace(town, Integer.parseInt(sc.nextLine()));
            }
        }
    }
}

class TownAndDistance{
    private String name;
    private int distance;

    public TownAndDistance(String name, int distance){
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String town) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
