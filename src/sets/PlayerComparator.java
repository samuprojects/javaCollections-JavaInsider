package sets;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        //return Integer.valueOf(o1.score()).compareTo(o2.score()); // OU SUGESTÃO DA IDE ABAIXO
        return -Integer.compare(o1.score(), o2.score()); // INCLUÍDO SINAL DE - PARA DECRESCER OS NÚMEROS
    }
}
