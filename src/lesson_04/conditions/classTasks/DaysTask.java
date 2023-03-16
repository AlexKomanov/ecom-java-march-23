package lesson_04.conditions.classTasks;

import java.util.Scanner;

public class DaysTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number (1 - 7): ");

        int day = scanner.nextInt();

        switch (day) {
            //if(day == 1)
            case 1:
                System.out.println("The day is Sunday");
                break;
            //if(day == 2)
            case 2:
                System.out.println("The day is Monday");
                break;
            case 3:
                System.out.println("The day is Tuesday");
                break;
            case 4:
                System.out.println("The day is Wednesday");
                break;
            case 5:
                System.out.println("The day is Thursday");
                break;
            case 6:
                System.out.println("The day is Friday");
                break;
            case 7:
                System.out.println("The day is Shabes");
                break;
            default:
                System.out.println("The day is not valid");
                break;
        }


    }
}
