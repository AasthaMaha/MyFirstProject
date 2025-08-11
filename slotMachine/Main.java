import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Java Slot Machine

        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout; //will be added back to balance if you win
        String[] row; //contains our symbols(emojis) that display to the output window
        String playAgain;

        // DISPLAY WELCOME MESSAGE
        System.out.println("*************************");
        System.out.println("   Welcome to Java Slot  ");
        System.out.println(" Symbols: 🌸 🪻 🌺 🌼 🌷 ");
        System.out.println("*************************");

        // PLAY OUR GAME IF BALANCE > 0 (while loop)
        while(balance > 0){

            System.out.println("Current balance: $" + balance);
            // ENTER BET AMOUNT
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine(); //to get rid of the newline character

            //  VERIFY IF BET > BALANCE
            if (bet > balance){
                System.out.println("Insufficient funds");
                continue; //to skip the loop and go back to the beginning
            }
            //  VERIFY IF BET > 0
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0");
                continue;
            }
            //  SUBTRACT BET FROM BALANCE
            else {
                balance -= bet;
            }

            // SPIN ROW
            System.out.println("Spinning...");
            row = spinRow(); //this will return the spinRow method which we are assigning row
            printRow(row);
            // GET PAYOUT (if theres any matches)
            payout = getPayout(row, bet);

            if(payout > 0){
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry You lost this round");
            }

            // ASK TO PLAY AGAIN
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }

        }
        // DISPLAY EXIT MESSAGE
        System.out.println("GAME OVER! Your final balance is: $" + balance);

        scanner.close();
    }

    // PRINT ROW
    static String[] spinRow()  {

        String[] symbols = {"🌸", "🪻", "🌺", "🌼", "🌷"};
        String[] row = new String[3];
        Random random = new Random();

        //we need to generate 3 random symbols (for loop)
        for (int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }

    //we need nto check if there are any matches
    static int getPayout(String[] row, int bet){

        //check if its all the same symbol
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch(row[0]){
                case "🌸" -> bet * 3;
                case "🪻" -> bet * 4;
                case "🌺" -> bet * 5;
                case "🌼" -> bet * 10;
                case "🌷" -> bet * 20;
                default -> 0;
            };
        }
        //checking the first 2 saymbols if they are the same
        else if (row[0].equals(row[1])) {
            return switch(row[0]){
                case "🌸" -> bet * 2;
                case "🪻" -> bet * 3;
                case "🌺" -> bet * 4;
                case "🌼" -> bet * 5;
                case "🌷" -> bet * 10;
                default -> 0;
            };
        }
        //checking the last 2 saymbols if they are the same
        else if (row[1].equals(row[2])) {
            return switch(row[1]){
                case "🌸" -> bet * 2;
                case "🪻" -> bet * 3;
                case "🌺" -> bet * 4;
                case "🌼" -> bet * 5;
                case "🌷" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }


}
