import java.util.Scanner;

public class BusquedaNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombresPacientes[] = new String[8];
        String nombre = "";
        int posicion = -1;


        for (int i = 0; i < 8; i++) {
            System.out.print("Digite el nombre numero " + (i+1) + ": ");
            nombre = sc.nextLine();
            nombresPacientes[i] = nombre;
        }


        System.out.print("Digite el nombre a buscar en la lista: ");
        nombre = sc.nextLine();
        for (int i = 0; i < 8; i++) {
            if (nombresPacientes[i].equalsIgnoreCase(nombre)) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("Se encontro el nombre del paciente en la posición " + posicion + " de la lista");
        }else{
            System.out.println("No se encontro el nombre del paciente en la lista");
        }

    }
}
