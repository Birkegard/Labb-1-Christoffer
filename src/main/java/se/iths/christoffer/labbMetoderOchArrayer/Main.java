package se.iths.christoffer.labbMetoderOchArrayer;

public class Main {
    public static void main(String[] args) {

        String[] greeting = {"Hello", "world", "!"};
        int[] numbers = {3, 5, 8, 10, 7, 15, 2, 12};
        double num1 = 8.7;
        double num2 = 16.3;

        helloWorld(greeting);

        System.out.println("Det största talet i arrayen är: " + maxInArray(numbers));

        System.out.println("Det största talet av de två doubletalen är: " + biggestNumber(num1, num2));

        System.out.println(createFullName("Christoffer", "Birkegård"));
    }

    private static void helloWorld(String[] greeting) {

        for (String greet : greeting) {

            System.out.println(greet);
        }
    }

    private static int maxInArray(int[] numbers) {
        int max = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }

        }
        return max;

    }

    private static double biggestNumber(double num1, double num2) {

        return Math.max(num1, num2);
    }

    private static String createFullName(String firstname, String lastname) {

        return firstname + " " + lastname;
    }
}