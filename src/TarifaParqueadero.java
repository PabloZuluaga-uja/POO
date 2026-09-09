import java.util.Scanner;

public class TarifaParqueadero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tipo de vehiculo (1=Moto, 2=Carro, 3=Camioneta): ");
        int tipoVehiculo = sc.nextInt();

        System.out.println("Numero de horas de permanencia: ");
        int horas = sc.nextInt();

        int primeraHora = 0;
        int horaAdicional = 0;
        boolean opcionValida = true;

        switch (tipoVehiculo) {
            case 1:
                primeraHora = 2000;
                horaAdicional = 1500;
                break;
            case 2:
                primeraHora = 4000;
                horaAdicional = 3000;
                break;
            case 3:
                primeraHora = 5000;
                horaAdicional = 4000;
                break;
            default:
                System.out.println("Opcion no valida");
                opcionValida = false;
                break;
        }

        if (opcionValida) {
            int horasAdicionales = horas - 1;
            int total = primeraHora + (horasAdicionales * horaAdicional);

            System.out.println("Total a pagar: $" + total);
        }

        sc.close();
    }
}