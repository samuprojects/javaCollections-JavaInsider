package lists;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class ListApp4 {

    public static void main(String[] args) {

        // conversão de array em lista ou o contrário dependendo do cenário no dia a dia de trabalho

        Integer[] array = { 1, 2, 3, 4 }; // alterado de array int para Integer

        List<Integer> list = Arrays.asList(array); // asList vai retornar os elementos de um array de int por isso devemos mudar para um Integer devido listas só Objects
        System.out.println(list);

        // para converter lista em array

        // o método toArray é utilizado porém o que não recebe parametros retorna um Object e normalmente desejamos um tipo de array específico
        // para isso utilizamos a segunda opção que recebe um array para onde os dados serão colocados e retorna esse array
        Integer[] array2 = list.toArray(new Integer[4]);
        System.out.println(Arrays.toString(array2));

        // outra forma que se vê por aí

        List<Integer> l2 = Arrays.asList(new Integer[]{1, 2, 3, 4});
        System.out.println(l2);

    }
}
