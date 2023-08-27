package alura_basic;

public class condition_test_00 {
    public static void main(String[] args) {
        System.out.println("Testing conditions 17/08/2022.\n\n");

        int years = 16;
        int accompanied = 2;
        if (years >= 18) {
            System.out.println("You're older than 18 years old.\n");
            System.out.println("Welcome to the Jungle!\n");
        } else if (accompanied >= 2) {
            System.out.println("You and your companie can get in.\n" + "Welcome to the jungle!");
        } else {
            System.out.println("Sorry.\n" + "You may not enter.");
        }
    }
    // if and else always use {}
    // can be not used when is just one condition under if or else
}
