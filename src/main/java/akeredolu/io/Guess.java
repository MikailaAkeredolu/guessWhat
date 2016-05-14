package akeredolu.io;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by mikailaakeredolu on 5/13/16.
 */
public class Guess {

    public  int prevGuess;
    public  int currentGuess;
    public  int counter = 0;
    public  boolean win = true;

    public Guess(){

    }

    public  int randomNumber;
    Random random = new Random();


    public int getGuess(){
        Scanner input = new Scanner(System.in);
        System.out.println("Give us a guess between 1 and 20");
        currentGuess = input.nextInt();
        return currentGuess;
    }

    //compare number

    public  void compareUserGuessToRandomNumber(){

        if(currentGuess < randomNumber){
            System.out.println("too low");

        }else if(currentGuess > randomNumber){
            System.out.println("too high");
        }else {
            System.out.println("You got it! " +  "It took you " + counter + " Tries Fucker!!!");
            win = false;
        }

    }

    public void compareUserGuessToPreviousGuess(){
        if(currentGuess != prevGuess){
            prevGuess = currentGuess;
             counter++;
        }

    }

    public void runGame(){

        randomNumber = random.nextInt(21);

        while(win){
            getGuess();
            compareUserGuessToRandomNumber();
            compareUserGuessToPreviousGuess();
        }

    }


}
