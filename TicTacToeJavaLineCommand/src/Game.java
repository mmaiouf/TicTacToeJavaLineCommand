import java.util.Scanner;

public class Game
{
    public void askNamePlayers()
    {
        Player player1;
        Player player2;
        String namePlayer1;
        String namePlayer2;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to TicTacToe !\n");
        System.out.print("Please type the name of the Player 1 : ");
        namePlayer1 = scanner.next();
        System.out.print("Please type the name of the Player 2 : ");
        namePlayer2 = scanner.next();

        player1 = new Player(namePlayer1);
        player2 = new Player(namePlayer2);
    }
    void runGame()
    {
        askNamePlayers();
    }
}
