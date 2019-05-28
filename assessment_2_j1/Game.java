
/**
 * Game is a sub class to Item. Its purpose is to add details of a game that is sold in the shop
 * @author (Cruz Stella)
 * @version (16/05/19)
 */
public class Game extends Item
{
    private int maxPlayers;
    //Constructor method for Game
    public Game(String inName, int inMaxPlayers, double inPrice){
        super(inName, inPrice);
        maxPlayers = inMaxPlayers;
    }
    //over written toString() method displaying the super class toString() with addional attribute
    public String toString(){
        return "Game " + super.toString() + " Playes: " + maxPlayers;
    }
}
