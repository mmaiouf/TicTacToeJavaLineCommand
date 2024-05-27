import java.util.Scanner;

public class Player
{
    private String name;

    public Player(String myName)
    {
        this.name = myName;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String myNewName)
    {
        this.name = myNewName;
    }
}
