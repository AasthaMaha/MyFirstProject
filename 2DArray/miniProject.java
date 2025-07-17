import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data

        // Mini Project: creating a 2D array that resembles a telephone number pad

        char[][] telephone = {{'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}};

        //display the data. have to use nested for loop for 2D arrays
        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }

}
