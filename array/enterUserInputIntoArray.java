import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Enter User Input Into an Array

        Scanner scanner = new Scanner(System.in);

        //Before assigning values into an array our compiler needs to know the
        //size of the array beforehand. We have to first allocate the space for the array.
        //String[] foods = new String[4]; //we are creating an empty array that has
        // space for 3 elements

        /*
        foods[0] = "pizza"; //assigning value
        foods[1] = "taco";
        foods[2] = "hamburger";
        */

        //we will have users enter the # of food they would like
        String[] foods; //created string array of foods
        int size;

        System.out.print("What number of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine(); //to clear the input buffer. just consumes/skips the current line

        foods = new String[size]; //instantiating it


        //for loop to iterate over the length of our array
        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter food: ");
            foods[i] = scanner.nextLine(); //to accept the user input
        }




        for(String food : foods){
            System.out.println(food);
        }


        scanner.close();

    }

}
