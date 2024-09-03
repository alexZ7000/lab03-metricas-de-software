package codigoComMelhorias;

import java.util.Random;

public class OrdenaNumeros {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random random = new Random();

        // Preenche o array com números aleatórios
        for (int i = 0; i < 100; i++) {
            numeros[i] = random.nextInt(1000);
        }

        // Ordena o array usando Quick Sort
        quickSort(numeros, 0, numeros.length - 1);

        // Imprime os números ordenados
        for (int i = 0; i < 100; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    // Método de Quick Sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Método para particionar o array
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                // Troca elementos array[i] e array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Troca o pivot com o elemento de array[i + 1]
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
