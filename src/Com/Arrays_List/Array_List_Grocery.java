package Com.Arrays_List;

import java.util.ArrayList;
import java.util.Scanner;


public class Array_List_Grocery {
    public static void main(String[] args) {
        // Create an ArrayList to store grocery items
                ArrayList<String> groceryList = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);

                // Display a welcome message
                System.out.println("Welcome to the Grocery List Program!");
                System.out.println("You can add items to your grocery list. Type 'done' when you're finished.");

                // Loop to allow the user to add items
                while (true) {
                    System.out.print("Enter an item to add to the grocery list: ");
                    String item = scanner.nextLine();

                    // Check if the user typed 'done' to exit the loop
                    if (item.equalsIgnoreCase("done")) {
                        break;
                    }

                    // Add the item to the grocery list
                    groceryList.add(item);
                }

                // Display the final grocery list
                System.out.println("\nYour final grocery list:");
                for (String groceryItem : groceryList) {
                    System.out.println("- " + groceryItem);

                }

                // Close the scanner
                scanner.close();
            }
        }





