import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void setUp(){
        person = new Person();
        busStop = new BusStop("Princes Street");
    }
    @Test
    public void queueIsInitiallyEmpty(){
        assertEquals(0, busStop.getQueueLength());
    }
    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getQueueLength());
    }
    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(2, busStop.getQueueLength());
    }

}
