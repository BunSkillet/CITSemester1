public class TestShop2
{
    public static void main (String args[])
    {
        //create the shop
        Shop myShop = new Shop("Cruz Stella Shoper-rooney"); 
        
        //create a Game and add it to the shop
        Game game1 = new Game("Fortnight", 3, 99.99);
        myShop.addItem(game1);  
        
        //create a CD and add it to the shop
        CD cd1 = new CD("昆布","被害", 49.99);
        myShop.addItem(cd1);
              
        //create an ElectronicGame and add it to the shop
        ElectronicGame eg1 = new ElectronicGame("R6 Siege", "PS4", 5, 79.99);
        myShop.addItem(eg1);
        ElectronicGame eg2 = new ElectronicGame("Minecraft", "PS4", 1, 19.99);
        myShop.addItem(eg2);
        
        //order and get stock
        cd1.receiveStock(2);
        game1.receiveStock(20);
        eg1.receiveStock(7);
        eg2.receiveStock(1);
        cd1.receiveStock(4);  // another 4 被害 CDs
        
        //sell some items
        game1.sell(4);
        eg2.sell(1);
        cd1.sell(5);
        
        //print information about shop
        myShop.listItems();
        myShop.listLowStock(2);
        myShop.listEGamesByPlatform("PS4");
        myShop.calcTotalSales();
        
        //find an item
        myShop.findItem("昆布");
        
        //test error conditions
        CD cd2 = new CD("Brick Shoes", "Construction Man", 14.99);
        myShop.addItem(cd2);  //should fail as a Brick Shoes item is already in the shop
        
        myShop.findItem("Nasty Fishy"); //Should not return any items
        
        game1.sell(17);  //should fail as there are not enough R6 Siege games 
        
        myShop.processOrderFile();
        myShop.listItems(); //show items after order file processing
        myShop.calcTotalSales(); 
    }
}
