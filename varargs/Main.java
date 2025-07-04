import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // varargs = allows a method to accept varying # of arguments
        //           makes methods more flexible, no need for overloaded mehtods
        //           java will pack the arguments into an array
        //           ...(ellipsis)
        // varargs stands for variable arguments

        System.out.println(add(1,2,3,4,5,6,6,7,8,1)); //when we call the add method, we can send any # of arguments.
        // and they will be packed into an array

        // what's happening here is that basically, java compiler is packing all these arguments
        // into an array, when we send them to a method. then within the context of this method,
        // we just need to work with this array. one way or another

    }

    static int add(int... numbers){

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return sum;

    }

}
