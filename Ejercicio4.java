
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        
        System.out.print("Introduce el tamaño del vector: ");
        int n = Teclado.nextInt();

   
        if (n < 2) {
            System.out.println("El vector debe tener al menos dos elementos.");
            return;
        }

        
        int[] vector = new int[n];
        System.out.println("Introduce los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = Teclado.nextInt();
        }

       
        int primero = vector[0];
        int segundo = -1; 

        // Iterar sobre el vector
        for (int i = 1; i < n; i++) {
            if (vector[i] < primero) {
                segundo = primero;
                primero = vector[i];
            } else if (vector[i] < segundo && vector[i] != primero) {
                segundo = vector[i];
            }
        }

        
        if (segundo == -1) {
            System.out.println("No hay un segundo elemento más pequeño.");
        } else {
            System.out.println("El segundo elemento más pequeño es: " + segundo);
        }

        
    }
}
