package arrays;

public class ArrayApp4 {

    @SuppressWarnings("ALL")
    public static void main(String[] args) {

        int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19};

        for (int i = 0; i < primeNumbers.length; i++) { // length aqui é um atributo (pois não tem parenteses) que retorna o tamanho do array
            System.out.format("=> %s\n", primeNumbers[i]); // com o for clássico pode-se obter diversos tipos de varreduras para exibição
        }

        for (int n: primeNumbers) {
            System.out.format("=> %s\n", n); // o enhanced for é mais simples para iterar sobre todos os elementos do array, é muito utilizado
        }
    }
}
