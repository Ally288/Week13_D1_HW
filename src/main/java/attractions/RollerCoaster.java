package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public String isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() > 145 && visitor.getAge() > 12)
            return "Visitor Allowed in";
        else
            return "Visitor not allowed in";
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double PriceFor(Visitor visitor) {
        if (visitor.getHeight() > 200)
            return defaultPrice() * 2;
        else
            return defaultPrice();
    }
}
