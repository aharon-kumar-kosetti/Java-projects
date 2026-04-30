import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Game?\n1. Yes\n2. No");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Game Started");
        }else{
            System.out.println("Thank you...");
            return;
        }
        while (true) {
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
            }else if(choice == 2){
                System.out.println("Great! You have selected the Medium difficuly level.");
            }else if(choice == 3){
                System.out.println("Great! You have selected the Difficult difficuly level.");
            }else{
                System.out.println("Invalid Choice!!");
            }
            System.out.println("Let's Start the game!");
        }
    }
}
