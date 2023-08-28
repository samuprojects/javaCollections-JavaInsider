package maps;

import java.util.Map;
import java.util.TreeMap;

public class ExCharCount {

    public static void main(String[] args) {

        System.out.println(count("GARRAFA"));
        System.out.println(count("JAVA"));
        System.out.println(count("ORIENTACAO A OBJETOS"));
        // exercício de contador de caracteres completo


    }

    // método para contar as letras, que recebe uma String, e retornar um Map de letras para números
    private static Map<Character, Integer> count(String str){
        char[] chars = str.toCharArray(); // método que retorna o array de caracteres (array de char) associado à String
        Map<Character, Integer> map = new TreeMap<>(); // escolhemos o TreeMap para ordenar em ordem alfabética
        // o Character já implementa uma ordenação de Comparable

        for (char c: chars) {
            int count = map.getOrDefault(c, 0); // int não pode ser nulo por isso optamos pelo getOrDefault, mas poderia ser Integer
            map.put(c, count + 1); // vai testando cada caractere e ao final
        }
        return map; // retorna a quantidade de chars encontrada
    }
}
