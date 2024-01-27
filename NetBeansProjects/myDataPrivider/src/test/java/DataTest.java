/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author Iryna
 */
public class DataTest {

    @DataProvider(name = "data-provider1")

    public Object[][] dpMethod1() {
        return new Object[][]{{2, 3, 5}, {5, 7, 12}, {2, -2, 0}};

    }

    //using data provider 1 , and it's data, this method will be exeucted two times
    @Test(dataProvider = "data-provider1")
    public void add(int a, int b, int result) {
        int sum = a + b;
        Assert.assertEquals(result, sum);
    }

    //Data Provider method 2
    @DataProvider(name = "data-provider2")
    public Object[][] dpMethod2() {
        return new Object[][]{{2, 4}, {3, 9}};
    }

    //using data provider 2 , and it's data, this method will be exeucted two times
    @Test(dataProvider = "data-provider2")
    public void squre(int a, int result) {
        int answer = a * a;
        Assert.assertEquals(result, answer);
    }
    
    

}
