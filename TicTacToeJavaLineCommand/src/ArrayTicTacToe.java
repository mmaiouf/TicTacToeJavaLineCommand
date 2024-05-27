public class ArrayTicTacToe
{
    private final char[] grid = new char[9];

    public void initArray()
    {
        for (int i = 0; i < 9; i++)
        {
            grid[i] = (char) (i + 1);
        }
    }

    public void displayArray()
    {
        for (int i = 0; i < 9; i++)
        {
                System.out.print((int) grid[i]);
                if ( (i+1) % 3 == 0)
                    System.out.println("\n----------");
                else
                    System.out.print(" | ");
        }
    }

    public void displayAndInitArrayTicTacToe()
    {
        System.out.println("\n\n");
        initArray();
        displayArray();
    }
}
