import java.util.Scanner;

public class ContandoNumeros {

    public static void main(String[] args) {

        int numerosNegativos = 0;
        int numerosPositivos = 0;
        int numerosCeros = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int numero = s.nextInt();

            if (numero > 0) {
                numerosPositivos++;
            } else if (numero < 0) {
                numerosNegativos++;
            }
            else {
                numerosCeros++;
            }
        }
        System.out.println(numerosNegativos + " números negativos\n" + numerosPositivos +" números positivos\n" + numerosCeros + " ceros");
    }
}