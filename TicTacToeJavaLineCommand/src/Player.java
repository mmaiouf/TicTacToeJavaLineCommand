import java.util.Scanner;
import java.lang.String;


public class Player
{
    private final String    name;
    private final char      logo;

    private int input;

    public Player(String myName, char myLogo)
    {
        this.name = myName;
        this.logo = myLogo;
        this.input = 10;
    }
    public String getName()
    {
        return this.name;
    }
    public char getLogo()
    {
        return this.logo;
    }
    public int getInput()
    {
        return this.input;
    }

    public void setInput(int myInput)
    {
        this.input = myInput;
    }
}
