import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void setUp(){
        bus = new Bus("Edinburgh", 5);
        busStop = new BusStop("Princes Street");
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassengerIfLessThanCapacity(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        bus.addPassengerToBusFromQueue(busStop);
        bus.addPassengerToBusFromQueue(busStop);
        bus.addPassengerToBusFromQueue(busStop);
        assertEquals(3,bus.passengerCount());
    }

    @Test
    public void addPassengerIfMoreThanCapacity(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        bus.addPassengerToBusFromQueue(busStop);
        bus.addPassengerToBusFromQueue(busStop);
        bus.addPassengerToBusFromQueue(busStop);
        bus.addPassengerToBusFromQueue(busStop);
        bus.addPassengerToBusFromQueue(busStop);
        bus.addPassengerToBusFromQueue(busStop);
        assertEquals(5,bus.passengerCount());
    }

    @Test
    public void canRemovePassengerFromBus(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        bus.addPassengerToBusFromQueue(busStop);
        bus.addPassengerToBusFromQueue(busStop);
        bus.addPassengerToBusFromQueue(busStop);
        bus.removePassengerFromBus();
        assertEquals(2, bus.passengerCount());

    }
    @Test
    public void canPickUpPassenger(){
        busStop.addPersonToQueue(person);
        bus.addPassengerToBusFromQueue(busStop);
        assertEquals(1, bus.passengerCount());
    }

}
