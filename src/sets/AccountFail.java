package sets;

import java.util.Objects;

@SuppressWarnings("ALL")
public class AccountFail {

    private final String number;
    private final double balance;

    public AccountFail(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountFail account = (AccountFail) o;
        return Double.compare(balance, account.balance) == 0 && Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, balance);
    }
    // usar sempre o Objects.hash
    // um dos erros existentes é usar um random por exemplo para gerar o hashCode como a seguir
    // public int hashCode() { return (int) (Math.random() * 1000); }
    // o resultado é que vai permitir gravar objetos iguais com hash diferente e na hora de buscar nunca encontra
    // e pode ocorrer de dependendo do número randomico informar que encontrou, ou seja, totalmente inconsistente
    // retornar um número apenas como 1 no hash também não serve para nada
    // usar sempre as implementações do Java para o hascode e equals estando atento para que os campos sejam os mesmos
    // para o equals e hasCode.

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
