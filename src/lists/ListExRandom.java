package lists;

import java.util.*;

@SuppressWarnings("ALL")
public class ListExRandom {

    private static Random random = new Random(); // para gerar números aleatórios

    public static void main(String[] args) {
        System.out.println(generate(10));
        System.out.println(generate(5));
        System.out.println(generate(2));
    }

    private static List<Integer> generate(int number){ // método que recebe a quantidade de números aleatórios a ser gerado
        var numbers = new ArrayList<Integer>(number);

        for (int i = 0; i < number; i++){
            numbers.add(random.nextInt(0, 101)); // itera até a quantidade de números aleatórios desejados em number e no range de 0 a 100
        }

        numbers.sort(Comparator.naturalOrder()); // método que retorna os valores em ordem crescente
        return Collections.unmodifiableList(numbers); // esse método de collections vai retornar uma lista imutável
        // sugestão do prof estudar os métodos estáticos disponíveis em Collections para trabalhar com listas
    }
}
