package org.prog.homework3;

import java.util.Objects;

public class Plane {

    private String flightId;
    private String destination;
    private String airlines;

    // Constructor
    public Plane(String flightId, String destination, String airlines) {
        this.flightId = flightId;
        this.destination = destination;
        this.airlines = airlines;
    }

    // Getters
    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Plane plane = (Plane) obj;
        return Objects.equals(flightId, plane.flightId) &&
                Objects.equals(destination, plane.destination) &&
                Objects.equals(airlines, plane.airlines);
    }

    // Overriding hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(flightId, destination, airlines);
    }

    // toString for better readability
    @Override
    public String toString() {
        return "Plane{" +
                "flightId='" + flightId + '\'' +
                ", destination='" + destination + '\'' +
                ", airlines='" + airlines + '\'' +
                '}';
    }
}
