package Challenge;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){
    @Override
    public String toString(){
        return String.format("Place - %s (%d)", name, distance);
    }
}

public class LinkedListChallengeAuthorSolution {
    public static void main(String[] args){
        LinkedList<Place> placeToVisite = new LinkedList<>();
        Place adelaide = new Place("Adelaide",1374);
        addPlace(placeToVisite,adelaide);
        System.out.println(placeToVisite);
        addPlace(placeToVisite,adelaide);
        addPlace(placeToVisite, new Place("adelaide",1374));
        addPlace(placeToVisite, new Place("Alice Springs",2771));
        addPlace(placeToVisite, new Place("Brisbane",917));
        addPlace(placeToVisite, new Place("Darwin",3972));
        addPlace(placeToVisite, new Place("melbourne",877));
        addPlace(placeToVisite, new Place("perth",3923));

        placeToVisite.addFirst(new Place("Sydney",0));
        System.out.println(placeToVisite);

        var iterator = placeToVisite.listIterator();
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();
        Scanner sc = new Scanner(System.in);

        while (!quitLoop){
            System.out.println("Enter the value");
            String menuItem = sc.nextLine().toUpperCase().substring(0,1);

            if(!iterator.hasPrevious()){
                System.out.println("Origin Location : "+ iterator.next());
                forward=true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final : "+ iterator.previous());

                forward=false;
            }
            switch (menuItem){
                case "F": {
                    System.out.println("User want to move forward");
                    if(!forward){
                        if(iterator.hasNext()){
                            forward=true;
                            iterator.next();
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                }
                case "B": {
                    System.out.println("User want to move Backward");
                    if(forward){
                        if(iterator.hasPrevious()){
                            forward=false;
                            iterator.previous();
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                }
                case "M": {
                    printMenu();
                    break;
                }
                case "L": {
                    System.out.println(placeToVisite);
                    break;
                }
                default: {
                    quitLoop = true;
                    break;
                }
            }
        }

    }

    private static void printMenu(){
        System.out.println("""
                Available actions (Select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }

    private static void addPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("Found duplicate :"+place);
            return;
        }

        for(Place p : list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate :"+place);
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlace : list){
            if(listPlace.distance()>place.distance()){
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;

        }

        list.add(place);
    }
}
