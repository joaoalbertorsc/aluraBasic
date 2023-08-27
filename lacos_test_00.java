package alura_basic;

public class lacos_test_00 {
    public static void main(String[] args) {
        for (int mult = 1; mult <= 10; mult++) {
            for (int counter = 0; counter <= 10; counter++) {
                System.out.print(mult * counter);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
// print all multiples of each num from 1 to 10.