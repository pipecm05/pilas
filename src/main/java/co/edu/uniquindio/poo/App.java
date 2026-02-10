package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // 1. Recorrer un arreglo
        int[] arreglo = {10, 20, 30, 40, 50};

        System.out.println("Recorrido del arreglo:");
        recorrerArreglo(arreglo, 0);

        // 2. Recorrer una matriz
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\nRecorrido de la matriz:");
        recorrerMatriz(matriz, 0, 0);

        // 3. Recorrer diagonal principal
        System.out.println("\nRecorrido de la diagonal:");
        recorrerDiagonal(matriz, 0);
    }

    // ----------------------------------------
    // 1. Recorrer un arreglo de forma recursiva
    // ----------------------------------------
    public static void recorrerArreglo(int[] arreglo, int i) {

        // Caso base
        if (i == arreglo.length) {
            return;
        }

        System.out.println(arreglo[i]);

        // Llamada recursiva
        recorrerArreglo(arreglo, i + 1);
    }

    // ----------------------------------------
    // 2. Recorrer una matriz de forma recursiva
    // ----------------------------------------
    public static void recorrerMatriz(int[][] matriz, int fila, int columna) {

        // Caso base
        if (fila == matriz.length) {
            return;
        }

        // Cambio de fila
        if (columna == matriz[0].length) {
            recorrerMatriz(matriz, fila + 1, 0);
            return;
        }

        System.out.print(matriz[fila][columna] + " ");

        // Llamada recursiva
        recorrerMatriz(matriz, fila, columna + 1);
    }

    // ----------------------------------------
    // 3. Recorrer la diagonal principal recursivamente
    // ----------------------------------------
    public static void recorrerDiagonal(int[][] matriz, int i) {

        // Caso base
        if (i == matriz.length) {
            return;
        }

        System.out.println(matriz[i][i]);

        // Llamada recursiva
        recorrerDiagonal(matriz, i + 1);
    }
}
