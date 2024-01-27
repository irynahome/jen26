/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
public class SampleTest {

    private WebDriver driver;
    private String baseUrl;

    public SampleTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        driver = new ChromeDriver();

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.quit();
    }

    @Test
    public void testIndeed() throws Exception {

//        driver.get("https://www.indeed.com/");
//        driver.findElement(By.id("text-input-what")).click();
//        driver.findElement(By.id("text-input-what")).clear();
//        driver.findElement(By.id("text-input-what")).sendKeys("qa test");
//        driver.findElement(By.id("jobsearch")).submit();
//        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.get("https://www.indeed.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("text-input-what")).click();
        driver.findElement(By.id("text-input-what")).clear();
        driver.findElement(By.id("text-input-what")).sendKeys("qa test");
        driver.findElement(By.id("jobsearch")).submit();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.get(baseUrl + "chrome://newtab/");
        driver.get("https://www.google.com/search?q=indeed+jobs&rlz=1C1CHBF_enUS1091US1091&oq=indeed+j&gs_lcrp=EgZjaHJvbWUqDAgAECMYJxiABBiKBTIMCAAQIxgnGIAEGIoFMgYIARBFGDkyCggCEAAYkgMYgAQyEAgDEAAYgwEYkgMYsQMYgAQyCggEEAAYsQMYgAQyBwgFEAAYgAQyBwgGEAAYgAQyBwgHEAAYgAQyBwgIEAAYgAQyBwgJEAAYgASoAgCwAgA&sourceid=chrome&ie=UTF-8");
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/span/a/div/div/span")).click();
        driver.get("https://www.indeed.com/jobs?l=Schaumburg%2C+IL&from=mobRdr&utm_source=%2Fm%2F&utm_medium=redir&utm_campaign=dt");
        driver.findElement(By.id("text-input-what")).click();
        driver.findElement(By.id("text-input-what")).clear();
        driver.findElement(By.id("text-input-what")).sendKeys("java");
        driver.findElement(By.id("text-input-where")).clear();
        driver.findElement(By.id("text-input-where")).sendKeys("Chicago, IL");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.get("https://www.indeed.com/jobs?q=java&l=Chicago%2C%20IL");
        driver.get("https://www.indeed.com/jobs?q=java&l=Chicago%2C+IL&vjk=39c4bd9f9055fcc7");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1250)", "");
        
        Thread.sleep(5000);
    }

}
