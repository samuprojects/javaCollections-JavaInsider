package arrays;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class ArrayApp2 {

    public static void main(String[] args) {

        var array1 = new int[5]; // todos os elementos do array são sempre inicializados com alguma coisa dependendo do tipo de dado
        System.out.println(Arrays.toString(array1)); // o toString do array precisa da classe Arrays para mostrar o valor dos elementos

        var array2 = new double[5];
        System.out.println(Arrays.toString(array2));

        var array3 = new boolean[5];
        System.out.println(Arrays.toString(array3));

        var array4 = new String[5];
        System.out.println(Arrays.toString(array4));

        var array5 = new int[] { 2, 4, 6, 8, 10 };
        System.out.println(Arrays.toString(array5));

        int[] array6 = { 2, 4, 6, 8, 10 };
        System.out.println(Arrays.toString(array6));
    }
}
