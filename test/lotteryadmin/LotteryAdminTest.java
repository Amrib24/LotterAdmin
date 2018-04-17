package lotteryadmin;

import java.util.Collection;
import java.util.Queue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amr
 */
public class LotteryAdminTest {
    
    /*
    Design Philosophy:
        For this class the testing is ispolated at the method level
        We will be instantiating a new LotteryAdmin class for every case
        This mitigates the inability to guarantee which method is executed first
        Good Test Practice is to also make the tests independent of each other
    */
    
    
    
    private static LotteryAdmin instance;
    private static TestUtils testDataProvider = new TestUtils();
    
    public LotteryAdminTest() {
    }
    
    /**
     * Test the number of sold tickets at first before any sale
     */
    @Test
    public void testgetSoldAtStart(){
        System.out.println("getSoldAtStart");
        int expResult = 0;
        // Simulating what occurs at the start, an empty new LotteryAdmin class
        instance = new LotteryAdmin();
        int result = instance.getSoldTicketTotal();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrentPot method, of class LotteryAdmin at start.
     */
    @Test
    public void testGetCurrentPotAtStart() {
        System.out.println("getCurrentPot");
        int expResult = 200;
        instance = new LotteryAdmin();
        int result = instance.getCurrentPot();
        assertEquals(expResult, result);
    }

    /**
     * Test of sale method, of class LotteryAdmin.
     * @throws java.lang.Exception
     */
    @Test
    public void testSale()throws Exception{
        System.out.println("sale");
        String currentCustomer = "Foo";
        Ticket expResult = new Ticket(1, "Foo");
        instance = new LotteryAdmin();
        //Test the sale count prior to commencing with sale
        System.out.println("TestingTotalSalesBeforeFirstSale");
        assertEquals(instance.getSoldTicketTotal(), 0);
        
        // Commence with sale afterwards
        Ticket result = instance.sale(currentCustomer);
        System.out.println("TestingTotalSalesAfterFirstSale");
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getTicketNumber(),result.getTicketNumber());
    }
    
    /**
     * Test that CurrentPot has updated after sale
     * @throws java.lang.Exception
     */
    @Test
    public void testPotAfterFirstSale() throws Exception{
        instance = new LotteryAdmin();
        instance.sale("Foo");
        System.out.println("CurrentPotAfterFirstSale");
        int expResult = 210;
        int result = instance.getCurrentPot();
        assertEquals(expResult, result);
    }
    
    /**
     * Test the draw method with a filled sales list
     * We should always get a filled Winner Queue as each random number will be found
     * @throws lotteryadmin.LotteryLimitHitException
     */
    @Test
    public void testDrawWith50Tickets() throws LotteryLimitHitException{
        instance = new LotteryAdmin();
        String[] testData = testDataProvider.getFiftyNames();
        for (String name : testData){
            instance.sale(name);
        }
        System.out.println("RunningDrawOn50TicketRound");
        Queue<Ticket> result = instance.runDraw();
        assertTrue(result.size() == 3);
        
        System.out.println("TestingFinalizingRound");
        Collection<String> result1 = instance.finalizeDraw(result).values();
        result1.stream().map((winner) -> winner.split(";")).forEachOrdered((details) -> {
            System.out.printf("Ticket: %s  | Prize: %s\n", details[0], details[1]);
        });
        
        System.out.println("TestingPotAfterPrizesAreFinalized");
        int finalPot = instance.getCurrentPot();
        int expFinalPot = 350;
        assertEquals(expFinalPot, finalPot);
    }
    
    
}
