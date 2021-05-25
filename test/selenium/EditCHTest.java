/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static selenium.AddCHTest.driver;
import static selenium.BHXHTest.driver;

/**
 *
 * @author dinhl
 */
public class EditCHTest {
    
    public EditCHTest() {
    }
    static WebDriver driver;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "G:\\download1\\download\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/BHXH/UpdateConfig.jsp?id=1");
    }
    
    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testUpdate() {
        WebElement txtCauHinh=driver.findElement(By.id("name"));
        txtCauHinh.clear();
        WebElement txtHeSo=driver.findElement(By.id("hso"));
        txtHeSo.clear();
        txtCauHinh.sendKeys("BHXH");
        txtHeSo.sendKeys("1.2");
        driver.findElement(By.id("update")).click();
        String expected_url="http://localhost:8080/BHXH/ListConfig.jsp";
        String actual_url= driver.getCurrentUrl();
        assertEquals(expected_url, actual_url);
    }
    
}
