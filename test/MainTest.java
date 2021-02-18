/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author muhdakmaldanial
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void fullAddressTest() {
        System.out.println("\nmain : Full Address Test");
        String args = "No 11,  Jalan Medan Rhu, Chendering, Kuala Terengganu, Terengganu.";
        Main.main(args);
    }
    
    @Test
    public void incompleteAddressTest() {
        System.out.println("\nmain : Incomplete Address Test");
        String args = "Jalan Medan Rhu, 21080, Kuala Terengganu";
        Main.main(args);
    }
    
    @Test
    public void caseInsensitivityTest() {
        System.out.println("\nmain : Case Insensitivity Test");
        String args = "no 11, jalan medan rhu, chendering, 21080, kuala terengganu, terengganu";
        Main.main(args);
    }
    
    @Test
    public void differentOrder() {
        System.out.println("\nmain : Different Order Test");
        String args = "Kuala Terengganu, 21080, Jalan Medan Rhu, No 11, Chendering";
        Main.main(args);
    }
    
    @Test
    public void noCommaSeperatorTest() {
        System.out.println("\nmain : No Comma Seperator Test");
        String args = "No 11 Jalan Medan Rhu Chendering 21080 Kuala Terengganu Terengganu";
        Main.main(args);
    }
}
