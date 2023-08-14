package sets;

import java.util.HashSet;
import java.util.Set;

public class SetApp2 {

    public static void main(String[] args) {
        Account a1 = new Account("123", 100);
        Account a2 = new Account("456", 200);
        Account a3 = new Account("456", 200); // com o equals e hashCode não vai aparecer essa informação

        var accounts = Set.of(a1, a2); // o Set.of é uma forma simples de criar conjuntos imutáveis (assim como foi feito no List.of)

        var accounts2 = new HashSet<Account>();
        accounts2.add(a1);
        accounts2.add(a2);
        accounts2.add(a3);

        for (Account account : accounts){
            System.out.println(account);
        }

        for (Account account: accounts2) {
            System.out.println(account);
            
        }
    }
} // não usar o equals e hashCode fará com que o Java utilize a verificação padrão de Object que é usar somente o equals
// o equals tem por padrão checar os endereços de memória , o que resultaria num false e consequentemente um erro
// com a "duplicação" do elemento (na verdade para o Java é outro, por isso permite a exibição do valor)
