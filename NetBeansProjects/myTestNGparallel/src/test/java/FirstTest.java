/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
public class FirstTest {
    
 
     WebDriver driver;
    public FirstTest() {
        
    }
    
    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    }
    
    //Run a Test method with priority order, and invoke multiple time
    @Test(priority = 1 ,invocationCount = 1, threadPoolSize = 2)
    public void testITExpert() throws InterruptedException {
        System.out.println("The thread ID for Chrome is " + Thread.currentThread().getId());
        driver = new ChromeDriver();
        driver.get("https://itexps.net");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getTitle().contains("IT Expert"));
    }
    
    @Test(priority = 2)
    public void testInfoTekguide() throws InterruptedException {
        System.out.println("The thread ID for Firefox is " + Thread.currentThread().getId());
        driver = new ChromeDriver();
        driver.get("https://www.infotekguide.net");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getTitle().contains( "InfoTek"));
    }
    
     @AfterMethod
    public void close() {
        driver.quit();
    }
    
    
    
    
}
