
/**
 * Item class is the parent class to 2 child classes. It is an abstract class that holds the basic details and methods 
 * to construct an item that would be sold in the shop.
 * @author (Cruz Stella)
 * @version (16/05/19)
 */
public abstract class Item
{
    private String name;
    private double price;
    private int numInStock;
    private int numSold;
    //constructor for class ITem
    public Item(String inName, double inPrice){
        name = inName;
        price= inPrice;
    }
    //returns the name attribute
    public String getName(){
        return name;
    }
    //returns the price attribute
    public double getPrice(){
        return price;
    }
    //returns the numInStock attribute
    public int getNumInStock(){
        return numInStock;
    }
    //returns the numSold attribute
    public int getNumSold(){
        return numSold;
    }   
    //adds the amount attribute to the current numInStock
    public void receiveStock(int amount){
        numInStock += amount;
    }
    //a method to sell items. adds inNumCopies to numSold and subtracts inNumCopies for numInStock if the numInstock is greater than or equal to inNumCopies or e;se prints an error 
    public boolean sell(int inNumCopies){
        if(numInStock >= inNumCopies){
            numSold = numSold + inNumCopies;
            numInStock = numInStock - inNumCopies;
            return true;
        }
        else{
            System.out.println("Sorry - There are only " + numInStock + " copies of " + name + "left, you cant buy " + inNumCopies);
            System.out.println("");
            return false;
        }
    }
    //overwritten toString() method to display an items attributes
    public String toString(){
        return name + " Price: $" + price + " Stock: " + numInStock + " Sold: " + numSold;
    }
}
