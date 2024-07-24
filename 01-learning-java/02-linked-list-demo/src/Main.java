import java.util.*;

record Place(String town, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", town, distance);
    }
}


public class Main {
    public static void main(String[] args) {
        LinkedList<Place> listItinerary = new LinkedList<>();
        addPlace(listItinerary, new Place("Sydney", 0));
        addPlace(listItinerary, new Place("Adelaide", 1374));
        addPlace(listItinerary, new Place("Alice Springs", 2771));
        addPlace(listItinerary, new Place("Brisbane", 917));
        addPlace(listItinerary, new Place("Darwin", 3972));
        addPlace(listItinerary, new Place("Melbourne", 877));
        addPlace(listItinerary, new Place("Perth", 3923));

        boolean quitLoop = false;
        boolean forward = true;
        Scanner inputLine = new Scanner(System.in);
        var iterator = listItinerary.listIterator();

        while(!quitLoop) {
            printMenuOptions(inputLine);

            if(!iterator.hasPrevious()) {
                System.out.println("Originating: "+iterator.next());
                forward = true;
            }
            else if(!iterator.hasNext()) {
                System.out.println("Final: "+iterator.previous());
                forward = false;
            }

            System.out.print("Enter Value: ");
            String inputText = inputLine.nextLine().trim().toUpperCase().substring(0, 1);

            switch (inputText) {
                case "F":
                    if(!forward) {
                        forward = true; //reversing the direction

                        if(iterator.hasNext()) {
                           iterator.next(); //adjusting the position
                        }
                    }

                    System.out.println("Forward Action has been selected: ");
                    if(iterator.hasNext())
                    {
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    if(forward) {
                        forward = false; //reversing the direction

                        if(iterator.hasPrevious()) {
                            iterator.previous(); //adjusting the position
                        }
                    }

                    System.out.println("Backward action has been selected: ");
                    if(iterator.hasPrevious())
                    {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println("Listing Places to visit along with distance from Sydney: ");
                    System.out.println(listItinerary);
                    break;
                case "Q":
                    System.out.println("Quitting the Program");
                    quitLoop = true;
                    break;
                default:
                    System.out.println("Invalid Input:: Quitting the Program");
                    quitLoop = true;
                    break;
            }
        }
    }

    private static void printMenuOptions(Scanner inputLine) {
        System.out.println("""
                Available Actions (Select word or letter):
                (F)orward
                (B)ackword
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }

    private static void addPlace(LinkedList<Place> listItinerary, Place placeObj) {

        for(Place obj : listItinerary) {
            if(obj.town().equalsIgnoreCase(placeObj.town())) {
                System.out.println("Place "+ placeObj+" already part of the Itinerary");
                return;
            }
        }
        if(listItinerary.isEmpty()) {
            listItinerary.add(placeObj);
            return;
        }
        int matchedIndex = 0;
        for(Place obj : listItinerary) {

            if(obj.distance() > placeObj.distance()) {
                listItinerary.add(matchedIndex, placeObj);
                return;
            }
            matchedIndex++;
        }
        listItinerary.add(placeObj);

    }
}