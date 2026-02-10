package co.edu.uniquindio.poo;

public class RecorrerMatriz {

    public static void recorrer(int[][] matriz, int fila, int columna) {

        // Caso base general
        if (fila == matriz.length) {
            return;
        }

        // Cuando termina una fila, pasa a la siguiente
        if (columna == matriz[0].length) {
            recorrer(matriz, fila + 1, 0);
            return;
        }

        // Acción
        System.out.print(matriz[fila][columna] + " ");

        // Llamada recursiva
        recorrer(matriz, fila, columna + 1);
    }
}