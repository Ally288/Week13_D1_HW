package behaviours;

import people.Visitor;

public interface ISecurity {

    String isAllowedTo(Visitor visitor);
}
