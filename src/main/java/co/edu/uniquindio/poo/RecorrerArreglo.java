package co.edu.uniquindio.poo;

public class RecorrerArreglo {

    public static void recorrer(int[] arreglo, int i) {
        // Caso base
        if (i == arreglo.length) {
            return;
        }
        // Acción
        System.out.println(arreglo[i]);
        // Llamada recursiva
        recorrer(arreglo, i + 1);
    }
}
