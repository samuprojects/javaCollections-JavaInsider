package lists;

import java.util.List;

public class ListApp2 {

    public static void main(String[] args) {

        // outra forma de criar listas é utilizando um método da próppria interface List que possui várias sobrecargas
        // permitindo que passe os elementos que você deseja, pois trabalha com varargs, e já retorna o tipo de dado

        var list = List.of("A", "B", "C", "D");

        // listas criadas com o of são imutáveis, pode modificar os elementos existentes, mas não pode adicionar ou remover como podíamos com o ArrayList
        // list.add("E");
        // list.remove("A");

        // podemos iterar normalmente
        for (String s: list){
            System.out.println(s);
        }
    }
}
