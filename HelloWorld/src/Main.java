import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int integer = 42;
        System.out.println(integer);
        int maxInteger = Integer.MAX_VALUE;
        int minInteger = Integer.MIN_VALUE;
        System.out.println(maxInteger);
        System.out.println(minInteger);
        long myWrongLong = 2147483647 + 10;
        long maxLong = Long.MAX_VALUE;
        System.out.println(myWrongLong);
        System.out.println(maxLong);
        float myFloat = 42.05f;
        double myDouble = 42.62d;
        double fromInteger = integer;
        int fromDouble = (int)myDouble;
        System.out.println(fromInteger);
        System.out.println(fromDouble);



        /*
        String myString = "I am \t\tamazing \rs\ttri\nng\\" + "lalala";
        System.out.println(myString);
        char myChar = 's';
        */
        /*
        byte myLittleByte = Byte.MAX_VALUE;
        System.out.println(myLittleByte);
        */

        /*
        boolean myBool = true;
        boolean myFalse = false;
      //  boolean myOperation = 4 == 5;
        boolean myOperation = !((4 != 5) && (25 == 25))  || (2 >= -2);
        if (myOperation){
            System.out.println("inside if");
        }
        else {
            System.out.println("inside else");
        }
        */
        /*
        // i++ <=> i = i+1
        // i = i+2 <=> i +=2
        int[] myIntegerArray = new int[10];
        myIntegerArray[6] = 30;
        myIntegerArray[1] = 25;

        for(int i=0;i<10;i++){
            System.out.println(myIntegerArray[i]);
        }

        while (myIntegerArray[3]<10)
        {
            myIntegerArray[3]++;
            System.out.println(myIntegerArray[3]);
        }
        */
        /*
        int switchable = 44;

        switch(switchable){
            case 42:
                System.out.println("Hey, it's 42");
                break;
            case 43:
                System.out.println("Hey, it's not 42, it's 43");
                break;
            default:
                System.out.println("Hey, it's something different");
                break;
        }
        */
        

    }
}
