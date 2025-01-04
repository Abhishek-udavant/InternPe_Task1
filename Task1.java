import java.util.Random;
import java.util.Scanner;

public class Task1 {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain = "yes";

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain.equalsIgnoreCase("yes")) {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int guess = -1;
            int attempts = 0;

            System.out.println("I have picked a number between 1 and 100. Can you guess it?");

            while (guess != randomNumber) {
                System.out.print("Enter your guess : ");

                // Validate input to ensure it's an integer
                if (scanner.hasNextInt()) {
                    guess = scanner.nextInt();
                    attempts++;

                    if (guess == randomNumber) {
                        System.out.println("Congratulations! You guessed the number!");
                        System.out.println("It took you " + attempts + " attempts.");
                    } else if (guess > randomNumber) {
                        System.out.println("Your guess is too high. Try again.");
                    } else {
                        System.out.println("Your guess is too low. Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next(); // Clear the invalid input
                }
            }

            System.out.print("Would you like to play again? (yes/no): ");
            playAgain = scanner.next();
        }

        System.out.println("Thank you for playing! Goodbye!");
        scanner.close();
    }
}
