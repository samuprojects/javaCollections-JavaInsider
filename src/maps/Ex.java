package maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex {

    public static void main(String[] args) {
        var people = List.of( // lista de pessoas do record armazenada em people
                new Person(1, "José"), // objetivo transformar lista em map sendo id chave e name value
                new Person(2, "Paulo"),
                new Person(3, "Maria"),
                new Person(4, "Joana")
        );

        Map<Long, String> map = new HashMap<>(); // usado HashMap pois não foi mencionado nada sobre ordenação

        for (Person person : people) { // para cada elemento de people
            map.put(person.id(), person.name()); // adicionamos através do método put a chave e o valor
        }

        System.out.println(map);
    }
}
