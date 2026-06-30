
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int calculateTotalPrice() {
        return this.pricePerSquare * this.squares;
    }

    public int priceDifference(Apartment compared) {
        int apartmentPrice = this.calculateTotalPrice();
        int comparedPrice = compared.calculateTotalPrice();
        int diff = apartmentPrice - comparedPrice;

        if (diff < 0) {
            return diff * (-1);
        }

        return diff;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.calculateTotalPrice() > compared.calculateTotalPrice();
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

}
