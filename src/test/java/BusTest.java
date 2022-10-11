import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void setUp(){
        bus = new Bus("Edinburgh", 5);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassengerIfLessThanCapacity(){
        bus.addPassengerToBus(person);
        bus.addPassengerToBus(person);
        bus.addPassengerToBus(person);
        assertEquals(3,bus.passengerCount());
    }

    @Test
    public void addPassengerIfMoreThanCapacity(){
        bus.addPassengerToBus(person);
        bus.addPassengerToBus(person);
        bus.addPassengerToBus(person);
        bus.addPassengerToBus(person);
        bus.addPassengerToBus(person);
        bus.addPassengerToBus(person);
        assertEquals(5,bus.passengerCount());
    }

    @Test
    public void canRemovePassengerFromBus(){
        bus.addPassengerToBus(person);
        bus.addPassengerToBus(person);
        bus.addPassengerToBus(person);
        bus.removePassengerFromBus();
        assertEquals(2, bus.passengerCount());

    }

}
