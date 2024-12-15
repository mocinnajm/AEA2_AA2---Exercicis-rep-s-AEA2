
public class Ejercicio1 {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];
        int sumaTotal = 0;
        int maximo = -1;
        int conteoMaximo = 0;
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        int sumaUltimaFila = 0;

        // llenar la matriz y clacular la suma total
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                sumaTotal += matriz[i][j];

                // enconatar nuemro maximo y cuantas veces se repite
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                    conteoMaximo = 1;
                } else if (matriz[i][j] == maximo) {
                    conteoMaximo++;
                }

                // sumar diagonal principal y secundaria
                if (i == j) {
                    sumaDiagonalPrincipal += matriz[i][j];
                }
                if (i + j == 4) {
                    sumaDiagonalSecundaria += matriz[i][j];
                }

                // sumar ultima fila
                if (i == 4) {
                    sumaUltimaFila += matriz[i][j];
                }
            }
        }

        System.out.println("la matriz generada es:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // el promedio
        double promedio = (double) sumaTotal / (5 * 5);
        System.out.println("\n promedio de la matriz: " + promedio);

        System.out.println("Num maximo: " + maximo);
        System.out.println("se repite: " + conteoMaximo + " veces");

        System.out.print("Num primos: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (esPrimo(matriz[i][j])) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();

        System.out.print("Num pares: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();

        System.out.println("suma de la diagonal principal: " + sumaDiagonalPrincipal);
        System.out.println("suma de la diagonal secundaria: " + sumaDiagonalSecundaria);

        System.out.println("suma de la ultima fila: " + sumaUltimaFila);
    }

    // Metodo para verificar si un numero es primo
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
