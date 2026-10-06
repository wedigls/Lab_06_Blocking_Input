import java.util.Scanner;
import java.util.Random;

public class HighorLow
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        boolean done = false;
        int rndVal = gen.nextInt(10) + 1;
        int userGuess = 0;
        String trash = "";

        do
        {
            IO.print("Enter your guess [1-10]: ");

            if (in.hasNextInt())
            {
                userGuess = in.nextInt();
                in.nextLine();

                if (userGuess >= 1 && userGuess <= 10)
                {
                    done = true;
                }
                else
                {
                    IO.println("Your guess must be between 1 and 10, not: " + userGuess + ", Please try again.");
                }
            }
            else
            {
                trash = in.nextLine();
                IO.println("Your guess must be a valid integer, not: " + trash + ", Please try again.");
            }
        } while (!done);

        IO.println("Your guess was: " + userGuess);
        IO.println("The number was: " + rndVal);

        if (userGuess < rndVal)
        {
            IO.println("Your guess was too low");
        }
        else if (userGuess > rndVal)
        {
            IO.println("Your guess was too high");
        }
        else
        {
            IO.println("Congrats! You guessed the number!");
        }
    }
}
