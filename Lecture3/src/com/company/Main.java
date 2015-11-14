package com.company;

public class Main {

    public static int performOperation(int a, int b, int opCode)
    {
        if(opCode==0)
            return a+b;
        if(opCode==1)
            return a-b;
        if(opCode==2)
            return a*b;
        return a/b;
    }


    public static void testA()
    {
        testB();
    }

    public static void testB()
    {
        testC();
    }

    public static void testC()
    {
        int a = 1/0;
    }

    public static int getSum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    public static int[] multiplyByTwo(int[] input)
    {
        int[] newArray = new int[input.length];
        for (int i=0;i<newArray.length;i++)
        {
            newArray[i]=input[i]*2;
        }
        return newArray;
    }

    public static int[] getRange(int start, int end)
    {
        int length = end - start + 1;
        int[] range = new int[length];
        for (int i=0;i<length;i++)
        {
            range[i]= start + i;
        }
        return range;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i]==0)
                return;

            System.out.println("I am inside");

        }
        System.out.println("I am outside");
    }

    public static void printMultiplied(int[] array)
    {
        int[] placeholder = array.clone();


        for(int i=0;i<array.length;i++)
        {
            placeholder[i]*=4;
        }
        printArray(placeholder);
    }

    public static void printInt(int a)
    {
        System.out.println(a);
    }

    public static void printMultiplied(int a)
    {
        a*=4;
        printInt(a);
    }

    public static void main(String[] args) {
        /*int[] range = getRange(-5, 5);
        printArray(range);
        System.out.println();

        int[] newArray = multiplyByTwo(range);
        printArray(newArray);

        printMultiplied(newArray);
        printArray(newArray);*/
        /*
        int testSubject = 42;
        printInt(testSubject);
        printMultiplied(testSubject);
        printInt(testSubject);
        */
        /*
        int[] range = getRange(0,5);

        printArray(range);
        printMultiplied(range);
        printArray(range);

        Integer.parseInt("42");
        Double.parseDouble("42");

        int a = 1;
        */
        //testA();
        /*
        int a = 42 % 5;
        int b = 42 / 5;
        double number = 42.0 / 5.0;

        int b2 = (int) (42.0 / 5.0);
        printInt(a);
        printInt(b);
        printInt(b2);

        String myString = "Hello world";
        System.out.println(myString.indexOf("world"));
        */
        /*
        int[] range = getRange(-5,5);
        printArray(range);
        */
        int a = 5;
        int b = 2;
        System.out.println(performOperation(a,b,0));
        System.out.println(performOperation(a,b,1));
        System.out.println(performOperation(a,b,2));
        System.out.println(performOperation(a,b,3));
    }

}
