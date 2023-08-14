package sets;

import java.util.HashSet;
import java.util.Set;

public class SetApp1 {

    public static void main(String[] args) {

        // o Set pertence ao pacote java.util que, assim como as Listas, precisamos informar de que tipo são
        Set<String> set = new HashSet<>(); // aqui escolhemos a implementação de HashSet que gera um conjunto vazio
        set.add("A"); // usamos o método add para adicionar elementos ou addAll para uma coleção
        set.add("E");
        set.add("I");
        set.add("O");
        set.add("U"); // o add retorna um booleano true se foi adicionado ou false se não foi adicionado

        // para trazer os elementos podemos usar o Enhanced for conforme a seguir
        for (String s : set) {
            System.out.println(s); // a impressão não trará os elementos em ordem, que é uma característica do HashSet
            // se alterar o new para uma LinkedHashSet o resultado virá na ordem de inserção, e não aceitam elementos duplicados


            //outros métodos...
            //set.size(); // para retornar o tamanho
            //set.clear(); // para eliminar todos os elementos de dentro do set
            //set.remove(); // para remover determinado objeto
            //set.contains(); // para verificar se determinado objeto existe ou não dentro do Set
            // não haverá um método get pois o Set não tem um conceito de indexação
        }
    }
}
