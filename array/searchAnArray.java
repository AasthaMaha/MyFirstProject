import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Search through elements of an array

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,9,3,4,2,8,5};
        String[] fruits = {"apple","orange", "banana"};
        boolean isFound = false;
        String target;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        //linear search. will be using for loop to iterate through these
        // elements and see if there is a match.
        for(int i = 0; i < fruits.length; i++){
            //if we are comparing the values of the string then we will use the .equals method
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break; //if we find the target then break out the loop
            }
        }

        if (!isFound){
            System.out.println("Element is not found in the array");
        }

        scanner.close();

    }

}
