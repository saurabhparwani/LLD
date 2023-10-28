package designpatterns.behavioral.mediator;

/**
 * Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects.
 * The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.
 * */

public class Runner {
    public static void main(String args[])
    {
        IATCMediator atcMediator = new ATCMediator();
        Flight flight = new Flight(atcMediator);
        Runway runway = new Runway(atcMediator);
        atcMediator.registerFlight(flight);
        atcMediator.registerRunway(runway);
        flight.getReady();
        runway.land();
        flight.land();

    }
}
