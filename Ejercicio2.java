import java.util.Random;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        Random Aleatorio= new Random();

        // Pedir al usuario el número de columnas
        System.out.print("introduce el número de columnas: ");
        int n = Teclado.nextInt();

        // Crear la matriz de 5 filas y n columnas
        int[][] matriz = new int[5][n];

        // Rellenar la matriz con números aleatorios entre 0 y 10
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = Aleatorio.nextInt(11); 
            }
        }

        
        System.out.println("matriz generada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();         }
        
        
        
    }
}
