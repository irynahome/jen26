/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.irexprt;

import com.mycompany.mybank.Account;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Iryna
 */
public class AccountTest {
    
    Account account;  //declaration
    
    
    public AccountTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        account = new Account(1,"Checking",100);
        
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testBallance(){
       assertEquals(100, account.getBalance());
    }
    
    @Test
    public void testType(){
       assertEquals("Checking", account.getType());
    }
    
    
}
