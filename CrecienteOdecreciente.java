import java.util.Scanner;

public class CrecienteOdecreciente {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int numeroAnterior = 0;
        int numeroActual = 0;
        int contador = 1;
        boolean creciente = true;
        boolean decreciente = true;

        do {
            System.out.printf(">");
            numeroActual = s.nextInt();
            if(contador > 1 && numeroActual >= 0) {
                if (numeroActual > numeroAnterior) {
                    decreciente = false;
                } else if (numeroActual < numeroAnterior) {
                    creciente = false;
                } else {
                    decreciente = false;
                    creciente = false;
                }
            }
            numeroAnterior = numeroActual;
            contador++;

        } while (numeroActual >= 0);

        if(creciente && decreciente){
            System.out.println("No se han introducido números");
        }else if (decreciente && !creciente){
            System.out.println("Es decreciente");
        }else if (creciente && !decreciente) {
            System.out.println("Es creciente");
        }else if (!creciente && !decreciente){
            System.out.println("No es creciente ni decreciente");
        }
    }
}