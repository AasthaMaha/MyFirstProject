import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple","orange","banana","coconut"};

        //fruits[0] = "pineapple"; //by specifying an element you can change any index
        //int numberOfFruits = fruits.length; //to access the length of the array
        /*
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        */

        //to sort your array, there is a built-in sort method. import java.util.Arrays;
        //Arrays.sort(fruits);

        //there is a fill method within arrays. we can fill all the elements
        // of an array with a given value
        Arrays.fill(fruits, "pineapple");


        //enhanced for loop will cycle once for each element of the array also
        // known as a for each loop. It simplifies iterating through a collection.
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

    }

}
