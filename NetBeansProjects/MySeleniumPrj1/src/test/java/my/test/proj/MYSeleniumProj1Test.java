/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package my.test.proj;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class MYSeleniumProj1Test {

    WebDriver driver;

    public MYSeleniumProj1Test() {
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
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testFacebook() throws Exception {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("abc@abc.com");
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("abc123");
        driver.findElement(By.name("login")).click();
        //driver.findElement(By.id("header_block")).click();
        try {
            System.out.println("I am in");  
            //assertEquals("Log Into Facebook", driver.findElement(By.xpath("(//*[@id=\"header_block\"]/span/div")).getText());
        } catch (Error e) {
            fail("Test is failed!!!" + e.toString());
        } finally {
            driver.close();
        }
    }

}
