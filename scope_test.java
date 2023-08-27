package alura_basic;

public class scope_test {
    public static void main(String[] args) {
        System.out.println("Testing conditions 18/08/2022.");

        int years = 20;
        int numberOfPeople = 3;
        boolean accompanied;

        if (numberOfPeople >= 2) {

            // doesnt work
            // either not

            accompanied = true;

            // here it works
            // var works just on its own {...}
            // out of its {...} it wont work

        } else {

            // var accompanied not works here
            // either here

            accompanied = false;

            // works here
            // and here till the {} close
        }

        System.out.println("Accompanied value = " + accompanied);
        if (years >= 18 || accompanied) {
            System.out.println("Welcome to the Jungle!");
        } else {
            System.out.println("Sorry. You may not enter.");
        }
    }
}