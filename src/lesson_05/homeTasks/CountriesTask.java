package lesson_05.homeTasks;

import java.util.ArrayList;

public class CountriesTask {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Israel");
        countries.add("USA");
        countries.add("England");
        countries.add("Ukraine");
        countries.add("Egypt");
        countries.add("Russia");
        countries.add("Belarus");
        countries.add("Canada");
        countries.add("Mexico");
        countries.add("Italy");

        System.out.println("========== option1 - for loop ============");
        for (int i = 0; i < countries.size(); i++) {
            System.out.print(countries.get(i) + " ");
        }
        System.out.println();
        System.out.println("========== option2 - while loop ============");

        int i = 0;
        while (i < countries.size()) {
            System.out.print(countries.get(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println("========== option3 - For-Each loop ============");


        for (String name : countries) {
            System.out.print(name + " ");
        }
        System.out.println();

        System.out.println("========== option4 - forEach loop ============");

        countries.forEach((name) -> System.out.print(name + " "));
    }
}
