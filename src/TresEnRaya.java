import java.util.Scanner;

public class TresEnRaya {
    static char[][] tablero = new char[3][3];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarTablero();
        char jugadorActual = 'X';
        boolean juegoActivo = true;

        System.out.println("Bienvenido al Tres en Raya\n");

        while (juegoActivo) {
            mostrarTablero();
            
            int fila = -1, columna = -1;
            boolean movimientoValido = false;

            while (!movimientoValido) {
                System.out.print("Jugador " + jugadorActual + ", ingrese fila (0-2): ");
                fila = sc.nextInt();
                System.out.print("Ingrese columna (0-2): ");
                columna = sc.nextInt();

                if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
                    movimientoValido = true;
                } else {
                    System.out.println("Movimiento inválido. Intente de nuevo.\n");
                }
            }

            tablero[fila][columna] = jugadorActual;

            if (verificarGanador(jugadorActual)) {
                mostrarTablero();
                System.out.println("¡El jugador " + jugadorActual + " ganó!");
                juegoActivo = false;
            } else if (verificarEmpate()) {
                mostrarTablero();
                System.out.println("¡Empate! El tablero está lleno.");
                juegoActivo = false;
            } else {
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            }
        }
    }

    static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    static void mostrarTablero() {
        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("  " + tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2]);
            if (i < 2) System.out.println(" -----------");
        }
        System.out.println("\n");
    }

    static boolean verificarGanador(char jugador) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == jugador && tablero[1][j] == jugador && tablero[2][j] == jugador) {
                return true;
            }
        }

        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }

        return false;
    }

    static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}