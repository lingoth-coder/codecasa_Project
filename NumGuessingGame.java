import java.util.Random;
import java.util.Scanner;

public class NumGuessingGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 7;
        int totalScore = 0;

        System.out.println("\nWelcome to the Number Guessing Game ^_^ ");
        System.out.println("\nTry to guess the number between 1 and 100 ");
        System.out.println("\nHow many rounds do u want to play ? ");
        int totalRounds = scanner.nextInt();

        for (int round = 1; round <= totalRounds; round++) {
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int roundScore = 100;
            System.out.println("\n-----------");
            System.out.println("Round " + round);
            System.out.println("-----------");

            while (attempts < maxAttempts) {
            
                System.out.println("Attempt " + (attempts + 1) + ": Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    roundScore -= (attempts - 1) * 10;
                    System.out.println("Round Score: " + roundScore);
                    totalScore += roundScore;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again :(");
                } else {
                    System.out.println("Too high! Try again :(");
                }

                int remainingAttempts = maxAttempts - attempts;
                System.out.println("Remaining attempts: " + remainingAttempts+"\n\n");

                if (attempts == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. \nThe correct number was " + secretNumber);
                }
        
            }

            System.out.println("End of Round " + round+"\n");
            System.out.println("Total Score: " + totalScore);
        }
        System.out.println("*************");
        System.out.println("\nGame Over!");
        System.out.println("Your Final Score: " + totalScore);


        scanner.close();
    }
}
