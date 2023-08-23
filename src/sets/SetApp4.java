package sets;

import java.util.TreeSet;

public class SetApp4 {
    public static void main(String[] args) {
//        Set<Integer> set = new TreeSet<>();
//        set.add(1);
//        set.add(4);
//        set.add(3);
//        set.add(2);

        // apesar dos elementos estarem fora de ordem ao imprimir estarão em ordem crescente, ou seja, o TreeSet fez a ordenação automaticamente
//        System.out.println(set);


        // Isso ocorre pois o TreeSet utiliza as interfaces Comparable e Comparator para realizar a ordenação
        // Toda vez que colocamos dentro de um TreeSet objetos cuja classe implementa Comparable, o Java vai usar o método compareTo()
        // para identificar se determinado elemento tem que vir antes, depois ou igual para ordenação das coisas já na inserção
        // No exemplo acima a classe Integer implementa Comparable por isso funciona.
        // Abaixo se pegarmos puramente a classe Account dará erro em execução porque não está implementando a interface Comparable, vamos alterar isso

        var set = new TreeSet<AccountOrdering>();
        set.add(new AccountOrdering("431", 100));
        set.add(new AccountOrdering("111", 200));
        set.add(new AccountOrdering("678", 300));

        System.out.println(set);
    }
}
