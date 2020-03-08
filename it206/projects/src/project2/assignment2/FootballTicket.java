package project2.assignment2;

/*
Name: Varun Palaniappan
Date: 2/16/20
Course & Section: IT 206-2D1
Assignment Number: 2

Description: This program sets up an event based on the user input of event name, number of tickets to be sold,
and whether it is a sponsored event or not.

This class is also reponsible for calculating the final revenue and if it is sponsored, it will calculate the
sponsored donation amount.

This class is also utilized to give a summary of the event information as follows:

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

public class FootballTicket {
    private String eventName;
    private int maxAvailableTickets;
    private int numAdultTicketsSold;
    private int numChildTicketsSold;
    private int numFreeTicketsSold;
    private boolean isSponsored;
    public static final double adultTicketPrice = 7.00;
    public static final double childTicketPrice = 4.00;
    public static int remainingTickets = 5000;


    public FootballTicket (String eventName, boolean isSponsored) {
        this.maxAvailableTickets = 5000;
        this.eventName = eventName;
        this.isSponsored = isSponsored;
    }

    public FootballTicket (String eventName, boolean isSponsored, int maxAvailableTickets) {
        this.maxAvailableTickets = maxAvailableTickets;
        this.eventName = eventName;
        this.isSponsored = isSponsored;
    }

    // The default capacity set to 5000
    public FootballTicket () {
        this.maxAvailableTickets = 5000;

    }

    public String getEventName() {
       return this.eventName;
    }

    public boolean setEventName(String eventName) {
        if (!eventName.equals("")) {
            this.eventName = eventName;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean getIsSponsored() {
        return this.isSponsored;
    }

    // The only accepted values are Y or N
    public boolean setIsSponsored(String sponsored) {
        if (!sponsored.equals("") && (sponsored.equalsIgnoreCase("Y") || sponsored.equalsIgnoreCase("N"))) {
            if ("Y".equalsIgnoreCase(sponsored))
                this.isSponsored = true;
            else
                this.isSponsored = false;
            return true;
        }
        else {
            return false;
        }
    }

    public int getMaxAvailableTickets() {
        return this.maxAvailableTickets;
    }

    // Available Tickets cannot be a negative value or exceed the default capacity of 5000
    public boolean setMaxAvailableTickets(int maxAvailableTickets) {
        if (maxAvailableTickets > 0 && maxAvailableTickets < 5000) {
            this.maxAvailableTickets = maxAvailableTickets;
            remainingTickets = maxAvailableTickets;
            return true;
        }
        else {
            return false;
        }
    }

    public int getNumAdultTicketsSold() {
        return this.numAdultTicketsSold;
    }

    public int getNumChildTicketsSold() {
        return this.numChildTicketsSold;
    }

    public int getNumFreeTicketsSold() {
        return this.numFreeTicketsSold;
    }

    public void sellTicket(int numTickets, String ticketType) {
        if ("Adult".equalsIgnoreCase(ticketType))
            numAdultTicketsSold = numAdultTicketsSold + numTickets;

        else if ("Child".equalsIgnoreCase(ticketType))
            numChildTicketsSold = numChildTicketsSold + numTickets;

        else
            numFreeTicketsSold = numFreeTicketsSold + numTickets;


        this.remainingTickets = remainingTickets - numTickets;
    }

    public double calculateRevenue() {
        double revenue = this.numAdultTicketsSold * adultTicketPrice + this.numChildTicketsSold * childTicketPrice;
        return revenue;
    }

    public double calculateSponsoredRevenue() {
        double sponsoredRevenue = (this.numAdultTicketsSold + this.numChildTicketsSold) * 1.00;
        return sponsoredRevenue;
    }

    public String toString() {
        return this.getEventName() + " is a sponsored event: " + this.getIsSponsored() + " with maximum capacity of: "
                + this.getMaxAvailableTickets() + " tickets";

    }

    public String printSalesReport() {

        String report = "Event:                          " + this.getEventName()
                        + "\nTickets Available:               "
                        + this.getMaxAvailableTickets()
                        + "\nAdult tickets sold:              "
                        + this.getNumAdultTicketsSold()
                        + "\nChild tickets sold:              "
                        + this.getNumChildTicketsSold()
                        + "\nFree tickets sold :               "
                        + this.getNumFreeTicketsSold()
                        + "\nTotal tickets sold:              "
                        + (this.getMaxAvailableTickets() - remainingTickets)
                        + "\nTotal revenue:                     "
                        + String.format("$%.2f", calculateRevenue());

        if(getIsSponsored()){
            report = report + "\nThis is a sponsored event "
                     + "\nsponsor donations:               " + String.format("$%.2f", calculateSponsoredRevenue());
        }
        else
            report = report + "\nThis is a non-sponsored event ";



        return report;

    }
}



