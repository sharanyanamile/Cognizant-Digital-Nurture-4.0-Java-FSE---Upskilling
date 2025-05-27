import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Guess the number (1-100): ");
            guess = sc.nextInt();
            if (guess > numberToGuess)
                System.out.println("Too high!");
            else if (guess < numberToGuess)
                System.out.println("Too low!");
            else
                System.out.println("Correct! You guessed the number.");
        } while (guess != numberToGuess);
    }
}
