
package lotteryadmin;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amr
 */
public class TicketTest {
    
    static Ticket instance;
    
    public TicketTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = new Ticket(1, "Foo");
    }
    

    /**
     * Test of getTicketNumber method, of class Ticket.
     */
    @Test
    public void testGetTicketNumber() {
        System.out.println("getTicketNumber");
        int expResult = 1;
        int result = instance.getTicketNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Ticket.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Foo";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of toString method, of class Ticket.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Ticket: 1 | Name: Foo";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
