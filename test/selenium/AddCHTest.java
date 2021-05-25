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
import static selenium.BHXHTest.driver;

/**
 *
 * @author dinhl
 */
public class AddCHTest {
    
    public AddCHTest() {
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
        driver.get("http://localhost:8080/BHXH/AddConfig.jsp");
    }
    
    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testNutThem() {
        WebElement txtCauHinh=driver.findElement(By.id("tencauhinh"));
        txtCauHinh.sendKeys("BHXH");
        WebElement txtHeSo=driver.findElement(By.id("heso"));
        txtHeSo.sendKeys("1.3");
        driver.findElement(By.id("them")).click();
        String expected_url="http://localhost:8080/BHXH/ListConfig.jsp";
        String actual_url= driver.getCurrentUrl();
        assertEquals(expected_url, actual_url);
    }
     @Test
    public void testNutThemException() {
        WebElement txtCauHinh=driver.findElement(By.id("tencauhinh"));
        txtCauHinh.sendKeys("BHXH");
        WebElement txtHeSo=driver.findElement(By.id("heso"));
        txtHeSo.sendKeys("1.3");
        driver.findElement(By.id("them")).click();
        String expected_url="http://localhost:8080/BHXH/ListConfig.js";
        String actual_url= driver.getCurrentUrl();
        assertEquals(expected_url, actual_url);
    }
    @Test
    public void testTaoMoi() {
        WebElement txtCauHinh=driver.findElement(By.id("tencauhinh"));
        txtCauHinh.sendKeys("BHXH");
        WebElement txtHeSo=driver.findElement(By.id("heso"));
        txtHeSo.sendKeys("1.3");
        driver.findElement(By.id("taomoi")).click();
        txtCauHinh=driver.findElement(By.id("tencauhinh"));
        txtCauHinh.getText();
        txtHeSo=driver.findElement(By.id("heso"));
        txtHeSo.getText();
        String expString="";
        assertEquals(expString, txtCauHinh.getText());
    }
    
    
}
