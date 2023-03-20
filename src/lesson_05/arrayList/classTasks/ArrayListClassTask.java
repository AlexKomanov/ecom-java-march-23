package lesson_05.arrayList.classTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClassTask {
    public static void main(String[] args) {

        double summary = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        int firstNumber = scanner.nextInt();
        summary += firstNumber;
        System.out.println("Please enter number 2: ");
        int secondNumber = scanner.nextInt();
        summary += secondNumber;
        System.out.println("Please enter number 3: ");
        int thirdNumber = scanner.nextInt();
        summary += thirdNumber;

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(firstNumber);
        arrayList.add(secondNumber);
        arrayList.add(thirdNumber);


        int biggestNumber = (arrayList.get(0) > arrayList.get(1)) ? arrayList.get(0) : arrayList.get(1);

        biggestNumber = (arrayList.get(2) > biggestNumber) ? arrayList.get(2) : biggestNumber;

        System.out.println("biggestNumber = " + biggestNumber);
        System.out.println("(summary / 3.0) = " + (summary / 3.0));
        System.out.println(arrayList);
    }
}
