/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.bankproject.iryna;

import com.mycompany.bankproject.FullTiimeEmployee;
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
public class FullTimeEmployeeTest {
    
   
    FullTiimeEmployee emplFT;
    
    public FullTimeEmployeeTest() {
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
         //emp1 = new FullTiimeEmployee(salary, id, name,title, email);
        emplFT = new FullTiimeEmployee(100000.0f, 1, "Iryna", "manager", "iryna@gmail.com");
         
         
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void FullTimeEmplTest(){
        assertEquals(100000.0f, emplFT.getSalary());       
       
        //assertEquals("FullTiimeEmployee{" + "salary=" + emplFT.getSalary() + " " + super.toString() + '}', emplFT.toString());
        
                
    }
    
    
    
    
}
