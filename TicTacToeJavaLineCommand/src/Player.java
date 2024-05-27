import java.util.Scanner;
import java.lang.String;


public class Player
{
    private final String    name;
    private final char      input;
    private final int       id;

    public Player(String myName, char myInput, int myId)
    {
        this.name = myName;
        this.input = myInput;
        this.id = myId;
    }
    public String getName()
    {
        return this.name;
    }
}
