package sets;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ExGroceriesList {
    public static void main(String[] args) {
        List<String> itens = new ArrayList<>();
        itens.add("azeite");
        itens.add("arroz");
        itens.add("macarrão");
        itens.add("óleo");
        itens.add("azeite");
        itens.add("queijo");
        itens.add("feijão");
        itens.add("macarrão");
        itens.add("tomate");
        itens.add("queijo");

        removeDuplicates(itens);

        for (var item : itens){
            System.out.println(item);
        }
    }

    private static void removeDuplicates(List<String> itens) {
        Set<String> set = new LinkedHashSet<>(itens); // recebe os itens de ArrayList em set
        itens.clear(); // apaga o parametro itens da lista original
        itens.addAll(set); // grava os valores sem duplicidades de set recebidos primeiro na estrutura da lista original

        // com isso o exercício foi satisfeito considerando o retorno na mesma lista e não criando uma nova.
        // existe outras formas de fazer isso, inclusive sem o Set, porém, dessa forma é mais simples e com menos código.
    }
}
