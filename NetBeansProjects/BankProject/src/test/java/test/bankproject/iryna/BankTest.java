/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.bankproject.iryna;

import com.mycompany.bankproject.Bank;
import com.mycompany.bankproject.Customer;
import com.mycompany.bankproject.CustomerType;
import com.mycompany.bankproject.Employee;
import com.mycompany.bankproject.FullTiimeEmployee;
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
public class BankTest {
    
    Bank bank;
    ArrayList<Employee> emplLst;
    ArrayList<Customer> custLst;
    
    
    public BankTest() {
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
        
       custLst = new ArrayList<Customer>();
       emplLst = new ArrayList<Employee>();
       
       Employee empl1 = new Employee(1, "Iryna", "manager", "iryna@bank.com");
       Employee empl2 = new Employee(2, "Don", "CFO", "don@bank.com");
       
       
       emplLst.add(empl1);
       emplLst.add(empl2);
       
       Customer cust1 = new Customer(1,"bob", "bob@gmail.com", CustomerType.INDIVIDUAL);
       Customer cust2 = new Customer(2,"mike", "mike@gmail.com", CustomerType.BUSINESS);
       custLst.add(cust1);
       custLst.add(cust2);       
       
       bank = new Bank(1, "Iryna World Bank", "888-555-7777", emplLst, custLst);
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testBank(){
        assertEquals(1, bank.getId());
        assertEquals("Iryna World Bank", bank.getName());
        assertEquals("888-555-7777", bank.getPhone());
        assertEquals(emplLst,bank.getEmployees());
        assertEquals(custLst,bank.getCustomers());
        
        assertEquals(emplLst, emplLst);
        assertEquals(custLst, custLst);
        
        //String mystr =  "Bank{" + "id="1, name=Iryna World Bank, phone=888-555-7777, employees=" + emplLst + ", customers=" + custLst + "};
        String mystr =  "Bank{" + "id=" + 1 + ", name=" + "Iryna World Bank" + ", phone=" + "888-555-7777" + ", employees=" + emplLst + ", customers=" + custLst + '}';
        assertEquals(mystr, bank.toString());
        
        
        
    }
    
}
