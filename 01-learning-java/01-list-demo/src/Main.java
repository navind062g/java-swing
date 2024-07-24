import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DIARY", 1);
    }

    @Override
    public String toString() {
        return String.format("%s %s in %s", count, name, type);
    }

    public String getName(String iName) {
        return this.name();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner inputLine = new Scanner(System.in);
        List<String> groceryItems = new ArrayList<>();
        while(true) {
            //menu of options are shown to user
            //available actions
            printActions();

            //user should provide the number to accept for the same
            String inputText = inputLine.nextLine();
            int inputInt;
            try {
                inputInt = Integer.parseInt(inputText);
            } catch (Exception ex) {
                inputInt = -1;
            }

            //0 to shutdown
            if (inputInt == 0) {
                System.out.println("Shutting down the program");
                break;
            }
            //1 to add items to list which are comma delimited list
            else if (inputInt == 1) {
                System.out.println("Lets add the items in the list\n");
                String inputStringToAdd = inputLine.nextLine();
                addItemsToListFromString(groceryItems, inputStringToAdd);
                groceryItems.sort(Comparator.naturalOrder());

                System.out.println("Grocery Items: "+groceryItems);
                System.out.println("Finished Adding the items to the list\n");
            }
            //2 to remove any items using comma delimited list
            else if (inputInt == 2) {
                System.out.println("Lets remove the items from the list\n");
                String inputListToRemove = inputLine.nextLine();
                removeItemsToListFromString(groceryItems, inputListToRemove);
                groceryItems.sort(Comparator.naturalOrder());
                System.out.println("Grocery Items: "+groceryItems);
                System.out.println("Finished Removing the items to the list\n");
            } else {
                System.out.println("Invalid Input:: Shutting down the program");
                break;
            }
        }
    }

    private static void printActions() {
        String textBlock = """
                Following are the available actions: 
                0 - To shutdown
                1 - To add items to list which are comma delimited list
                2 - To remove any items using comma delimited list
                Enter a number for which action you want to do:
                """;

        System.out.println(textBlock);
    }

    public static void addItemsToListFromString(List<String> listItems, String inputString) {
        List<String> itemsToAdd = getListFromString(inputString);

        for(String item : itemsToAdd) {
            if(!listItems.contains(item)) {
                listItems.add(item);
            }
        }
    }

    public static void removeItemsToListFromString(List<String> listItems, String inputString) {
        List<String> itemsToRemove = getListFromString(inputString);

        for(String item : itemsToRemove) {
            listItems.remove(item);
        }
    }

    public static List<String> getListFromString(String inputString) {
        ArrayList<String> listItems = new ArrayList<>();
        StringTokenizer tokens = new StringTokenizer(inputString, ",");

        while(tokens.hasMoreTokens()) {
            listItems.add(tokens.nextToken().trim());
        }
        return listItems;
    }
}