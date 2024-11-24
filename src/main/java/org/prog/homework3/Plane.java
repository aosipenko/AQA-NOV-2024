package org.prog.homework3;
import org.prog.cars.Car;

public class Plane {
    public String flightId;
    public String destination;
    public String airlines;

    @Override
    public int hashCode(){
        return (flightId+destination+airlines).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Plane) {
            Plane a = (Plane) obj;
            boolean PlanesDestinationSame = this.flightId.equals(a.flightId)&&
                    this.destination.equals(a.destination)&&
                    this.airlines.equals(a.airlines);
            return PlanesDestinationSame;
        }
        return false;
    }
}