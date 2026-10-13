
import java.util.ArrayList;
import java.util.List;

abstract class Transport {
    final String trackingId;
    String destination;

    Transport(String trackingId, String destination) {
        this.trackingId = trackingId;
        this.destination = destination;
    }

    abstract void dispatch();
}

interface GPS {
    String getCoordinates();
}

interface Autonomous {
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS, Autonomous {
    DeliveryDrone(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Drone " + trackingId + " taking off...");
    }

    @Override
    public String getCoordinates() {
        return "40.7128 N, 74.0060 W";
    }

    @Override
    public void selfNavigate() {
        System.out.println("Drone navigating to " + destination);
    }
}

class Truck extends Transport {
    Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    void dispatch() {
        System.out.println("Truck " + trackingId + " starting...");
    }
}

public class SmartLogistics {
    public static void main(String[] args) {
        List<Transport> vehicles = new ArrayList<>();

        vehicles.add(new DeliveryDrone("D101", "Hospital"));
        vehicles.add(new Truck("T201", "Warehouse"));

        for (Transport t : vehicles) {
            t.dispatch();

            if (t instanceof GPS) {
                GPS g = (GPS) t;
                System.out.println("Coordinates: " + g.getCoordinates());
            }

            if (t instanceof Autonomous) {
                Autonomous a = (Autonomous) t;
                a.selfNavigate();
            }

            System.out.println();
        }
    }
}
