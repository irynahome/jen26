/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.irexprt;

import com.mycompany.mybank.Account;
import com.mycompany.mybank.Customer;
import java.util.ArrayList;
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
public class CustomerTest {
    Customer cust;
    
    public CustomerTest() {
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
        cust = new Customer("Iryna", "Reilly", "ir123@gmail.com");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        
    }
    
    @Test
    public void testAccount(){
        ArrayList<Account> acctLst = new ArrayList<Account>();
        Account ac1 = new Account(1, "Checking", 200);
        Account ac2 = new Account(2, "Saving", 2000);
        acctLst.add(ac1);
        acctLst.add(ac2);
        
        cust.setAccntLst(acctLst);
        assertEquals(2, cust.getAccntLst().size());
        assertEquals("Checking", cust.getAccntLst().get(0).getType());
        assertEquals(200, cust.getAccntLst().get(0).getBalance());
        
    }
    
}
