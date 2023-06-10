import java.util.Random;
import java.util.Scanner;

public class Oasis_Infobyte_T02_Numberguessing {
    public static void main(String[] args) {
        int minNumber = 1;
        int maxNumber = 100;
        int targetNumber;
        int guess;
        int attempts = 0;
        int maxAttempts = 10;
        int score = 0;
        boolean gameOver = false;

        Random random = new Random();
        targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            System.out.println("Round " + (score + 1));
            System.out.println("I'm thinking of a number between " + minNumber + " and " + maxNumber);

            while (!gameOver && attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess < targetNumber) {
                    System.out.println("Too low!");
                } else if (guess > targetNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts!");
                    score++;
                    gameOver = true;
                }
            }

            if (!gameOver) {
                System.out.println("Game over! You couldn't guess the number. The correct number was: " + targetNumber);
            } else {
                System.out.println("Your current score: " + score);
                System.out.print("Do you want to play another round? (y/n): ");
                String playAgain = scanner.next();
                if (playAgain.equalsIgnoreCase("y")) {
                    targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
                    attempts = 0;
                    gameOver = false;
                } else {
                    System.out.println("Thank you for playing the Number Guessing Game!");
                }
            }
        } while (!gameOver);

        scanner.close();
    }
}