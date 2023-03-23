package lesson_05.homeTasks;

public class WhileLoopTask {
    public static void main(String[] args) {

        int counter = 0;
        int summary = 0;
        while (counter <= 500) {


            if (counter == 100) {
                break;
            }

            if (counter % 4 == 0) {
                counter++;
                continue;
            }



            if (counter % 7 == 0) {
                System.out.print(counter + " ");
                summary+=counter;
            }

            counter++;
        }

        System.out.println();
        System.out.println("\n\tsummary = " + summary);
    }
}
