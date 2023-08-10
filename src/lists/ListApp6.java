package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("ALL")
public class ListApp6 {

    public static void main(String[] args) {
        var list = new ArrayList<>(List.of(6, 5, 7, 1, 3, 2, 4));
        Collections.sort(list);
        System.out.println(list);

        // o sort organiza os elementos que são do tipo Comparable, como os elementos são Integers (classe que permite usar int em objetos)
        // pode ser utilizado, ou seja, tudo que implementa Comparable pode seer submetido ao método sort
        // a interface Comparable possui um método compareTo que retorna um inteiro
        // 0 se os nuemros são iguais
        // -1 se o número chamado for menor do que o parametro
        // ou maior do que 1 se o número chamado for maior que o parametro

        System.out.println(Integer.compare(0, 0)); // Integer.compare traz o mesmo efeito interno do compareTo
        System.out.println(Integer.compare(1, 2)); // o número da esquerda é menor por isso deve vir antes
        System.out.println(Integer.compare(2, 1)); // o número da esquerda é maior por isso deve vir depois

        // no caso de Strings a lógica do compareTo vai ordenar alfabeticamente qual String vem antes

        // caso não queira utilizar essa lógica de comparação dentro da classe, pode usar a interface Comparator que recebe dois objetos
    }
}
