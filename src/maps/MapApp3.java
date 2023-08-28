package maps;

import java.util.Map;
import java.util.TreeMap;

public class MapApp3 {

    public static void main(String[] args) {

        // Ficar atento com o uso de classes que você mesmo criou em chaves (exemplo a classe Name) para associar com values

        //Map<Name, Integer> map = new HashMap<>(); // primeira versão do código da aula

        Map<Name, Integer> map = new TreeMap<>(); // alterado para testar ordenação alfabética correta com TreeMap
        map.put(new Name("João", "Oliveira"), 35);
        map.put(new Name("Maria", "Silva"), 22);
        map.put(new Name("Celso", "Cerqueira"), 43);
        map.put(new Name("Celso", "Cerqueira"), 43); // sempre implementar o equals e hashCode quando for utilizar classes personalizadas
        // porque como essas estruturas dependem da comparação, quando não está implementado o equals e hashCode como estamos
        // utilizando um new para o java será outro Object, independente do conteúdo que possui

        System.out.println(map); // se o método toString não estiver sobrescrito na classe name vai trazer o hash do objeto


        // outro ponto se for usar TreeMap já implementar tudo, equals/hashcode, Comparable compareTo quando utilizar classes personalizadas
        // já para as classes wrappers (e enums) do Java não é necessário pois já trazem toda essa lógica embutido nelas


    }
}
