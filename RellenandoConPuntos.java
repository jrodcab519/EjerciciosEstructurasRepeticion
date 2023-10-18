import java.util.Scanner;

public class RellenandoConPuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena (hasta 80 caracteres): ");
        String cadena = scanner.nextLine();

        int n;
        do {
            System.out.print("Introduce un entero positivo 'n': ");
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, introduce un entero positivo válido: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        char caracter;
        do {
            System.out.print("Introduce 'I' para rellenar a la izquierda o 'D' para rellenar a la derecha: ");
            caracter = scanner.next().charAt(0);
        } while (caracter != 'I' && caracter != 'D');

        String resultado = rellenarCadena(cadena, n, caracter);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static String rellenarCadena(String cadena, int n, char caracter) {
        int longitudCadena = cadena.length();

        if (longitudCadena >= n) {
            return cadena;
        } else {
            int cantidadCaracteresFaltantes = n - longitudCadena;
            StringBuilder resultado = new StringBuilder();

            if (caracter == 'I') {
                for (int i = 0; i < cantidadCaracteresFaltantes; i++) {
                    resultado.append('.');
                }
                resultado.append(cadena);
            } else {
                resultado.append(cadena);
                for (int i = 0; i < cantidadCaracteresFaltantes; i++) {
                    resultado.append('.');
                }
            }

            return resultado.toString();
        }
    }
}