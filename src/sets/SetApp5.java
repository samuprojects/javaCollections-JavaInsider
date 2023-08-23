package sets;

import java.util.Comparator;
import java.util.TreeSet;

public class SetApp5 {
    public static void main(String[] args) {

        // Supondo que houve uma mudança de requisitos e queremos fazer a ordenação por ordem decrescente de saldo
        // A implementação do Comparable realiza a ordenação de forma crescente e alfabética do número da conta
        // Uma ideia seria alterar a implementação do compareTo, porém, isso poderia quebrar outro código que está funcionando,
        // ou mesmo esse código vem de um recurso externo.
        // Nesse caso o mais recomendado é utilizar o Comparator (como foi feito com as Listas)
        // Para isso precisamos passar uma instancia desse Comparator no construtor do TreeSet
        // O Comparator tem prioridade sobre o Comparable, por isso as implementações de AccountOrdering não serão chamados obtendo o resultado esperado
        // Para isso vamos criar uma classe Comparator (AccountComparator) que vai implementar o Comparator


        //var set = new TreeSet<>(new AccountComparator());

        // Outra possibilidade é usando o comparing passando o campo desejado para comparação
        var set = new TreeSet<>(Comparator.comparing(AccountOrdering::getBalance).reversed()); // o reversed faz a ordenação inversa e utiliza o conceito de expressões Lambda que será visto posteriormente
        set.add(new AccountOrdering("431", 100));
        set.add(new AccountOrdering("111", 200));
        set.add(new AccountOrdering("678", 300));

        System.out.println(set);
    }
}
