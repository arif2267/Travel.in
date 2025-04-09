import interfaces.*;
import services.*;

public class Main {
    public static void main(String[] args) {
        IPaymentService paymentService = new PaymentService();
        ITripManager tripManager = new TripManager();
        ITravelService travelService = new TravelService(paymentService);
        ICustomerInteraction customerInteraction = new CustomerInteraction(tripManager, travelService);

        customerInteraction.startInteraction();
    }
}
