import java.util.Scanner;

public class VentasSucursal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ventas = new int[4][3];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese venta de Sucursal " + (i + 1) + ", Producto " + (j + 1) + ": ");
                ventas[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n--- Ventas por sucursal ---");
        int[] totalSucursal = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                totalSucursal[i] += ventas[i][j];
            }
            System.out.println("Sucursal " + (i + 1) + ": $ " + totalSucursal[i]);
        }
        
        System.out.println("\n--- Ventas por producto ---");
        int[] totalProducto = new int[3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                totalProducto[j] += ventas[i][j];
            }
            System.out.println("Producto " + (j + 1) + ": $ " + totalProducto[j]);
        }
        
        int ventaMaxima = ventas[0][0];
        int sucursalMax = 0;
        int productoMax = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (ventas[i][j] > ventaMaxima) {
                    ventaMaxima = ventas[i][j];
                    sucursalMax = i;
                    productoMax = j;
                }
            }
        }
        
        System.out.println("\nVenta más alta: $ " + ventaMaxima + " (Sucursal " + (sucursalMax + 1) + ", Producto " + (productoMax + 1) + ")");
    }
}