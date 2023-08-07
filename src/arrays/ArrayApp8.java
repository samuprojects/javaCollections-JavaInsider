package arrays;

public class ArrayApp8 {

    public static void main(String[] args) {

        // conforme aula anterior não podemos fixar que toda vez um array multidimensional será como um quadrado ou retangulo
        // podemos ter tamanhos diferentes para as colunas, para usar assim basta não informar nenhum número conforme a seguir
        int[][] array = new int[4][];
        
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[5];
        array[3] = new int[1];

        for (int[] d1 : array){
            for(int d2 : d1) {
                System.out.print(d2 + " "); // sem quebra pra mostrar a linha com a coluna correspondente
            }
            System.out.println(); // com quebra para separar as linhas e ficar visualmente interessante de ver as multi dimensões
        }
    }
}
