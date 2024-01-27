/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.iryna;

import com.mycompany.mycodecoverage.Student;
import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Iryna
 */
public class StudentTest {
    Student stu;
    public StudentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testGradePass() {
    stu.setEng(90);
    stu.setMath(90);
    stu.setSci(80);
    assertEquals("Pass", stu.getGrade());
    
    }
    
    @Test
    public void testGradeFail() {
    stu.setEng(50);
    stu.setMath(40);
    stu.setSci(20);
    assertEquals("Fail", stu.getGrade());
    
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        stu = new Student();
        
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
