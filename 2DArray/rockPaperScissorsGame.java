import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Rock Paper Scissors Game

        // Declare Variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Get Choice From the User (create array of choices)
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            // Get Choice From The User
            System.out.print("Enter your move (rock, paper, or scissors): ");
            playerChoice = scanner.nextLine().toLowerCase(); //in case the user types in any uppercases letters it will print it in lowercases still

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                //this is being done to make sure didn't put invalid input
                System.out.println("Invalid choice");
                continue; //if the user picks smth invalid, then we will skip the rest of the program and go back to beginning
            }

            // Get Random Choice From The Computer
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            // Check Win Conditions (created nested if statements)
            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper") ){
                System.out.println("You win!");
            }
            else{
                System.out.println("You lose!");
            }

            // Ask to Play Again?
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        // Goodbye Message
        System.out.println("Thanks for playing!");


        scanner.close();

    }

}
