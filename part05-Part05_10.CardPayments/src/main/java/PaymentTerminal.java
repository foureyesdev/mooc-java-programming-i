
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the
        // change
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment
        double mealPrice = 2.50;

        if (payment >= mealPrice) {
            affordableMeals++;
            double change = payment - mealPrice;
            this.money += mealPrice;
            return change;
        }

        return payment;
    }

    public boolean eatAffordably(PaymentCard paymentCard) {
        double mealPrice = 2.50;

        if (paymentCard.takeMoney(mealPrice)) {
            affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the
        // change
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment

        double mealPrice = 4.30;

        if (payment >= mealPrice) {
            heartyMeals++;
            double change = payment - mealPrice;
            this.money += mealPrice;
            return change;
        }

        return payment;
    }

    public boolean eatHeartily(PaymentCard paymentCard) {
        double mealPrice = 4.30;

        if (paymentCard.takeMoney(mealPrice)) {
            heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard paymentCard, double sum) {
        if (sum > 0 && this.money >= sum) {
            paymentCard.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
