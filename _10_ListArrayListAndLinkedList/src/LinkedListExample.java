import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
//        LinkedList<String> placeToVisitList = new LinkedList<>();
        var placeToVisitList = new LinkedList<String>();
        placeToVisitList.add("Delhi");
        placeToVisitList.add(0, "Manali");
        System.out.println(placeToVisitList);

        addPlaceToList(placeToVisitList);

        removePlaceFromList(placeToVisitList);

        gettingElements(placeToVisitList);

        printItinerary1(placeToVisitList);

        System.out.println("-".repeat(40));

        printItinerary2(placeToVisitList);

        System.out.println("-".repeat(40));

        printItinerary3(placeToVisitList);

        System.out.println("-".repeat(40));

        testIterator(placeToVisitList);

        System.out.println("-".repeat(40));

        testListIterator(placeToVisitList);
    }

    private static void addPlaceToList(LinkedList<String> list) {
        list.add("Bhubaneswar");
        list.addFirst("Ooty");
        list.addLast("Puri");
        System.out.println(list);

        //Queue methods
        list.offer("Simla");
        list.offerFirst("Nagaland");
        list.offerLast("Goa");
        System.out.println(list);

        //StackMethod
        list.push("Gujarat");
        System.out.println(list);
    }

    private static void removePlaceFromList(LinkedList<String> list) {
        list.remove(0);
        list.remove("Goa");
        System.out.println(list);

        String removePlace1 = list.remove(); // removes first element
        System.out.println(removePlace1 + " was removed");
        String removePlace2 = list.removeFirst();  // removes first element
        System.out.println(removePlace2 + " was removed");
        String removePlace3 = list.removeLast();  // removes last element
        System.out.println(removePlace3 + " was removed");

        // Queue/Deque poll methods
        String removePlace4 = list.poll();  // removes first element
        System.out.println(removePlace4 + " was removed");
        String removePlace5 = list.pollFirst();  // removes first element
        System.out.println(removePlace5 + " was removed");
        String removePlace6 = list.pollLast();  // removes first element
        System.out.println(removePlace6 + " was removed");

        list.addFirst("Ooty");
        list.addLast("Puri");

        System.out.println(list);

        list.pop(); // removes first element
        System.out.println(list);
    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("4th element is - " + list.get(4));
        System.out.println("First element is - " + list.getFirst());
        System.out.println("Last element is - " + list.getLast());
        System.out.println("First occurrence index of Otty - " + list.indexOf("Ooty"));
        System.out.println("Last occurrence element is - " + list.lastIndexOf("Otty"));

        //Queue
        System.out.println("Element is - "+list.element());
        System.out.println("peeked element is - "+list.peek());
        System.out.println("Fist Element is - "+list.peekFirst());
        System.out.println("Last Element is - "+list.peekLast());
    }

    private static void printItinerary1(LinkedList<String> list){
        System.out.println("First visited place - "+list.getFirst());

        for(int i=1; i<list.size(); i++){
            System.out.println("---> from "+list.get(i-1)+" to "+list.get(i));
        }

        System.out.println("Last visited place - "+list.getLast());
    }

    private static void printItinerary2(LinkedList<String> list){
        System.out.println("First visited place - "+list.getFirst());

        String previousTown = list.getFirst();
        for(String town : list){
            System.out.println("---> from "+previousTown+" to "+town);
            previousTown = town;
        }

        System.out.println("Last visited place - "+list.getLast());
    }

    private static void printItinerary3(LinkedList<String> list){
        System.out.println("First visited place - "+list.getFirst());
        String previousTown = list.getFirst();

        Iterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println("---> from "+previousTown+" to "+town);
            previousTown = town;
        }

        System.out.println("Last visited place - "+list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
        System.out.println("First visited place - "+list.getFirst());

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println(town);
        }

        System.out.println("Last visited place - "+list.getLast());
        System.out.println(list);

        while(iterator.hasNext()){
            //this will not print anything as iterator is in last index, and it is 1 directional
            System.out.println(iterator.next());
        }
    }

    private static void testListIterator(LinkedList<String> list){
        System.out.println("First visited place - "+list.getFirst());

        var iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println(town);
        }

        System.out.println("Last visited place - "+list.getLast());
        System.out.println(list);

        System.out.println("Previous element - "+iterator.previous());
        //ListIterator provides 2 directional access
    }
}
