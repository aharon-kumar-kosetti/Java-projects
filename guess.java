import java.util.Scanner;
import java.util.Random;
public class guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1; int chances =0;
        System.out.println("Enter The Game?\n1. Yes\n2. No");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Game Started");
        }else{
            System.out.println("Thank you...");
            return;
        }
        while (i != 0) {
            Random rand = new Random();
            int num = rand.nextInt(100);
            System.out.println("Welcome to the Number Guessing Game!\r\n" + //
                    "I'm thinking of a number between 1 and 100.\n");
            System.out.println("Please select the difficulty level:\r\n" + //
                                "1. Easy (10 chances)\r\n" + //
                                "2. Medium (5 chances)\r\n" + //
                                "3. Hard (3 chances)\n");
            System.out.println("Enter Your choice:  ");
            choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Great! You have selected the Easy difficuly level.");
                chances = 10; 
            }else if(choice == 2){
                System.out.println("Great! You have selected the Medium difficuly level.");
                chances = 5;
            }else if(choice == 3){
                System.out.println("Great! You have selected the Hard difficuly level.");
                chances = 3;
            }else{
                System.out.println("Invalid Choice!!");
                return;
            }
            System.out.println("Let's Start the game!\n");
            for(i = 0; i< chances; i++){
                System.out.println("Enter your Guess:   ");
                int guess = sc.nextInt();
                if(num == guess){
                    System.out.println("Congratulations! You guessed the correct number in " + (i+1) + " attempts.");
                    return;
                }else{
                    if(guess > num){
                        System.out.println("Incorrect! The number is less than "+ guess);
                    }else{
                        System.out.println("Incorrect! The number is greater than "+ guess);
                    }
                }
            }
            System.out.println("You have used all your chances. Better Luck next time.\n" + "The number is " + num + "\n\n");
        }
    }
}
