package interfaces;

public interface ITravelService {
    void bookTrip(String destination, int days, double price, int persons, String paymentMethod);
}
