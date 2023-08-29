import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int score = 0;

        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Round " + (rounds + 1));
            System.out.println("Guess a number between " + minRange + " and " + maxRange);

            int attempts = 0;
            boolean correctGuess = false;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number " + targetNumber);
                    correctGuess = true;
                    score += (maxAttempts - attempts + 1);
                    break;
                }
            }

            if (!correctGuess) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + targetNumber);
            }

            rounds++;
            System.out.println("Your current score: " + score);
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing! Your final score: " + score);
        scanner.close();
    }
}
