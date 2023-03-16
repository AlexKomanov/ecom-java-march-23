package lesson_04.conditions;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("You are adult!");
        }
        else if (age == 18) {
            System.out.println("You are 18 years old!");
        }
        else {
            System.out.println("You're a child...");
        }
    }
}
