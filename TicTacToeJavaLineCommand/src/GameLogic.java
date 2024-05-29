import java.util.InputMismatchException;
import java.util.Scanner;

public class GameLogic
{
    private int nbMovesPlayer1 = 0;
    private int nbMovesPlayer2 = 0;

    public int gameLogicP2(Game game)
    {
        int inputP1 = 10;
        int inputP2 = 10;
        Scanner scanner = new Scanner(System.in);

    // Input player2
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
    // Update input in arrayTictactoe
        while (!game.arrayTicTacToe.updateArray(game.player2))
        {
            inputP2 = 10;
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

        }
        game.arrayTicTacToe.displayArray();
        nbMovesPlayer2++;

        if (nbMovesPlayer2 >= 3)
            if (game.arrayTicTacToe.checkVictoryArrayPlayer2(game))
                return (1);


    // Input player1
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
            while ((inputP1 <= 0) || (inputP1 > 9))
            {
                inputP1 = 10;
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
        }
        game.arrayTicTacToe.displayArray();

        nbMovesPlayer1++;
        if (nbMovesPlayer1 >= 3)
            if (game.arrayTicTacToe.checkVictoryArrayPlayer1(game))
                return (1);
        return (0);
    }




    public int gameLogicP1(Game game)
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
        while (!(game.arrayTicTacToe.updateArray(game.player1)))
        {
            inputP1 = 10;
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
        }
        game.arrayTicTacToe.displayArray();
        nbMovesPlayer1++;

        if (nbMovesPlayer1 >= 3)
            if (game.arrayTicTacToe.checkVictoryArrayPlayer1(game))
                return (1);

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
            inputP2 = 10;
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

        }
        game.arrayTicTacToe.displayArray();
        nbMovesPlayer2++;

        if (nbMovesPlayer2 >= 3)
            if (game.arrayTicTacToe.checkVictoryArrayPlayer2(game))
                return (1);

        return (0);
    }
}
