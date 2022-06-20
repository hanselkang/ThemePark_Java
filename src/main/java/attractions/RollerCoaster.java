package attractions;

import behaviours.*;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight()>1.45){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2.00 ) {
            return this.defaultPrice()*2;
        }
        else {
            return this.defaultPrice();
        }
    }
}
