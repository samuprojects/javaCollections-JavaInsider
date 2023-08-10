package theory;

@SuppressWarnings("ALL")
public class ComparingArraysListsLinkedLists {

    /*
    * comparativo
    *                   ArrayList                 LinkedList
    * inserção          0 1 2 3 4 5                0  ->  1  -> 2
    *                  |_|_|_|_|_|_|
    *                   0 1 2 3 4 5 6
    *                  |_|_|_|_|_|_|_|
    *
    * Linkedlist para inserção é mais rápida em todas as situações, para o ArrayList é mais custoso
    *
    *
    * comparativo
     *                   ArrayList                 LinkedList
     * delete            0 1 2 3 4 5 6               0  ->  1  -> 2
     *                  |_|_|_|_|_|_|_|
     *                   1 2 3 4 5 6 7
     *
     *                   0 1 2 3 4 5 6
     *                  |_|_|_|_|_|_|_|
     *                   1 3 4 5 6 7 x
     *
     * Na LinkedList a deleção apenas aponta o nó para o pŕoximo elemento, para o ArrayList é mais custoso pois
     * tem que reposicionar cada elemento
    * */
}
