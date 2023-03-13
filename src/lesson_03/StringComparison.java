package lesson_03;

public class StringComparison {
    public static void main(String[] args) {

        String username = "Alexander";
        String actualUsername = "Alexander";

        System.out.println("username == actualUsername -> " + (username == actualUsername));

        System.out.println("ab" == "ab");

        String expectedName = new String("Alexander");
        System.out.println("actualUsername == expectedName-> " + (actualUsername == expectedName));


        System.out.println("username.equals(actualUsername) = " + username.equals(actualUsername));
        System.out.println("actualUsername.equals(expectedName) = " + actualUsername.equals(expectedName));
        System.out.println("expectedName.equalsIgnoreCase('alexandeR') = " + expectedName.equalsIgnoreCase("alexandeR"));
    }
}
