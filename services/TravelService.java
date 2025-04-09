package services;

import interfaces.ITravelService;
import interfaces.IPaymentService;

public class TravelService implements ITravelService {
    private IPaymentService paymentService;

    public TravelService(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void bookTrip(String destination, int days, double price, int persons, String paymentMethod) {
        double totalPrice = price * persons;
        System.out.println("\nBooking trip to " + destination + " for " + persons + " people, for " + days + " days at $" + totalPrice);

        if (paymentService.processPayment(totalPrice, paymentMethod)) {
            System.out.println("Trip successfully booked!");
        } else {
            System.out.println("Payment failed. Trip not booked.");
        }
    }
}
