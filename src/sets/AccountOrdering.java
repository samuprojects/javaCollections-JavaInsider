package sets;

import java.util.Objects;

@SuppressWarnings("ALL")
public class AccountOrdering implements Comparable<AccountOrdering> {

    private final String number;
    private final double balance;

    public AccountOrdering(String number, double balance) {
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
        AccountOrdering account = (AccountOrdering) o;
        return Double.compare(balance, account.balance) == 0 && Objects.equals(number, account.number);
    }

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

    @Override
    public int compareTo(AccountOrdering o) {
        return this.number.compareTo(o.number);
        // acima estamos comparando o número da conta desse objeto com o numero qu está sendo passado como parametro no compareTo()
        // assim aproveitamos uma implementação e o resultado na aplicação será satisfatório.
    }
}
