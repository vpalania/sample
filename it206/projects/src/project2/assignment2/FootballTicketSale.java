package project2.assignment2;

/*
Name: Varun Palaniappan
Date: 2/16/20
Course & Section: IT 206-2D1
Assignment Number: 2

Description: This program creates an instance of the FootballTicket object and facilitates the sales

This class is also reponsible for all user input using JOptionPane. It validates if there are any more remaining
tickets to be purchased before presenting user input option.

This class finally outputs the report to the user by retrieving the report from the Data Definition Class:

Event:                          Penguins vs Rangers
Tickets Available:               10
Adult tickets sold:              4
Child tickets sold:              3
Free tickets sold :              3
Total tickets sold:              10
Total revenue:                   $40.00
This is a sponsored event
sponsor donations:               $7.00

 */


import javax.swing.*;

public class FootballTicketSale {
    public static void main(String [] args) {
        FootballTicket match = getFootballEvent();
        facilitateSale(match);
    }

    // Event Set Up
    public static FootballTicket getFootballEvent() {
        FootballTicket footballMatch = new FootballTicket();

        boolean eventNameSet;
        do {
            eventNameSet = footballMatch.setEventName(JOptionPane.showInputDialog("Enter the name of the event"));
            if (!eventNameSet) {
                JOptionPane.showMessageDialog(null, "You must enter a valid event name.");
            }
        } while (!eventNameSet);

        boolean capacitySet;
        do {
            try {
                capacitySet = footballMatch.setMaxAvailableTickets(Integer.parseInt(JOptionPane.showInputDialog(
                        "Enter the capacity of " + footballMatch.getEventName() + " event")));
            }
            catch (NumberFormatException e) {
                capacitySet = false;
            }
            catch (IllegalArgumentException e) {
                capacitySet = false;
            }
            if (!capacitySet) {
                JOptionPane.showMessageDialog(null, "Invalid capacity. Max Capacity is capped at 5000 for this stadium. Please try again.");
            }
        } while (!capacitySet);

        boolean isSponsoredSet;
        do {
            isSponsoredSet = footballMatch.setIsSponsored(JOptionPane.showInputDialog("Enter Y if this is a sponsored event, else enter N"));
            if (!isSponsoredSet) {
                JOptionPane.showMessageDialog(null, "You must enter either Y or N.");
            }
        } while (!isSponsoredSet);

        return footballMatch;
    }

    // Sale of Ticket
    public static void facilitateSale(FootballTicket match) {

        while(canPurchaseTicket() && (JOptionPane.showInputDialog(
                "Enter Sale to proceed with ticket purchase or any other value to quit").equalsIgnoreCase("sale"))) {
                    ticketPurchase("Adult", match);
                    if(canPurchaseTicket())
                        ticketPurchase("Child", match);
                    if(canPurchaseTicket())
                        ticketPurchase("Free", match);
        }

        JOptionPane.showMessageDialog(null, match.printSalesReport());

    }

    // Validation of Ticket to be purchased
    private static void ticketPurchase(String ticketType, FootballTicket match) {

        boolean ticketPurchase = false;
        do {
            try {
                int tickets = Integer.parseInt(JOptionPane.showInputDialog(
                        "Enter the number of " + ticketType +  " tickets: "));
                if(tickets < 0 || tickets > FootballTicket.remainingTickets) {
                    ticketPurchase = false;
                }
                else {
                    match.sellTicket(tickets, ticketType);
                    ticketPurchase = true;
                }

            }
            catch (NumberFormatException e) {
                ticketPurchase = false;
            }

            if (!ticketPurchase) {
                JOptionPane.showMessageDialog(null, "Invalid ticket count provided. Max tickets remaining to be purchased is " + FootballTicket.remainingTickets + " Please try again");
            }
        } while (!ticketPurchase);

    }

    private static boolean canPurchaseTicket(){
        return FootballTicket.remainingTickets > 0;


    }
}
