import java.util.Random;
import java.util.Scanner;

public class Game
{
    private final ArrayTicTacToe arrayTicTacToe = new ArrayTicTacToe();
    private Random random = new Random();
    private int gameIsOver;
    private Player player1;
    private Player player2;
    private int startPlayerToPlay;

    private void gameLoop()
    {
        gameIsOver = 0;
        startPlayerToPlay = random.nextInt(2) + 1;

        if (startPlayerToPlay == 1)
            System.out.println("The player 1 " + player1.getName() + " starts to play !");
        else
            System.out.println("The player 2 " + player2.getName() + " starts to play !");
       // while (gameIsOver == 0)
        //{

      //  }
    }
    private void initNamePlayers()
    {
        String namePlayer1;
        String namePlayer2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to TicTacToe !\n");
        System.out.print("Please type the name of the Player 1 : ");
        namePlayer1 = scanner.next();
        System.out.print("Please type the name of the Player 2 : ");
        namePlayer2 = scanner.next();

        player1 = new Player(namePlayer1, 'X', 1);
        player2 = new Player(namePlayer2, 'O', 2);
    }
    public void runGame()
    {
        initNamePlayers();
        arrayTicTacToe.displayAndInitArrayTicTacToe();
        gameLoop();
    }
}
