
/**
 * CD is a sub class to Item. Its purpose is to add details of a cd that is sold in the shop
 * @author (Cruz Stella)
 * @version (16/05/19)
 */
public class CD extends Item
{
    private String artist;
    //Constructor method for CD
    public CD (String inName, String inArtist, double inPrice){
        super(inName, inPrice);
        artist = inArtist;
    }
    //over written toString() method displaying the super class toString() with addional attribute
    public String toString(){
        return "CD " + super.toString() + " Artist: " + artist;
    }
}
