package com.ClassesAndObjects;
public class FlightDTO {

    private static int flightCount = 0;

    private String flightNumber;
    private String airline;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private double price;
    private int seatsAvailable;

    public FlightDTO(String flightNumber, String airline, String origin, String destination, 
                    String departureTime, String arrivalTime, double price, int seatsAvailable) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        this.seatsAvailable = seatsAvailable;
        flightCount++;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAirline() {
        return airline;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public static int getFlightCount() {
        return flightCount;
    }

    @Override
    public String toString(){

        return """
                %s

                    Flight Number   : %s
                    Airline         : %s
                    Origin          : %s
                    Destination     : %s
                    Departure Time  : %s
                    Arrival Time    : %s
                    Price           : %.2f
                    Seats Available : %d
                %s
            """.formatted("_".repeat(50),getFlightNumber(),getAirline(),getOrigin(),getDestination(),
            getDepartureTime(),getArrivalTime(),getPrice(),getSeatsAvailable(),"_".repeat(50));
    }

    // public static void main(String[] args) {
    //     FlightDTO flight1=new FlightDTO("AIR256", "Air India", "India", "France", "10.00", "19.30",17016.00, 100);
    //     System.out.println(flight1);
    // }
}
