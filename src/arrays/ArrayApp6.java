package arrays;

public class ArrayApp6 {

    public static void main(String[] args) {
        int[] x = { 10 }; // se fosse um primitivo int o sysout exibiria 10
        increment(x);
        System.out.println(x[0]);
    }

    private static void increment(int[] array){
        array[0]++;
        // como é um array, e array é um objeto, tanto a variável que define o array original quanto
        // o parametro do método increment apontam para o mesmo objeto no heap

        // se fosse um int primitivo exibiria 10 porque no increment seria feito uma cópia do valor 10
        // para ser trabalho no método increment

        // stack          |   heap     |  parametro do método
        // int x = 10
        // int[] x = -------> 10  <---------- increment(int[] array){...}
        // por isso ao incrementar pelo método O VALOR DO OBJETO É ALTERADO e como está apontado na stack vai apresentar o novo valor
    }
}
