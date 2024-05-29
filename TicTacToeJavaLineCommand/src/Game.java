import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game
{
    public final ArrayTicTacToe arrayTicTacToe = new ArrayTicTacToe();
    private int gameIsOver;
    private int startPlayerToPlay;

    public Player player1;
    public Player player2;




    private void gameLoop()
    {
        Random random = new Random();
        gameIsOver = 0;
        startPlayerToPlay = random.nextInt(2) + 1;
        GameLogic gameLogic = new GameLogic();

        if (startPlayerToPlay == 1)
            System.out.println("\nThe player 1 " + player1.getName() + " starts to play !");
        else
            System.out.println("\nThe player 2 " + player2.getName() + " starts to play !");
        while (gameIsOver == 0)
        {
            if (startPlayerToPlay == 1)
            {
                if (gameLogic.gameLogicP1(this) == 1)
                {
                    gameIsOver = 1;
                }
            }
            else
            {
                if (gameLogic.gameLogicP2(this) == 1)
                {
                    gameIsOver = 1;
                }
            }
        }
    }
    public void initNamePlayers()
    {
        String namePlayer1;
        String namePlayer2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to TicTacToe !\n");
        System.out.print("Please type the name of the Player 1 : ");
        namePlayer1 = scanner.next();
        System.out.print("Please type the name of the Player 2 : ");
        namePlayer2 = scanner.next();

        player1 = new Player(namePlayer1, 'X');
        player2 = new Player(namePlayer2, 'O');
    }
    public void runGame()
    {
        initNamePlayers();
        arrayTicTacToe.displayAndInitArrayTicTacToe();
        gameLoop();
    }
}
