import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Interactive Quiz Game


        // QUESTIONS array[]
        String[] questions = {"What is the main fuction of a router",
                "Which part of the computer is considered the brain?",
                "What year was facebook launched?",
                "Whoe is know as the father of computer?",
                "What was the first programming language?",};

        //OPTIONS array[][]
        String[][] options = {{"1. Storing files", "2. Encrypting data", "3.Directing internet traffic", "4.Managing passwords"},
                {"1. CPU","2. Hard Drive","3. RAM","4. GPU"},
                {"1. 2000","2. 2004","3. 2006","4. 2008"},
                {"1. Steve Jobs","2. Bill Gates","3. Alan Turning","Charles Babbage"},
                {"1. COBOL","2. C","3. Fortran","4. Assembly"}};

        //DECLARE VARIABLES
        int[] answers = {3, 1, 2, 4, 3}; //our answer key
        int score = 0;
        int guess; //this will be whatever the user types in (1-4)

        Scanner scanner = new Scanner(System.in);

        //WELCOME MESSAGE
        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");

        //QUESTIONS (loop)  .we will loop through all the questions we had
        for(int i = 0; i < questions.length; i++ ){
            System.out.println(questions[i]);

            //OPTIONS (inside the loop). after each question we want to display the answer choices

            for(String option: options[i]){
                System.out.println(option);
            }

            //GET GUESS FROM USERS (inside the loop)

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt(); //user will type in #1-4

            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                //CHECK OUR GUESS (inside the loop)
                score++;
            }
            else{
                System.out.println("********");
                System.out.println(" Wrong! ");
                System.out.println("********");
            }

        }

        // DISPLAY FINAL SCORE
        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();

    }

}
