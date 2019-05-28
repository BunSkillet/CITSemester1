
/**
 * ElectronicGame is a sub class to Game. Its purpose is to add details of an electronic game that is sold in the shop

 * @author (Cruz Stella)
 * @version (16/05/19)
 */
public class ElectronicGame extends Game
{
    private String platform;
        //Constructor method for ElectronicGame
    public ElectronicGame(String inName, String inPlatform, int inMaxPlayers, double inPrice){
        super(inName, inMaxPlayers, inPrice);
        platform = inPlatform;
    }
    //returns the platofrm attribute
    public String getPlatform(){
        return platform;
    }
    //over written toString() method displaying the super class toString() with addional attribute
    public String toString(){
        return "Electronic game " + super.toString() + " Platform: " +platform;
    }
}
