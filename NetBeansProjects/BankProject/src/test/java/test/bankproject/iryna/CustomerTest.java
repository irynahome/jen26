/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.bankproject.iryna;

import com.mycompany.bankproject.Account;
import com.mycompany.bankproject.AccountType;
import com.mycompany.bankproject.Customer;
import com.mycompany.bankproject.CustomerType;
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
        cust = new Customer(1,"iryna", "ir@gmail.com", CustomerType.INDIVIDUAL);
        //int id, String name, String email, CustomerType custType, ArrayList<Account> acct
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testAccount(){
        ArrayList <Account> accntLst = new ArrayList <Account>();
        
        //new Account(1,1,10000, AccountType.CHECKING);
        Account ac1 = new  Account(1,1,10000, AccountType.CHECKING);
        Account ac2 = new  Account(2,1,50000, AccountType.SAVING);
        Account ac3 = new  Account(3,1,30000, AccountType.FIXED_DEPOSIT);
        
        accntLst.add(ac1);
        accntLst.add(ac2);
        accntLst.add(ac3);
        
        cust.setAcct(accntLst);        
        assertEquals(3, cust.getAcct().size());
        assertEquals(AccountType.CHECKING, cust.getAcct().get(0).getAcctType());
        assertEquals(AccountType.SAVING, cust.getAcct().get(1).getAcctType());
        assertEquals(AccountType.FIXED_DEPOSIT, cust.getAcct().get(2).getAcctType());
        
        assertEquals(10000.0, cust.getAcct().get(0).getBalance());
        assertEquals(50000.0, cust.getAcct().get(1).getBalance());
        assertEquals(30000.0, cust.getAcct().get(2).getBalance());
        
        assertEquals(1, cust.getAcct().get(0).getAcctNum());
        assertEquals(2, cust.getAcct().get(1).getAcctNum());
        assertEquals(3, cust.getAcct().get(2).getAcctNum());
        
        assertEquals(1, cust.getAcct().get(0).getCust_id());
        assertEquals(1, cust.getAcct().get(1).getCust_id());
        assertEquals(1, cust.getAcct().get(2).getCust_id());
        
                
        
    }
    
    @Test
    public void testCustomer(){
        //"iryna", "ir@gmail.com", CustomerType.INDIVIDUAL
        assertEquals(1, cust.getId());
        assertEquals("iryna",cust.getName());
        assertEquals("ir@gmail.com",cust.getEmail()); 
        assertEquals(CustomerType.INDIVIDUAL,cust.getCustType()); 
        
        
        
    }
    
}
