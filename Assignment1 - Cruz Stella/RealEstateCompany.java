
/**
 * @author (Cruz Stella)
 * @version (4/4/19)
 */
public class RealEstateCompany

{
private String name;
private int numProperties = 0;
private final int MAX_PROPERTIES = 10;
private Property[] properties = new Property[MAX_PROPERTIES];
public RealEstateCompany(String inName){//Declares the name of real estate company
    name = inName;
}
public void addProperty(Property inProperty){ //Method to add property to the properties[] array
    if(numProperties < MAX_PROPERTIES){
        properties[numProperties] = inProperty;
        numProperties++;
    }
    else{
        System.out.println("Error - cannot add anymore propterties");
    }
}
public void printAllProperties(){//Displays all the property in properties[]
    System.out.println(name+" is handling the following properties;");
    for (int i=0; i<numProperties; i++){
        properties[i].printDetails();
    }
    System.out.println("End report of "+name);
    System.out.println("");
}
public void printSales(){//Counts the boolean getSold and int getSoldPrice, for total numbers
    int sold = 0;
    double total = 0;
    for (int i=0; i<numProperties; i++){
        if (properties[i].getSold()) {
            properties[i].getSold();
            sold++;
            total = total + properties[i].getSoldPrice();
        }
    }
    System.out.println(name+" has sold "+sold+ " propertie/s.");
    System.out.println("With a total sum of $"+total);
    System.out.println("");
}
public void sellProperty(int inId, int inSoldPrice){//Method to sell a property, if it hasnt already or doesnt exist
   boolean propertyFound = false;
   int id = inId;
   for (int i=0;i<numProperties;i++){
       if(properties[i].getId()==id){
           propertyFound = true;
           if(propertyFound){
               if(properties[i].getSold()){
                   System.out.println("Error - property "+id+" already sold");
            }
            else{
                   properties[i].sell(inSoldPrice);
            }
        }
        }
    }
    if (propertyFound){
    }
    else{
        System.out.println("Error - property "+id+" was not found");
    }
    System.out.println("All listings of properties is mangaeged by "+name);
    }
public void printCheapPropertiesForSale(int threshhold){//Displays property less than the int threshold
    System.out.println("Listing of all properties for sale with a price below $"+threshhold);
    for(int i=0;i<numProperties;i++){
        if(properties[i].getAskingPrice()<=threshhold){
            properties[i].printDetails();
        }
    }
    System.out.println("End report of "+name);
    System.out.println("");
}
}
   
