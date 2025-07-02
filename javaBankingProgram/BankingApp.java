import java.util.Scanner;

public class DiceRoller {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Java Banking Program for Beginners

        // 1. Declare Variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            // 2. Display Menu
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            // 3. Get and Process Users Choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit(); //can also say balance += deposit();
                case 3 -> balance = balance - withdraw(balance); //can also say balance -= withdraw(balance);
                case 4 -> isRunning = false; //for exit
                default -> System.out.println("Invalid choice");
            }
        }

        //7.Exit Message
        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("***************************");


        scanner.close();
    }

    //4.showBalance() , method in order to show the balance to the user
    static void showBalance(double balance) {
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }
    //5.deposit()
    static double deposit() {

        double amount; //user will type in the amount they are depositing

        System.out.print("Enter amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else {
            return amount;
        }


    }
    //6.withdraw()
    static double  withdraw(double balance) {

        double amount;

        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else {
            return amount;
        }


    }

}
