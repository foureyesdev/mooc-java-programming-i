public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.addMoney(openingBalance);
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if ((amount > 150) || (amount + this.balance >= 150)) {
            this.balance = 150;
        }

        if ((amount > 0) && (amount + this.balance < 150)) {
            this.balance += amount;
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
