package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Park extends Attraction implements ITicketed {

    public Park(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 0;
    }

    @Override
    public double PriceFor(Visitor visitor) {
        return 0;
    }
}
