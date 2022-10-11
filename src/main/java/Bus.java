import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public void addPassengerToBusFromQueue(BusStop busStop) {
        Person person = busStop.removePersonFromQueue();
        if (this.passengers.size() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePassengerFromBus() {
        this.passengers.remove(0);
    }
}
