package lotteryadmin;


/**
 *
 * @author Amr
 */
class TestUtils {
    
    /**
     * Data Test Container Class
     */
    
    //Constructor
    TestUtils(){
        
    }
    
    //For testing purposes we will allow numbers on names, handling that will be
    // Application UI specific
    private final String[] fiftyNames = {
        "test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 
        "test9", "test10", "test11", "test12", "test13", "test14", "test15",
        "test16", "test17", "test18", "test19", "test20", "test21", "test22",
        "test23", "test24", "test25", "test26", "test27", "test28", "test29",
        "test30", "test31", "test32", "test33", "test34", "test35", "test36",
        "test37", "test38", "test39", "test40", "test41", "test42", "test43",
        "test44", "test45", "test46", "test47", "test48", "test49", "test50",
        
    };
    
    private final String[] twentyFiveNames = {
        "test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8", 
        "test9", "test10", "test11", "test12", "test13", "test14", "test15",
        "test16", "test17", "test18", "test19", "test20", "test21", "test22",
        "test23", "test24", "test25",
    };
    
    
    public String[] getFiftyNames(){
        return fiftyNames;
    }
    
    public String[] getTwentyFiveNames(){
        return twentyFiveNames;
    }
}