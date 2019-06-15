/**
 * @author (Cruz Stella)
 * This is the Shop class. It is designed to contain the Item class sub-classes. It performs an add items method, find item method, a list of all items, 
 * a list of low stocked items, a list of a specific platform items, a calculate the total sales method, and a file writer method to write out specif item sales
 *----------------------------
* @version (16/05/19)
 */
import java.io.*;
import java.util.*;
public class Shop
{
    private String storeName;
    ArrayList<Item> items = new ArrayList<Item>();
    //constructor for the Shop class
    public Shop(String inStoreName){
        storeName = inStoreName;
    }
    //if test to identiy whether an item with the (newItem) name already exists within the arrayList, and ads it if not
    public boolean addItem(Item newItem){
        if (findItem(newItem.getName())){
            System.out.println("Error - an item called " + newItem.getName() + " is already in the shop");
            System.out.println("");
            return false;
         }
         else{
            items.add(newItem);
            return true;
         }
    }
    //for loop runs through the items arrayList to test the name attribute aggainst searchName, will return toString() if the item is found
    public boolean findItem(String searchName){
        for (Item nextItem : items){
            if(searchName.equals(nextItem.getName())){
                System.out.println(nextItem);
                return true;
            }
        }
        System.out.println( searchName + " was not found in " + storeName + " stock");
        System.out.println("");
        return false;
    }
    //list all items from the items arrayList with a for loop
    public void listItems(){
        String message = "The following items are stocked by " + storeName + ".\n";
        for (Item nextItem : items){
            message = message + nextItem.toString() + "\n";
        }
        System.out.println("" + message);
    }
    //if test will check threshold against numInStock and display if the critera (is less than or equal to) is true 
    public void listLowStock(int threshold){
        System.out.println("Low stock report " + storeName + " items with stock less than or equal to " + threshold);
        for (Item nextItem : items){
            if (nextItem.getNumInStock() <= threshold){
                System.out.println(nextItem);
            }
        }
        System.out.println("End low stock report.");
        System.out.println("");
    }
    //prints all ElectronicGames that have a platform String that matches the inPlatform attribute
    public void listEGamesByPlatform(String inPlatform){
        System.out.println("List of all electronic games for " + inPlatform + " stocked by " + storeName);
        for (Item nextItem : items){
            if (nextItem instanceof ElectronicGame){
                if (((ElectronicGame)nextItem).getPlatform().equals(inPlatform)){
                    System.out.println(nextItem);
                }
            }
        }
        System.out.println("End list of electronic games for " + inPlatform);
        System.out.println("");
    }
    //Calculates and prints the numSold and price attrinutes of items
    public void calcTotalSales(){
        int total = 0;
        double sales = 0;
        for (Item nextItem : items){
            total = total + nextItem.getNumSold();
            if (nextItem.getNumSold() > 0){
                sales = sales + (nextItem.getPrice() * nextItem.getNumSold());
            }
        }
        System.out.println(storeName + " has sold " + total + " items for a total of " + sales);
        System.out.println("");
    }
    //Method to attempt to write out a file (order_report.txt) containing items and the sales numbers
    public void processOrderFile(){
        try {
            String message = storeName + "orders processed " + new Date() + "\n";
            System.out.println("");
            BufferedWriter writer = new BufferedWriter(new FileWriter("order_report.txt"));
            for (Item nextItem : items){
                if (nextItem.getNumSold() > 0){
                    message = message + nextItem.getName() + " Purchase of " + nextItem.getNumSold() + " copies successfully processed.\n";
                }
                else {
                    message = message + nextItem.getName() + " Purchase of " + nextItem.getNumSold() + " copies could not be processed.\n";
                }
            }
            writer.write(message);
            writer.close();
        }
        catch (Exception ex) {
            System.out.println("File I/O error " + ex);
        }
    }
}
