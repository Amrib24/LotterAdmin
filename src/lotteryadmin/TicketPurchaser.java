
package lotteryadmin;

import java.util.ArrayList;

/**
 *
 * @author Amr
 */


/*
Class that is in charge of handling the purchasing limitations as per client request

There can only be 50 tickets sold max per draw round
*/
class TicketPurchaser {
    
    
    //Ticket Limit per round - Constant
    private final int MAX_TICKETS = 50;
    private int newTicketNumber;
    private Ticket newTicket;
    
    /*
    To store the tickets that have been sold, an ArrayList for flexibility of adding
    tickets and quick access reading and maintaining max limit of tickets
    
    */
    
    private ArrayList<Ticket> soldTickets;
    
    
    //Constructor setting that instantiates the soldTickets
    public TicketPurchaser(){
        this.soldTickets = new ArrayList<>();
    }
    
    // Getter for current sold tickets list
    public ArrayList<Ticket> getTicketsSold(){
        return soldTickets;
    }
    
    
    // Method to retreive the current sales list
    public int numTicketsCurrentlySold(){
        return soldTickets.size();
    }
    
    // Method to run the ticket sale trasaction and return it
    public Ticket purchase(String name) throws LotteryLimitHitException {
        if (soldTickets.size() < MAX_TICKETS){
            newTicketNumber = soldTickets.size() + 1;
            newTicket = new Ticket(newTicketNumber, name);
            soldTickets.add(newTicket);
            return newTicket;
        }
        throw new LotteryLimitHitException("Ticket Limit purchases is hit: " + MAX_TICKETS);
    }
    
    // Method to print out the ticket that was purchased
    public String printTransaction(Ticket tk){
        return tk.toString();
    }
    
    // Method to clear Purchaser of previous sales
    public void clearRoundSales(){
        soldTickets.clear();
    }
}