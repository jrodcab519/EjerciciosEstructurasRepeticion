import java.util.Scanner;

public class CuantosAutobuses {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int personasGrupo =0;

        while (true) {
            int numero = s.nextInt();
            System.out.println("Personas del grupo (0=FIN): " + numero);
            if(numero>0){
            personasGrupo += numero;}
             else if (numero<0) {
                System.out.println("No puede ser negativo");}
             else {
                 break;
            }
            System.out.println("Apuntados. Van " + personasGrupo);
        }
        int autobusesNecesarios = 0;
            if(personasGrupo % 55 == 0){
                autobusesNecesarios = personasGrupo/55;}
            else{
                autobusesNecesarios = personasGrupo/55 + 1;
            }
    System.out.println("Son necesarios "+ autobusesNecesarios + " autobuses");


    }
}
