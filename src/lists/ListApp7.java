package lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("ALL")
public class ListApp7 {

    public static void main(String[] args) {

        var list = new ArrayList<>(List.of(6, 5, 7, 1, 3, 2, 4));
        list.sort(new DescendingComparator()); // usando comparator pode chamar direto o sort
        System.out.println(list);

        list.sort(new DescendingComparator().reversed()); // reversed vai inverter o parametro
        System.out.println(list);

        // um assunto extra é usar uma expressão lambda que será aborado posteriormente
        list.sort((o1, o2) -> o1.compareTo(o2)); // pois é mais comum essa expressão do que criar uma classe para isso
        System.out.println(list);

        // podemos usar os métodos de Comparator
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
