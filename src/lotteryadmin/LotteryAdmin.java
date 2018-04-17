package lotteryadmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Amr
 */

/*
Use Case Story: Client wants an interface to easily sell lottery tickets and adminster the draws for it


For Simplicity: JFrame and Swing was used for the GUI

This class will encapsulate a Ticket Purchaser and handle running the draws and present the winners if applicable


*/
public class LotteryAdmin {
    
    private final int TICKET_PRICE = 10;
    
    private TicketPurchaser register;
    // We start off the Pot at $200
    private int currentPot = 200;
    
    //Round counter, for logging purposes
    int count = 0;

    public int getCurrentPot() {
        return currentPot;
    }
    
    // We have a contenstants list
    private ArrayList<Ticket> currentRoundContestants;

    // We have a winner Queue for administering the draw outcomes
    private Queue<Ticket> winnersList;

    
    /*
        winner queue getter
    */
    public Queue<Ticket> getWinnersList() {
        return winnersList;
    }

    // Sales ticket
    private Ticket saleTicket;

    
    // Encapsulating the current ticket
    private Ticket getSaleTicket() {
        return saleTicket;
    }

    private void setSaleTicket(Ticket saleTicket) {
        this.saleTicket = saleTicket;
    }
    
    
    
    // Constructor that instantiates the TickerPurchaser
    public LotteryAdmin() {
        register = new TicketPurchaser();
        winnersList = (Queue<Ticket>) new LinkedList();
    }
    
    
    // Method to get number of sales in current round
    public int getSoldTicketTotal(){
        return register.numTicketsCurrentlySold();
    }
    
    private void incrementPot(int sale){
        currentPot += sale;
    }
    
    public Ticket sale(String currentCustomer) throws LotteryLimitHitException{
        try{
            setSaleTicket(register.purchase(currentCustomer));
            incrementPot(TICKET_PRICE);
            return getSaleTicket();
        } catch (LotteryLimitHitException ex){
            //Chain the message to prompt admin to run draw before we proceed with next sale
            throw new LotteryLimitHitException(ex.getMessage() + "\n" + 
                        "Please run a draw before proceeding.");
        }
    }
    // Method to return an outcome for a draw in a form of a queue
    public Queue<Ticket> runDraw(){
        //Increment count number for round
        count++;
        winnersList.clear();
        currentRoundContestants = register.getTicketsSold();
        // Generate 3 random integer within range 1 - 50
        Random r = new Random();
        int[] raffleNums = r.ints(3, 1, 50).toArray();
        //For Logging Purposes
        System.out.printf("Lottery Round %d Winning Numbers: %d | %d | %d\n", count, 
                            raffleNums[0], raffleNums[1], raffleNums[2]);
        // Remove potential duplicates with Utils method
        Set winningNums = Utils.eliminateDuplicateUsingSet(raffleNums);
        Iterator iter = winningNums.iterator();
        // loop over winning lottery numbers
        while (iter.hasNext()){
            int win = (int) iter.next();
            // Check if the win # is greater than the current size of the contestant list
            if(currentRoundContestants.size() < win){
                // No ticket by that number was sold this round, no winner
                continue;
            }
            //Otherwise we can add a winner to the queue, with care to Off by 1
            winnersList.add(currentRoundContestants.get(win - 1));
        }
        return winnersList;
    }
    
    // Method to distribute winnings and reset round
    public HashMap<Integer, String> finalizeDraw(Queue<Ticket> winners){
        // Check if winners list is empty
        if (winners.isEmpty()){
            register.clearRoundSales();
            return null;
        }
        // Split the prizes to the winners 
        int prizePot = currentPot / 2;
        // place starting with first
        int place = 1;
        // Off balancing the truncated roundings, on average deviation is 1
        int totalPrizeMoneyTaken = 1;
        HashMap<Integer, String> drawOutCome = new HashMap<>(); 
        //Loop the winners queue
        for (Ticket tk : winners) {
            // Calculate prizes based on desc order of places 1 -> 2 -> 3
            int prize = calculatePrize(place, prizePot);
            // Add up the total in prizes taken
            totalPrizeMoneyTaken += prize;
            // Winners come in a queue, so ticket # and prize storage is safe
            drawOutCome.put(place, String.valueOf(tk.getTicketNumber() + ";" +  prize));
            // Increment place for next winner
            place++;
        }
        // Set new pot
        currentPot = currentPot - totalPrizeMoneyTaken;
        //Reset purchase list
        register.clearRoundSales();
        
        //Return the finalist lists with their respective prizes
        return drawOutCome;
    }
    
    //Method to display winners of the round, if there are any
    public String displayWinners(HashMap<Integer, String> winners){
        if (winners == null){
            return "No Winners last round!";
        }
        //We create a String builder to create the winners list
        StringBuilder announcement = new StringBuilder();
        announcement.append("Wiiners last Round:\n");
        // Winners list loop commence
        for (int i = 1; i < 4; i++){
            //Check that the place has a winner this round and append to announcement
            if(winners.containsKey(i)){
                String[] details = winners.get(i).split(";");
                announcement.append("Place: ").append(i)
                            .append("| Ticket: ").append(details[0])
                            .append("| Prize: ").append(details[1]).append('\n');
            }
        }
        return announcement.toString();
    }
    
    //Method to calculate prize
    // As per instruction, we can round up decimals
    private int calculatePrize(int place, int total){
        switch(place){
            case 1:
                return (int)(total * 0.75);
            case 2:
                return (int)(total * 0.15);
            case 3:
                   return (int)(total * 0.10);
            default:
                return 0;
        }
    }
}