import java.util.Scanner;

public class CrecienteOdecreciente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAnterior = Integer.MAX_VALUE;
        boolean creciente = true;
        boolean decreciente = true;

        System.out.println("Introduce los números que desees (introduce un valor negativo para finalizar):");

        while (true) {
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero > numeroAnterior) {
                decreciente = false;
            } else if (numero < numeroAnterior) {
                creciente = false;
            }

            numeroAnterior = numero;
        }

        if (creciente) {
            System.out.println("Es creciente.");
        } else if (decreciente) {
            System.out.println("Es decreciente.");
        } else {
            System.out.println("No es ni creciente ni decreciente.");
        }
    }
}