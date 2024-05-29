import java.util.InputMismatchException;
import java.util.Scanner;

public class GameLogic
{
    public void gameLogicP2(Game game)
    {
        int inputP1 = 10;
        int inputP2 = 10;
        Scanner scanner = new Scanner(System.in);

        while ((inputP2 <= 0) || (inputP2 > 9))
        {
            try
            {
                System.out.print("Please the player 2 " + game.player2.getName() + ", type your input between 1 and 9 where you want to put your " + game.player2.getLogo() + " : ");
                inputP2 = scanner.nextInt();
                game.player2.setInput(inputP2);
            }
            catch (InputMismatchException e)
            {
                System.out.println("You did not type a number.");
                scanner.next();
            }

        }

        while (!game.arrayTicTacToe.updateArray(game.player2))
        {
            try
            {
                System.out.print("Please the player 2 " + game.player2.getName() + ", type your input between 1 and 9 where you want to put your " + game.player2.getLogo() + " : ");
                inputP2 = scanner.nextInt();
                game.player2.setInput(inputP2);
            }
            catch (InputMismatchException e)
            {
                System.out.println("You did not type a number.");
                scanner.next();
            }
        }
        game.arrayTicTacToe.displayArray();

        while ((inputP1 <= 0) || (inputP1 > 9))
        {
            try
            {
                System.out.print("Please the player 1 " + game.player1.getName() + ", type your input between 1 and 9 where you want to put your " + game.player1.getLogo() + " :  ");
                inputP1 = scanner.nextInt();
                game.player1.setInput(inputP1);
            }
            catch (InputMismatchException e)
            {
                System.out.println("You did not type a number.");
                scanner.next();
            }
        }

        while (!game.arrayTicTacToe.updateArray(game.player1))
        {
            try
            {
                System.out.print("Please the player 1 " + game.player1.getName() + ", type your input between 1 and 9 where you want to put your " + game.player1.getLogo() + " :  ");
                inputP1 = scanner.nextInt();
                game.player1.setInput(inputP1);
            }
            catch (InputMismatchException e)
            {
                System.out.println("You did not type a number.");
                scanner.next();
            }
        }
        game.arrayTicTacToe.displayArray();
    }

    public void gameLogicP1(Game game)
    {
        int inputP1 = 10;
        int inputP2 = 10;
        Scanner scanner = new Scanner(System.in);

        while ((inputP1 <= 0) || (inputP1 > 9))
        {
            try
            {
                System.out.print("Please the player 1 " + game.player1.getName() + ", type your input between 1 and 9 where you want to put your " + game.player1.getLogo() + " : ");
                inputP1 = scanner.nextInt();
                game.player1.setInput(inputP1);
            }
            catch (InputMismatchException e)
            {
                System.out.println("You did not type a number.");
                scanner.next();
            }

        }
        while (!game.arrayTicTacToe.updateArray(game.player1))
        {
            try
            {
                System.out.print("Please the player 1 " + game.player1.getName() + ", type your input between 1 and 9 where you want to put your " + game.player1.getLogo() + " : ");
                inputP1 = scanner.nextInt();
                game.player1.setInput(inputP1);
            }
            catch (InputMismatchException e)
            {
                System.out.println("You did not type a number.");
                scanner.next();
            }
        }

        game.arrayTicTacToe.displayArray();

        while ((inputP2 <= 0) || (inputP2 > 9))
        {
            try
            {
                System.out.print("Please the player 2 " + game.player2.getName() + ", type your input between 1 and 9 where you want to put your " + game.player2.getLogo() + " :  ");
                inputP2 = scanner.nextInt();
                game.player2.setInput(inputP2);
            }
            catch (InputMismatchException e)
            {
                System.out.println("You did not type a number.");
                scanner.next();
            }
        }
        while (!game.arrayTicTacToe.updateArray(game.player2))
        {
            try
            {
                System.out.print("Please the player 2 " + game.player2.getName() + ", type your input between 1 and 9 where you want to put your " + game.player2.getLogo() + " :  ");
                inputP2 = scanner.nextInt();
                game.player2.setInput(inputP2);
            }
            catch (InputMismatchException e)
            {
                System.out.println("You did not type a number.");
                scanner.next();
            }
        }
        game.arrayTicTacToe.displayArray();
    }
}
