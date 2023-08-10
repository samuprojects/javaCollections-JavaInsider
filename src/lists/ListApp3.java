package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("ALL")
public class ListApp3 {

    public static void main(String[] args) {
        var list = new ArrayList<>(List.of("A", "B", "C", "D", "E")); // incluído ArrayList no final da aula para transformar em uma lista mutável e testar o remove do iterator

        // outras formas de iterar listas

        // for clássico
        for (int i = 0; i < list.size(); i++){ // size é um método da lista que retorna o tamanho
            String s = list.get(i);
            System.out.println(s);

            // podemos iterar de várias formas, de trás pra frente, de 2 em 2, enfim o for clássico possui diversas formas de utilização
        }

        // outra forma é usando o método iterator que retorna um objeto do tipo Iterator e permite percorrer uma determinada coleção

        Iterator<String> iter = list.iterator(); // para percorrer a lista toda geralmente usa while
        while (iter.hasNext()) { // hasNext controla se há um próximo elemento para seguir adiante, se tiver chama o next
            String s = iter.next();
            if (s.equals("C")){
                iter.remove();
            }

            // o iterator quanto a remoção já possui um método que reorganiza tudo (índices) enquanto está na iteração
            // o que não se poder fazer com o enhenced for porque sempre percorre do início ao fim
            // e no caso do for clássico é possível porém deve sere reordenado manualmente por causa da mudança dos índices

        }

        System.out.println(list);
    }
}
