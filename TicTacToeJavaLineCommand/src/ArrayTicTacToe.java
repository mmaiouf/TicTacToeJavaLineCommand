public class ArrayTicTacToe
{
    private final char[] grid = new char[9];

    private void initArray()
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



    private boolean checkVerticalArrayPlayer1()
    {
        if ((grid[0] == 'X' && grid[3] == 'X' && grid[6] == 'X') || (grid[1] == 'X' && grid[4] == 'X' && grid[7] == 'X') || (grid[2] == 'X' && grid[5] == 'X' && grid[8] == 'X'))
            return true;
        return false;
    }
    private boolean checkHorizontalArrayPlayer1()
    {
        if ((grid[0] == 'X' && grid[1] == 'X' && grid[2] == 'X') || (grid[3] == 'X' && grid[4] == 'X' && grid[5] == 'X') || (grid[6] == 'X' && grid[7] == 'X' && grid[8] == 'X'))
            return true;
        return false;
    }
    private boolean checkDiagonalArrayPlayer1()
    {
        if ((grid[0] == 'X' && grid[4] == 'X' && grid[8] == 'X') || (grid[2] == 'X' && grid[4] == 'X' && grid[6] == 'X'))
            return true;
        return false;
    }
    public boolean checkVictoryArrayPlayer1(Game game)
    {
        if (checkHorizontalArrayPlayer1() ||  checkVerticalArrayPlayer1() || checkDiagonalArrayPlayer1())
        {
            System.out.println("\nThe player 1 " + game.player1.getName() + " wins!");
            return true;
        }
        return false;
    }



    private boolean checkVerticalArrayPlayer2()
    {
        if ((grid[0] == 'O' && grid[3] == 'O' && grid[6] == 'O') || (grid[1] == 'O' && grid[4] == 'O' && grid[7] == 'O') || (grid[2] == 'O' && grid[5] == 'O' && grid[8] == 'O'))
            return true;
        return false;
    }
    private boolean checkHorizontalArrayPlayer2()
    {
        if ((grid[0] == 'O' && grid[1] == 'O' && grid[2] == 'O') || (grid[3] == 'O' && grid[4] == 'O' && grid[5] == 'O') || (grid[6] == 'O' && grid[7] == 'O' && grid[8] == 'O'))
            return true;
        return false;
    }
    private boolean checkDiagonalArrayPlayer2()
    {
        if ((grid[0] == 'O' && grid[4] == 'O' && grid[8] == 'O') || (grid[2] == 'O' && grid[4] == 'O' && grid[6] == 'O'))
            return true;
        return false;
    }
    public boolean checkVictoryArrayPlayer2(Game game)
    {
        if (checkHorizontalArrayPlayer2() || checkVerticalArrayPlayer2() || checkDiagonalArrayPlayer2())
        {
            System.out.println("\nThe player 2 " + game.player2.getName() + " wins!");
            return true;
        }
        return false;
    }
}
