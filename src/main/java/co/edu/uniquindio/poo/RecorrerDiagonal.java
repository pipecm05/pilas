package co.edu.uniquindio.poo;

public class RecorrerDiagonal {

    public static void recorrerDiagonal(int[][] matriz, int i) {
        // Caso base
        if (i == matriz.length) {
            return;
        }
        // Acción
        System.out.println(matriz[i][i]);
        // Llamada recursiva
        recorrerDiagonal(matriz, i + 1);
    }
}