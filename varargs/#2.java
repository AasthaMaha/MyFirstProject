import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // varargs = allows a method to accept varying # of arguments
        //           makes methods more flexible, no need for overloaded mehtods
        //           java will pack the arguments into an array
        //           ...(ellipsis)
        // varargs stands for variable arguments

        // WE WILL CREATE A METHOD OF AVERAGE

        System.out.println(average());

    }

    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }


        for (double number : numbers){
            sum += number;
        }

        return sum / numbers.length;

    }

}
