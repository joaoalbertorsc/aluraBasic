package alura_basic;

public class sum_test {
    public static void main(String[] args) {
        int counter = 0;
        int total = 0;

        while(counter <= 10) {
            total += counter;
            counter ++;
        }
        System.out.println(total);
    }
}
