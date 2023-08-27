package alura_basic;

public class lacos_test_01 {
    public static void main(String[] args) {
        for (int line = 0; line < 10; line++) {
            for (int colum = 0; colum <= line; colum++){
                System.out.print("&");
            }
            System.out.println();
        }
    }
}
