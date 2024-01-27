/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.bankproject.iryna;

import com.mycompany.bankproject.Employee;
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
public class EmployeeTest {
    
    Employee empl;
    FullTiimeEmployee empl2;
    
    
    public EmployeeTest() {
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
        //Employee(int id, String name, String title, String email)        
        empl = new Employee(1, "Iryna", "manager", "iryna@gmail.com");
        empl2 = new FullTiimeEmployee(100000.0f, 1, "Iryna", "manager", "iryna@gmail.com");
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testEmployee(){
        
        assertEquals(1, empl.getId());
        assertEquals("Iryna", empl.getName());
        assertEquals("manager", empl.getTitle());
        assertEquals("iryna@gmail.com", empl.getEmail());  
        
        assertEquals(100000.0f, empl2.getSalary());
        assertEquals(1, empl2.getId());
        assertEquals("Iryna", empl2.getName());
        assertEquals("manager", empl2.getTitle());
        assertEquals("iryna@gmail.com", empl2.getEmail());   
        
    }
    
    
}
