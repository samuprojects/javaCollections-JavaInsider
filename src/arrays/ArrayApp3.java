package arrays;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class ArrayApp3 {

    public static void main(String[] args) {

        String[] array = new String[2];
        array[0] = "A";
        array[1] = "B";
        array[-1] = "D"; // não aceita valor negativos, lança exceção
        array[2] = "C"; // está acima do tamanho do array lança exceção

        System.out.println(Arrays.toString(array));

    }
}
