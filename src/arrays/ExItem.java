package arrays;

public class ExItem {

    public static void main(String[] args) {

        Item[] array = new Item[3];
        array[0] = new Item("Item A", 100);
        array[1] = new Item("Item B", 300);
        array[2] = new Item("Item C", 200);

        Object[] result = process(array); // result vai receber o resultado do método process que recebeu o array de três elementos

        Item min = (Item) result[0]; // aqui é seguro fazer o casting explícito pois sabemos que o primeiro elemento do retorno é do tipo Item
        Item max = (Item) result[1]; // casting explícito seguro pois sabemos que o segundo elemento é do tipo Item
        Double avg = (Double) result[2]; // casting explícito pois sabemos que o terceito elemento é um Double

        System.out.println("Min: " + min); // Exercício ok, trazendo o min
        System.out.println("Max: " + max); // o max
        System.out.println("Avg: " + avg); // e a média dos valores dos elementos do array

    }

    // com um método recebendo Object no array podemos ter diferentes tipos de elementos como retorno
    private static Object[] process (Item[] array) {
        Item min = array[0]; // recebe o primeiro índice para fazer a comparacao entre min, max e receber o min
        Item max = array[0]; // recebe o primeiro índice para fazer a comparacao entre min, max e receber o max
        double sum = 0.0; // variável inicializada com zero para receber a soma de cada iteração do enhanced for

        for (Item item : array){ // itera sobre todos os eloementos do array comparando com o índice 0
            if (item.getPrice() < min.getPrice()){
                min = item; // se o item do indice no momento da interação for menor será atrribuído em min ao final
            }

            if (item.getPrice() > max.getPrice()){
                max = item; // se a comparação com índice 0 resultar em maior no final será o max o item a ser retornado
            }

            sum += item.getPrice(); // a cada iteração do enhanced for sobre os elementos do array, sum vai recebendo a soma
        }

        double avg = sum / array.length; // o valor da soma é dividido pelo tamanho do array para resultar na média dos valores

        return new Object[] { min, max, avg }; // por ser object podemos retornar os tipos Item e o tipo Double (da classe Wrapper)

    }
}
