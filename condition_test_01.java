package alura_basic;

public class condition_test_01 {
    public static void main(String[] args) {
        System.out.println("Testing conditions 18/08/2022.\n\n");

        int years = 10;
        int numberOfPeople = 2;
        boolean accompanied = numberOfPeople >= 2;

        if (years < 18 && accompanied) {
            System.out.println("Younger 18 accompanied:");
            System.out.println("Welcome to the Jungle!");
        } else if (years < 18) {
            System.out.println("Younger 18 single:");
            System.out.println("Sorry. You may not enter!");
        } else {
            System.out.println("Older 18:");
            System.out.println("Welcome to the Jungle!");
            }
            // if and else always use {}
            // can be not used when is just one condition under if or else
        }
    }
