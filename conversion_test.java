package alura_basic;

public class conversion_test {
    public static void main(String[] args){
        double salario = 1270.50;
        int valor = (int) salario;
            // (int) means "type cast"
            // to allow using "salario" (a double value) as an int value.
            // like "read as (int)"
        System.out.println(valor);

        long numeroGrande = 12311414141412L;
        short valorPequeno = 2131;
        byte b = 127;

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
        System.out.println(total);
    }
}
