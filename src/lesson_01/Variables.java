package lesson_01;

public class Variables {
    public static void main(String[] args) {

        byte myByte = 25;
        short myShort;
        myShort = 345;
        int myInt = 2_134_656_450;
        long myLong = 23_43_242_343_244_423_234L;
        float myFloat = 23.5f;
        double myDouble = 2343443534543.5645353453453534534414123213432;
        boolean myTrue = true;
        boolean myFalse = false;
        char myChar = '\u20ac';
        char myChar2 = '7';
        char myChar3 = 'b';

        System.out.println("myByte = " + myByte);
        System.out.println("myShort = " + myShort);
        myShort = 1000;
        System.out.println("myShort = " + myShort);
        System.out.println("myInt = " + myInt);
        System.out.println("myLong = " + myLong);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);
        System.out.println("myFalse = " + myFalse);
        System.out.println("myTrue = " + myTrue);
        System.out.println("myChar = " + myChar);
        System.out.println("myChar2 = " + myChar2);
        System.out.println("myChar3 = " + myChar3);


        // The long was of writing String
        String myName = new String("Alex");
        System.out.println("myName = " + myName);

        // The short was of writing String
        String lastName = "Komanov";

        System.out.println("lastName = " + lastName);


    }
}
