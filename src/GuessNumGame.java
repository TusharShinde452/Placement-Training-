import java.util.Random;
import java.util.Scanner;

public class GuessNumGame {
    public static void main(String[] args) {
        Random  rand=new Random();
        Scanner sc=new Scanner(System.in);

        int nubToGuess=rand.nextInt(100)+1;
        int nunOfTries=0;
        int guess = 0;
        boolean hasGuessedCorrectly=false;

        System.out.println("guess any num between 1 to 100:");
        while (!hasGuessedCorrectly){
            System.out.println("enter your guess num:");
            guess=sc.nextInt();
            nunOfTries++;

        if(guess<nubToGuess){
            System.out.println("your num is low try again:");
        } else if (guess>nubToGuess) {
            System.out.println("your num is high than guess num");
        }else {
            hasGuessedCorrectly = true;
            System.out.println("correct you guess the number in " + nunOfTries + " tries");
        }}sc.close();
    }
}
