package arrays;

import java.util.Arrays;

public class ExBubbleSort {

    public static void main(String[] args) {

        int[] array = { 8, 5, 1, 0, 4, 2, 3, 9, 7, 6 };
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++){ // varre o array[i] -1 porque array[j] está na frente
            for (int j = i + 1; j < array.length; j++) { // array[j] vai até o fim do array porque vai comparando na frente
                if (array[j] < array[i]){ // se o que está em array[j] for maior do que o que está em array[i]
                    int tmp = array[j]; // guardamos o valor desse índice específico de array [j] temporariamente
                    array[j] = array[i]; // gravamos os dados do índice de i em j
                    array[i] = tmp; // gravamos o valor de tmp nesse índice específico do array i fazendo a troca dos elementos
                    // dessa forma a cada iteração dos índices do array i já são comparados com os índices do array j
                    // e já efetuando a troca deixando os números em ordem crescente e completando o exercício
                }
            }
        }

    }
}
