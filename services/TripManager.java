package services;

import interfaces.ITripManager;
import models.Trip;
import java.util.ArrayList;
import java.util.List;

public class TripManager implements ITripManager {
    private List<Trip> trips = new ArrayList<>();

    public TripManager() {
        trips.add(new Trip("Japan", 7, 1500));
        trips.add(new Trip("France", 10, 2500));
        trips.add(new Trip("Bali", 5, 800));
    }

    @Override
    public void showTrips() {
        System.out.println("\nAvailable Trips:");
        for (int i = 0; i < trips.size(); i++) {
            System.out.println((i + 1) + ". " + trips.get(i));
        }
    }

    @Override
    public Trip getTrip(int index) {
        if (index >= 0 && index < trips.size()) {
            return trips.get(index);
        }
        return null;
    }
}
