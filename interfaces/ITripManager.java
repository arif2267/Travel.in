package interfaces;

import models.Trip;

public interface ITripManager {
    void showTrips();
    Trip getTrip(int index);
}
