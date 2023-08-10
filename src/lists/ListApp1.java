package lists;

import java.util.ArrayList;
import java.util.List;

public class ListApp1 {

    public static void main(String[] args) {

        // Todas as coleções do Java só trabalham com Object com o intuito de poder usar qualquer tipo de dado
        // Como todas as classes do Java herdam de Object, e inclusive temos as classes wrappers para representar os tipos primitivos no mundo dos objetos
        // Uma lista de Objects podem carregar qualquer coisa nos seus elementos, mas normalmente usa-se generics para informar qual tipo de dado aquela lista vai abrigar

        //var l1 = new ArrayList<Integer>();

        //podemos trocar o ArrayList com o LinkedList sem problemas aqui pois os métodos são os mesmos
        List<Integer> l1 = new ArrayList<>();
        //List<Integer> l1 = new LinkedList<>();

        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(7);

        l1.remove(1);

        for (Integer i : l1){
            System.out.println(i);
        }

        // internamente funciona como um array com uma capacidade inicial que pode ser expandido ou redimensionado automaticamente
        System.out.println(l1.get(1));
    }
}
