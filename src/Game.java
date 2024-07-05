import java.util.Random;
import java.util.Scanner;

class Game {
    int rand;
    int user;
    int noOfGuesses=0;
    Scanner sc = new Scanner(System.in);

    Game() {
        Random random = new Random();
        rand = random.nextInt(1,100);
    }

    public void takeUserInput() {
        System.out.println("Guess the number");
        user=sc.nextInt();
        if(user>=1 && user<=100);
        else {
            System.out.println("Try again,,,the number should be between 1 and 100");
            this.takeUserInput();
        }
    }

    public boolean isCorrectNumber() {
        noOfGuesses++;
        if (user == rand) {
            System.out.println("you guessed it right!");
            System.out.println("The number was "+rand);
            System.out.println("you guessed it in "+noOfGuesses+" attempts");
            return true;
        } else if (user > rand) {
            System.out.println("number is less than " + user);
        } else if (user < rand) {
            System.out.println("number is greater than " + user);
        }
        return false;
    }
}