public class TestShop
{
    public static void main (String args[])
    {
        //create the shop
        Shop myShop = new Shop("Amy Smith Superstore"); 
        
        //create a CD and add it to the shop
        CD cd1 = new CD("Abba Gold", "Abba", 15);
        myShop.addItem(cd1);  
        
        //create a Game and add it to the shop
        Game game1 = new Game("Chess", 2, 39.95);
        myShop.addItem(game1);
              
        //create 3 ElectronicGames and add them to the shop
        ElectronicGame eg1 = new ElectronicGame("Shrek", "PS2", 1, 79.50);
        myShop.addItem(eg1);
        ElectronicGame eg2 = new ElectronicGame("Doom", "PC", 2, 30.20);
        myShop.addItem(eg2);
        ElectronicGame eg3 = new ElectronicGame("AFL", "PS2", 2, 49.95);
        myShop.addItem(eg3);
        
        //order and get stock
        cd1.receiveStock(3);
        game1.receiveStock(5);
        eg1.receiveStock(10);
        eg2.receiveStock(1);
        eg3.receiveStock(2);
        cd1.receiveStock(7);  // another 7 Abba CDs
        
        //sell some items
        cd1.sell(2);
        eg2.sell(1);
        
        //print information about shop
        myShop.listItems();
        myShop.listLowStock(8);
        myShop.listLowStock(2);
        myShop.listEGamesByPlatform("PS2");
        myShop.calcTotalSales();
        
        //test error conditions
        Game game2 = new Game("Chess", 2, 39.95);
        myShop.addItem(game2);  //should fail as a Chess item is already in the shop
        
        eg2.sell(1);  //should fail as there are no Doom games left 
        
        myShop.processOrderFile();
        myShop.listItems(); //show items after order file processing
        myShop.calcTotalSales(); 
    }
}
