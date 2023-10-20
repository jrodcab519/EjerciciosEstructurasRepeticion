import java.util.Scanner;

public class RellenandoConPuntos {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres >");
        String cadena = s.nextLine();
        System.out.println("Introduce una longitud>");
        int longitud = s.nextInt();
        System.out.println("Introduce una dirección Izquierda (I) ó Derecha(D)>");
        char caracter = s.next().charAt(0);

        if (cadena.length() > longitud) {
            System.out.print("La cadena no cabe");
        } else {

            switch (caracter){
                case 'D':
                    completarDerecha(cadena, longitud);
                    break;
                case 'I':
                    completarIzquierda(cadena, longitud);
                    break;
                default:
                    System.out.print("La dirección debe ser I o D");
            }
        }



    }

    public static void completarDerecha(String cadena, int longitud ) {

        while (cadena.length() < longitud){
            cadena = "." + cadena;
        }
        System.out.print(cadena);
    }
    public static void completarIzquierda(String cadena, int longitud ) {

        while (cadena.length() < longitud){
            cadena = cadena + ".";
        }
        System.out.print(cadena);
    }
}