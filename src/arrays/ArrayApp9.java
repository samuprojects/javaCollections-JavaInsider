package arrays;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class ArrayApp9 {

    public static void main(String[] args) {

        // a classe Arrays, do pacote java.util possui alguns utilitários interessantes para trabalhar com arrays
        String[] array = new String[5];

        System.out.println(array); // devido construção interna do array não é possível imprimir os elementos dessa forma
        System.out.println(Arrays.toString(array)); // é preciso utilizar o método toString da classe estática Arrays

        // Como o array é inicializado com alguma coisa no caso acima String será null
        // temos um outro método interessante da classe Arrays chamado fill que nos permite preencher os elementos do array com algum valor

        Arrays.fill(array, "ABC"); // todos os elementos vão receber ABC, o método acima possui ainda outras sobrecargas...
        System.out.println(Arrays.toString(array)); // como passar um valor de início e fim, ou preencher só o início ou fim, entre outros

        // temos também um método (sort) que permite ordenar elementos (no caso de String, em ordem alfabética), conforme a seguir
        array[0] = "C";
        array[1] = "B";
        array[2] = "E";
        array[3] = "A";
        array[4] = "D";
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // temos também o método binarySearch que retorna um inteiro indicando a posição do valor desejado na busca binária
        // é bem otimizado para uso com elementos de arrays
        System.out.println(Arrays.binarySearch(array, "C"));

        // temos também o copyOf que permite copiar um array em outro e é muito utilizado para expandir um array
        // visto que um array depois de criado é fixo quanto ao seu tamanho
        String[] array2 = Arrays.copyOf(array, 10); // retorna um novo array com a cópia dos elementos originais e os novos elementos
        System.out.println(Arrays.toString(array2));


    }
}
