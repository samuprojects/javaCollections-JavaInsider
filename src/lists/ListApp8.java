package lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class ListApp8 {

    public static void main(String[] args) {

        var people = new ArrayList<>(List.of(
                new Person("Maria", 45),
                new Person("Paulo", 36),
                new Person("Pedro", 40)
        ));

        //Collections.sort(people); // compareTo do Comparable que é utilizado pelo sort
        people.sort(new PersonComparator()); // usando o Comparator
        //people.sort((o1, o2) -> o1.getName().compareTo(o2.getName())); // usando expressão lambda
        //people.sort(Comparator.comparing(Person::getName)); // ou criar um Comparador usando o getName da pessoa pra fazer a comparação (expressões lambda)

        for(var p: people) {
            System.out.format("==> %s\n", p);
        }
    }
}
