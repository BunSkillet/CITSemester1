
/**
 * @author (Cruz Stella)
 * @version (4/4/19)
 */
public class Property
{
private int id;
private String address;
private boolean sold;
private int askingPrice = 0;
private int soldPrice;
public Property(int inId, String inAddress, int inAskingPrice){//Constructor method
    id = inId;
    address = inAddress;
    askingPrice = inAskingPrice;
    sold = false;
}
public Property(int inId, String inAddress){//Constructor method 2
    id = inId;
    address = inAddress;
    sold = false;
}
public int getId(){//Displays the int id 
    return id;
}
public String getAddress(){//displays the String getAddress
    return address;
}
public boolean getSold(){//Displays the boolean getSold
    if (sold){
        return true;
    }
    else{
        return false;
    }
}
public int getAskingPrice(){//Displays the int getAskingPrice
    return askingPrice;
}
public int getSoldPrice(){//Displays the int getSoldPrice
    return soldPrice;
}
public void printDetails(){//Displays all the variables 
       System.out.println("Property "+id+ " at " +address+" is for sale for $"+askingPrice);
       if (sold){
           System.out.println("and sold for $"+soldPrice);
        }
}
public void setAskingPrice(int inAskingPrice){//Method to set the int askingPrice
    askingPrice = inAskingPrice;
}
public void sell(int inSoldPrice){//Method to sell the property
    if (sold){
        System.out.println("Error - you cant sell this properety twice. "+address);
    }
    else{
        sold = true;
        soldPrice = inSoldPrice;
    }
}
}
