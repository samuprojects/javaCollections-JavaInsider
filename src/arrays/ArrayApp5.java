package arrays;

@SuppressWarnings("ALL")
public class ArrayApp5 {

    public static void main(String[] args) {

        int sum = sum(new int[] {5, 6, 3, 10});
        System.out.println(sum);

        int sum2 = sum2("Numbers", 6, 3, 10, 4, 6, 7, 9, 10); // com o varargs não precisamos usar o new para criar o array, pois é feito internamente
        System.out.println(sum2); // o único ponto de atenção e que ele deve ser declarado sempre por último no parametro
    }

    private static int sum(int[] numbers){
        int sum = 0;
        for (int n: numbers){
            sum += n;
        }
        return sum;
    }

    private static int sum2(String prefix, int... numbers){ // o varargs é um método que permite trabalhar como se fosse um array
        int sum = 0;
        for (int n: numbers){
            sum += n;
        }
        System.out.println((prefix));
        return sum;
    }
}
