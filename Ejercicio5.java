import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // tamaño de la matriz
        System.out.print("introduce el número de filas: ");
        int filas = teclado.nextInt();
        System.out.print("introduce el número de columnas: ");
        int columnas = teclado.nextInt();

        int[][] matriz = new int[filas][columnas];
        int[] contador = new int[11]; 

     
        System.out.println("introduce los elementos de la matriz (0-10):");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int num;
                do {
                    System.out.print("elemento [" + i + "][" + j + "]: ");
                    num = teclado.nextInt();
                } while (num < 0 || num > 10); 
                matriz[i][j] = num;
                contador[num]++; 
            }
        }

        for (int i = 0; i <= 10; i++) {
            if (contador[i] > 0) {
                System.out.println("El número " + i + " aparece " + contador[i] + " veces.");
            }
        }

        
    }
}

