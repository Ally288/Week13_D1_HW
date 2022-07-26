package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public String isAllowedTo(Visitor visitor) {
        return false;
    }

    @Override
    public int getRating() {
        return 0;
    }
}
