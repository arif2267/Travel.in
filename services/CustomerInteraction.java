package services;

import interfaces.ITripManager;
import interfaces.ITravelService;
import interfaces.ICustomerInteraction;
import models.Trip;
import java.util.Scanner;

public class CustomerInteraction implements ICustomerInteraction {
    private ITripManager tripManager;
    private ITravelService travelService;
    private Scanner scanner;

    public CustomerInteraction(ITripManager tripManager, ITravelService travelService) {
        this.tripManager = tripManager;
        this.travelService = travelService;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void startInteraction() {
        System.out.println("\n=== Welcome to Travel Booking System ===");

        tripManager.showTrips();
        System.out.print("\nChoose a trip (1-3): ");
        int tripChoice = scanner.nextInt();
        scanner.nextLine();

        Trip chosenTrip = tripManager.getTrip(tripChoice - 1);
        if (chosenTrip == null) {
            System.out.println("Invalid choice! Exiting...");
            return;
        }

        System.out.print("Enter number of persons: ");
        int persons = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nPayment Methods:");
        System.out.println("1. Bank Transfer");
        System.out.println("2. Credit Card");
        System.out.println("3. E-Wallet");
        System.out.print("Choose payment method (1-3): ");
        int paymentChoice = scanner.nextInt();
        scanner.nextLine();

        String paymentMethod;
        switch (paymentChoice) {
            case 1:
                paymentMethod = "Bank Transfer";
                break;
            case 2:
                paymentMethod = "Credit Card";
                break;
            case 3:
                paymentMethod = "E-Wallet";
                break;
            default:
                System.out.println("Invalid payment method! Exiting...");
                return;
        }

        travelService.bookTrip(chosenTrip.destination, chosenTrip.days, chosenTrip.price, persons, paymentMethod);
    }
}
