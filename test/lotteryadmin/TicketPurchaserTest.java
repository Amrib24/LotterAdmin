package lotteryadmin;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amr
 */
public class TicketPurchaserTest {
    
    static TicketPurchaser  instance;
    
    public TicketPurchaserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = new TicketPurchaser();
    }
    


    /**
     * Test of purchase method, of class TicketPurchaser.
     * @throws java.lang.Exception
     */
    @Test
    public void testPurchase() throws Exception {
        System.out.println("purchase");
        String name = "foo";
        Ticket expResult = new Ticket(1, "Foo");
        Ticket result = instance.purchase(name);
        assertEquals(expResult.getTicketNumber(), result.getTicketNumber());
        // Also test that the name was capitalized correctly
        assertEquals(expResult.getName(),"Foo");
    }
    
    /**
     * Test of numTicketsCurrentlySold method, of class TicketPurchaser.
     */
    @Test
    public void testTicketsCurrentlySold() {
        System.out.println("ticketsCurrentlySold");
        int expResult = 1;
        int result = instance.numTicketsCurrentlySold();
        assertEquals(expResult, result);
    }

}
