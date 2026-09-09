import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("");
        System.out.print("Digite un año: ");
        int año = sc.nextInt();
        System.out.print("Digite un día de la semana (1 al 7): ");
        int dia = sc.nextInt();

        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            System.out.println("El año: " + año + " es bisiesto");
        }else{
            System.out.println("El año: " + año + " no es bisiesto");
        }

        switch (dia) {
            case 1:
                System.out.println("El día " + dia + " es lunes");
                break;
            case 2:
                System.out.println("El día " + dia + " es martes");
                break;
            case 3:
                System.out.println("El día " + dia + " es miercoles");
                break;
            case 4:
                System.out.println("El día " + dia + " es jueves");
                break;
            case 5:
                System.out.println("El día " + dia + " es viernes");
                break;
            case 6:
                System.out.println("El día " + dia + " es sabado");
                break;
            case 7:
                System.out.println("El día " + dia + " es domingo");
            default:
                break;
        }
    }
}
