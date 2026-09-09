import java.util.Scanner;

public class TablaDeMultiplicar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        System.out.println("Tabla de multiplicar del " + numero);
        System.out.println();
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%4d", numero * i);
        }
        System.out.println();

        System.out.println();

        System.out.println("Tablas de multiplicar del 1 al " + numero);
        System.out.println();
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        sc.close();
    }
}