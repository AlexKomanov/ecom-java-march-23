package lesson_05.arrays.classTasks;

import java.util.Scanner;

public class DanClassTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberArray[] = new int[3];
        System.out.println("Please enter the first number");
        numberArray[0] = scanner.nextInt();
        System.out.println("Please enter the second number");
        numberArray[1] = scanner.nextInt();
        System.out.println("Please enter the third number");
        numberArray[2] = scanner.nextInt();

        int biggestNumber = (numberArray[0] > numberArray[1] ) ? numberArray[0] : numberArray[1];

        biggestNumber = (biggestNumber > numberArray[2]) ? biggestNumber : numberArray[2];

        System.out.println("Biggest Number = " + biggestNumber);
    }
}
