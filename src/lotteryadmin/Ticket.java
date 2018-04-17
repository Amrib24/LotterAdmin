
package lotteryadmin;

/**
 *
 * @author Amr
 */



/*
    Model class to hold ticket data
*/
public class Ticket {
    
    private int ticketNumber;
    private String name;

    
    //Constructor takes ticket number and name as args
    public Ticket(int tn, String name){
        setTicketNumber(tn);
        setName(name);
    }
    
    
    public int getTicketNumber() {
        return ticketNumber;
    }

    // Ticket number is ensured to not be wrong as it is handled well in TicketPurchaser
    private void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getName() {
        return name;
    }

    /*
        Assumptions to make: 
            - It is pretty common for people to have first names that comprise multiple words, especially in MTL
            - Names need to at least be two characters long
    
    */
    private void setName(String name) throws IllegalArgumentException {
        if(name.equals("") || name.length() < 2){
            throw new IllegalArgumentException("Name cannot be empty and must be greater than 1 character");
        }
        // Clean the input name of white space and convert to string array
        String[] names = name.trim().split("\\s+");
        // Feed array to Util method to clean up the name and set it to field
        this.name = Utils.capitalize(names);
    }
    
    @Override
    public String toString(){
        return "Ticket: " + getTicketNumber() + " | " + "Name: " + getName();
    }
    

}
