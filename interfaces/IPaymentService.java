package interfaces;

public interface IPaymentService {
    boolean processPayment(double amount, String method);
}
