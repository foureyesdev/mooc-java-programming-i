
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();

        if (newCents > 99) {
            newCents = newCents - 100;
            newEuros = newEuros + 1;
        }

        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        boolean isLessThan = false;

        if ((100 * this.euros + this.cents) < (100 * compared.euros() + compared.cents())) {

            isLessThan = true;
        }

        return isLessThan;
    }

    public Money minus(Money decreaser) {
        int NewEuros = this.euros - decreaser.euros();
        int newCents = this.cents - decreaser.cents();

        if (newCents < 0) {
            newCents = newCents + 100;
            NewEuros = NewEuros - 1;
        }

        if (NewEuros < 0) {
            NewEuros = 0;
            newCents = 0;
        }

        Money newMoney = new Money(NewEuros, newCents);

        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
