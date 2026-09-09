import java.util.Scanner;

public class InversionArreglo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño n del arreglo: ");
        int n = sc.nextInt();

        int[] arreglo = new int[n];

        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Ingrese el elemento " + i + ": ");
            arreglo[i] = sc.nextInt();
        }

        System.out.print("Original: ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        for (int i = 0; i <= (n / 2 - 1); i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[n - 1 - i];
            arreglo[n - 1 - i] = temp;
        }

        System.out.print("Invertido: ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}