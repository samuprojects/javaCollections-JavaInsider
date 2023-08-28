package maps;

import java.util.*;

public class MapApp2 {

    public static void main(String[] args) {

        Map<String, Integer> scoreMap = new HashMap<>(); // mapear jogadores para pontuação
        scoreMap.put("Player A", 300);
        scoreMap.put("Player B", 500);
        scoreMap.put("Player C", 200);
        scoreMap.put("Player D", 700);

        Set<String> keys = scoreMap.keySet(); // keySet retorna um Set trazendo um conjunto de valores não duṕlicados com as chaves

        // a partir daí podemos iterar sobre um Set normal
        for (String key : keys){
            System.out.println(key); // observar que a ordem de inserção não é a mesma da iteração
            // por isso é importante escolher corretamente qual tipo de implementação usar dependendo das necessidades
            // no exemplo acima se o desejo é obter a mesma ordem de inserção na iteração podemos trocar a linha 11 do código para new LinkedHashMap<>();
        }

        // além das key podemos também obter os values usando o .values() que retorna um Collection, no nosso exemplo do tipo Integer
        Collection<Integer> values = scoreMap.values();

        for (Integer value: values) {
            System.out.println(value); // se quiser obter na ordem de inserção trocar a linha 11 para new LinkedHashMap<>();
        }


        // acima foi visto como obter e iterar sobre keys ou values individualmente, porém, é possível obter os dois
        // para isso utilizamos o entrySet que traz uma interface Entry que está dentro de Map e por isso acessamos como Map.Entry
        // e precisamos informar o tipo do par (chave/valor - key/value) que desejamos obter

        //Set<Map.Entry<String, Integer>> entries = scoreMap.entrySet();

        //caso não queira lidar diretamente com os tipos acima pode usar o var que o java fará a identificação automaticamente conforme a seguir
        var entries = scoreMap.entrySet();

        for (var entry : entries) {
            System.out.format("%s ===> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
