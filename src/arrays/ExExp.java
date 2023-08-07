package arrays;

import java.util.Arrays;

public class ExExp {

    public static void main(String[] args) {
        int[] array = { 2, 6, 10 };
        exp(array);
        System.out.println(Arrays.toString(array));

    }

    // o enhanced for aqui não favorece o exercício visto vai gerar uma cópia dos elementos para efetuar o cálculo
    // com isso o System.out vai imprimir o valor original dos elementos do array
    // para ter os elementos alterados diretamente o melhor é usar o for clássico
    private static void exp(int[] array){ // recebe o array com seus elementos
        for (int i = 0; i < array.length; i++){ // vai iterar sobre cada elemento
            array[i] = array[i] * array[i]; // para cada elementovai multiplicar pelo valor dele mesmo
            // satisfazendo a condição do exercício
        }
    }
}
