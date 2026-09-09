import java.util.Scanner;

public class TiempoViaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.print("Digite los numeros en minutos a leer legiblemente: ");
        int tiempoTotal = sc.nextInt();

        int tiempoHoras = tiempoTotal / 60;
        int tiempoMinutos = tiempoTotal % 60;
        double tiempoSegundos = tiempoTotal * 60;
        
        System.out.println("");
        System.out.println("La cantidad de tiempo es: " + tiempoHoras + " horas con " +  tiempoMinutos + " minutos");
        System.out.println("La cantidad de segundos son: " + tiempoSegundos);

    }
}
