package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(15,1.6,30);
        visitor1 = new Visitor(16, 1.7, 40.0);
        visitor2 = new Visitor(32, 2.2, 40.0);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorIsAllowedToEnter() {
        assertEquals(true,rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void defaultPrice() {
        assertEquals(8.4, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void priceForUnder12() {
        assertEquals(8.4, rollerCoaster.priceFor(visitor1), 0.0);
    }
    @Test
    public void priceForOver12() {
        assertEquals(16.8, rollerCoaster.priceFor(visitor2), 0.0);
    }
}
