/*
 * Play.java
 *
 * Created on 23. April 2019
 *
 * Copyright(c) {2019} Ulrich Rosenbaum  All Rights Reserved.
 * This software is the proprietary information of Ulrich Rosenbaum.
 *
 */
import java.util.Random;
import java.util.Scanner;
//import java.nio;
public class Main {

    public static void main(String[] args) {
        System.out.println("Guess the number!");
        Random rand = new Random();
        // Sample StringBuffer
        StringBuffer sbuffer = new StringBuffer();
        String playAgain = "Y";
        String newGame = "Y";
        if (newGame == "Y") {
            do {
                int counter = 0;
                int guess = rand.nextInt(100);
                guess += 1;
                EndOfGame eog = new EndOfGame(); //In order to use printMessage method you need to create an instance of EndOfGame

                int playersguess = 0;

                Scanner input = new Scanner(System.in);
                System.out.println("\nPlease enter your name: ");
                String playersname = input.nextLine();
                System.out.println("\nDear " + playersname + " have fun playing this game!");
                System.out.println("\nTry to guess the number between 1 and 100.");
                System.out.println("\nThe goal is to use as few guesses as possible. Train your brain!");

                // Files.lines(new File("c:/myfile.txt").toPath()).forEach(System.out::println);


                do {
                    System.out.println("\nEnter your guess: ");
                    playersguess = input.nextInt();
                    counter++;

                    if (playersguess <= 0 || playersguess > 100) {
                        System.out.println("Invalid guess.");
                        System.out.println("Your guess must be between 1 and 100!");

                        counter = counter - 1;
                    }
                    if (playersguess < guess & playersguess > 0) {
                        System.out.println("Your guess is too small");
                    } else if (playersguess > guess & playersguess < 101)
                        System.out.println("Your guess is too big!");
                }
                while (playersguess != guess);
                System.out.println("\nWell done " + playersname + "! You guessed the secret number! Bravo!");
                System.out.println("\nYou needed " + counter + " guesses.");
                //eog.printMessage(); //then call the method

                Scanner inputPlayAgain = new Scanner(System.in);
                System.out.println("\nDo you want to play again? Y or N: ");
                newGame = inputPlayAgain.nextLine();
                System.out.println("\nYou entered: " + newGame);
                //playAgain = newGame;

            } while (newGame.equals("Y"));
        }
    }
}