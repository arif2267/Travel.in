package services;

import interfaces.IPaymentService;

public class PaymentService implements IPaymentService {
    @Override
    public boolean processPayment(double amount, String method) {
        System.out.println("\nProcessing payment of $" + amount + " using " + method + "...");
        return true; // Simulasi pembayaran sukses
    }
}
