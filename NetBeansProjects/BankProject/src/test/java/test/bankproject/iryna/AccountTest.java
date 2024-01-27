/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.bankproject.iryna;

import com.mycompany.bankproject.Account;
import com.mycompany.bankproject.AccountType;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Iryna
 */
public class AccountTest {
    Account accnt;
    
    
    public AccountTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        accnt = new Account(1,1,10000, AccountType.CHECKING);
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testBallance(){
        assertEquals(10000.0, accnt.getBalance());
    }
    
    @Test
    public void testAcctNum(){
        assertEquals(1, accnt.getAcctNum());
    }
    
    @Test
    public void testCusId(){
        assertEquals(1, accnt.getCust_id());
    }
    
     @Test
    public void testAcctType(){
        assertEquals(AccountType.CHECKING, accnt.getAcctType());
    }
    
  
    
}
