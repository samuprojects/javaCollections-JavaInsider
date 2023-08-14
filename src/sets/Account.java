package sets;

import java.util.Objects;

@SuppressWarnings("ALL")
public class Account {

    private final String number;
    private final double balance;

    public Account(String number, double balance) {
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
        Account account = (Account) o;
        return Double.compare(balance, account.balance) == 0 && Objects.equals(number, account.number);
    }

    // o hashCode é usado junto com o equals, o resultado do equals vai gerar um número de hash
    // a ideia é gerar números diferentes para objetos que são diferentes (eventualmente pode ser que objetos
    // diferentes gerem o mesmo número e não tem problema)
    // o que não pode ocorrer é objetos iguais gerando hashCode diferentes porque vai gerar problemas
    // é como se fosse um identificar inteiro de um objeto (pois retorna um int)
    @Override
    public int hashCode() {
        return Objects.hash(number, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
