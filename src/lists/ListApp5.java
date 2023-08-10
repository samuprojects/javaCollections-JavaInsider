package lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class ListApp5 {

    public static void main(String[] args) {

        var list1 = new ArrayList<>(List.of('A', 'B', 'C'));
        var list2 = new ArrayList<>(List.of('C', 'D', 'E'));

        //list1.addAll(list2); // adiciona tudo que tem na lista 2 para a lista 1
        //list1.retainAll(list2); // retorna somente o que é comum nas listas 1 e 2 o restante é removido
        list1.removeAll(list2); // retorna o que não tem na lista 2 o restante é removido do resultado

        System.out.println(list1);
    }
}
