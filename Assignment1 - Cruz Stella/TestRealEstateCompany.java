

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestRealEstateCompany
{
    public static void main (String[] args)
    {
        RealEstateCompany re = new RealEstateCompany( "Cruz Stella Realty");  //CHANGE TO YOUR NAME!!!!
        Property p1 = new Property(1, "1 Cheap St", 1000);
        Property p2 = new Property(22, "2 Expensive Place", 2222222);
        Property p3 = new Property(33, "3 Average St"); //use constructor that sets price to zero
        p3.setAskingPrice(330000);        //set the asking price now
        Property p4 = new Property(44, "4 Average St", 340000);
        Property p5 = new Property(555, "5 Average St", 350000);        
        re.addProperty (p1);
        re.addProperty (p2);
        re.addProperty (p3);
        re.addProperty (p4);
        re.addProperty (p5);
        
        // property 44 sells
        re.sellProperty(44, 340000);   
        re.printAllProperties(); //print a list of all properties, only 44 should be sold
        re.printSales();
        
        // property 22 sells at a reduced price
        re.sellProperty(22, 2222000);
        re.printAllProperties(); //print a list of all properties now, two should be sold
        re.printSales();
        
        re.printCheapPropertiesForSale(330000); //print properties for sale up to $330000
        re.printCheapPropertiesForSale(300000); //print properties for sale up to $300000
        
        re.sellProperty(9, 2000); //produces id error
        re.sellProperty(44, 1000); //produces already sold error
  }
}