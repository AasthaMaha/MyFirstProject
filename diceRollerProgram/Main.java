import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Java Dice Roller Program

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //1. Declare Variables
        int numOfDice; //# of how many dices we are rolling
        int total = 0;


        //2.Get # of Dice From the User
        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();


        //3.Check if # Of Dice > 0
        if (numOfDice > 0) {

            //4.Roll All The Dice
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1,7); // gives us a random # btw 1-6
                printDie(roll);
                System.out.println("You rolled: " + roll);

                //5. Get The Total
                total = total + roll;
            }
            System.out.println("Total: " + total);

        }
        else {
            System.out.println("# of dice must be greater than 0");
        }


        scanner.close();

    }

    //6. Display ASCII of Dice
    static void printDie(int roll){

        String dice1 = """
                -------
               |       |
               |   •   |
               |       |
                -------
               """;  // this is a multi line string

        String dice2 = """
                -------
               | •     |
               |       |
               |     • |
                -------
               """;  // this is a multi line string

        String dice3 = """
                -------
               | •     |
               |   •   |
               |     • |
                -------
               """;  // this is a multi line string

        String dice4 = """
                -------
               | •   • |
               |       |
               | •   • |
                -------
               """;  // this is a multi line string

        String dice5 = """
                -------
               | •   • |
               |   •   |
               | •   • |
                -------
               """;

        String dice6 = """
                -------
               | •   • |
               | •   • |
               | •   • |
                -------
               """;

        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");
        }

    }

}
