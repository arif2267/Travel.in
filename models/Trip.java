package models;

public class Trip {
    public String destination;
    public int days;
    public double price;

    public Trip(String destination, int days, double price) {
        this.destination = destination;
        this.days = days;
        this.price = price;
    }

    @Override
    public String toString() {
        return destination + " - " + days + " Days - $" + price;
    }
}
