import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        
        System.out.print("introduce el tamaño de la matriz : ");
        int n = Teclado.nextInt();

        
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n]; 

        
        System.out.println("introduce los valores para la matriz A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = Teclado.nextInt();
            }
        }

        
        System.out.println("introduce los valores para la matriz B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = Teclado.nextInt();
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        
        System.out.println("matriz A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println(); 
        }

        System.out.println("matriz B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("matriz C (resultado):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println(); 
        }

        
    }
}
