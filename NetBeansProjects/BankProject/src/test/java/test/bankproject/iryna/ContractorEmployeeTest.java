/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.bankproject.iryna;

import com.mycompany.bankproject.ContractorEmployee;
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
public class ContractorEmployeeTest {
    ContractorEmployee contrEmpl;
    
    public ContractorEmployeeTest() {
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
        //emp1 = new ContractorEmployee(hourlyrate, id, name, title, email);
        contrEmpl = new ContractorEmployee(55.0f, 2, "bob", "assistant", "bob.bank.com");
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void ContrEmplTest(){
        
        assertEquals(55.0f, contrEmpl.getHourlyRate()); 
        
    }
    
    
}
