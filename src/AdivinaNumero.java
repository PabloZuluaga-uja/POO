import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = (int)(Math.random() * 100) + 1;
        int numeroAdivinado = 0;
        int intento = 1;

        System.out.println(numeroAleatorio);

        while (numeroAleatorio != numeroAdivinado) {
            System.out.println("");
            System.out.print("Intento " + intento + " Digite el numero: ");
            numeroAdivinado = sc.nextInt();

            if (numeroAdivinado > numeroAleatorio) {
                System.out.println("El numero a adivinar es menor");
            }else{
                System.out.println("El numero a adivinar es mayor");
            }
            intento++;
        }

        System.out.println("Adivinaste el numero, el numero digitado es: " + numeroAleatorio);


    }
}
