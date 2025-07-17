import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data
        // also known as multi-dimensional arrays

        //String[] fruits = {"apple","orange","banana"};
        //String[] vegetables = {"potato","onion","carrot"};
        //String[] meats  = {"chicken", "pork", "beef", "fish"};

        //2D Array of Strings. And each element in this 2D array will be an array.
        //String[][] groceries = {fruits, vegetables, meats};

        String[][] groceries = {{"apple","orange","banana"},
                {"potato","onion","carrot"},
                {"chicken", "pork", "beef", "fish"}};


        //if you need to access or change an element, you will need to use 2 indiecs[][] .
        groceries[2][1] = "eggs"; //[row][col]

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }

}
