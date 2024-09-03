package codigoCorreto;

import java.util.Random;

public class OrdenaNumeros {

    public static void main(String[] args) {
        int[] numeros = new int[100];
        Random random = new Random();

        // Preenche o array com números aleatórios
        for (int i = 0; i < 100; i++) {
            numeros[i] = random.nextInt(1000);
        }

        // Ordena o array em ordem crescente (algoritmo de Bubble Sort)
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {  // Corrigido: j < numeros.length - 1
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Imprime os números ordenados
        for (int i = 0; i < 100; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
