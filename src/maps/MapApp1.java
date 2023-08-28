package maps;

import java.util.HashMap;
import java.util.Map;

public class MapApp1 {

    public static void main(String[] args) {

        Map<Integer, Character> map = new HashMap<>(); // aqui mapeando números para cada letra do alfabeto -> 1 = A, etc
        map.put(1, 'A');
        map.put(2, 'B');
        map.put(3, 'C');
        map.put(4, 'D');

        System.out.println(map); // sempre vai imprimir CHAVE = VALOR

        Character char3 = map.get(3); // para saber o que está mapeado em uma chave usamos o map.get passando a chave
        System.out.println(char3); // o funcionamento é semelhante a ordenação dos índices com arrays
        // a grande diferença é que esse "índice" pode ser qualquer coisa (já no arrays é sempre um número inteiro)

        Character char5 = map.get(5); // ficar atento com essa situação usando o método get
        System.out.println(char5); // pois pode ocorrer de retornar nulo (quando a chave não existe no mapa)
        // como pode também ocorrer de a chave existir e for atribuído o nulo à ela.

        System.out.println(map.getOrDefault(5,'X')); // o getOrDefault recebe dois parâmetros
        // um é a chave desejada e o outro um valor que será mostrado CASO a chave não exista)
        // essa é uma forma de não retornar null

        //map.size(); retorna o tamanho map, ou seja, quantas chaves ele tem
        //map.putAll(); que assim como o AddAll permite adicionar outro map (outro par de chaves)
        //map.clear(); faz limpeza no mapa, apaga tudo.

        // Outra observação é que como não há elementos duplicados se informarmos como 'E' o valor para a chave 4 ela será sobrescrita
        map.put(4, 'E'); // vai apagar o D e sobrescrever com o E, esse método também pode trazer o valor prévio de D dependendo da situação
        System.out.println(map);

    }
}
