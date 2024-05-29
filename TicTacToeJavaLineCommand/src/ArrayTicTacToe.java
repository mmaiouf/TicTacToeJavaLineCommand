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
            if (grid[i] == 79 || grid[i] == 88)
                System.out.print(grid[i]);
            else
                System.out.print((int) grid[i]);
            if ( (i+1) % 3 == 0)
                System.out.println("\n----------");
            else
                System.out.print(" | ");
        }
    }

    public boolean updateArray(Player myPlayer)
    {
        if (grid[myPlayer.getInput() - 1] != 'X' && grid[myPlayer.getInput() - 1] != 'O')
        {
            grid[myPlayer.getInput() - 1] = (char) myPlayer.getLogo();
            return true;
        }

        System.out.println("The cell is already fill.");
        return false;
    }

    public void displayAndInitArrayTicTacToe()
    {
        System.out.println("\n\n");
        initArray();
        displayArray();
    }
}
