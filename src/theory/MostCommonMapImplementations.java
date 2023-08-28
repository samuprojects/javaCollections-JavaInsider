package theory;

@SuppressWarnings("ALL")
public class MostCommonMapImplementations {

    /*
    * Os maps possuem um conjunto de chaves associados a valores  KEYS -> VALUES
    * O map por si só é uma interface, assim como já vimos a interface Set (conjuntos) e a interface List (listas)
    * para criar efetivamente um map precisamos definir que tipo de implementação será utilizada
    * no map os tipos de implementação estão totalmente ligados como a forma como as chaves são armazenadas.
    * as chaves tem um papel central (que na verdade são um Set pois não podem contém elementos duplicados dentro do conjunto
    * as chaves tem que ser únicas).
    *
    * A mais famosa e mais usada é a HashMap, onde as chaves do mapa usam um algoritmo de hashSet (lembrar do algoritmo
    * de espalhamento dos "baldes" com a implementação do equals e hashCode), ou seja são Keys HashSet
    *
    * Outra é a LinkedHashMap ou seja, são Keys LinkedHashsSet (a ordem da interação é a mesma ordem de inserção), diferente do anterior
    *
    * E a última é o TreeMap, ou seja, são keys TreeSet, as chaves serão inseridas em ordem, se for String em ordem alfabética
    * se for número em ordem crescente, ou em algum outro critério se você definir um utilizando o Comparable ou Comparator
    *
    * */
}
