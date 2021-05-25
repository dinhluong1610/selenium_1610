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
import org.openqa.selenium.chrome.ChromeDriver;
import static selenium.SeleniumTest.driver;

/**
 *
 * @author dinhl
 */
public class BHXHTest {
    public BHXHTest() {
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
        driver.get("http://localhost:8080/BHXH/");
    }
    
    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testQLCH() {
        driver.findElement(By.id("qlcauhinh")).click();
        String expected_url="http://localhost:8080/BHXH/ListConfig.jsp";
        String actual_url= driver.getCurrentUrl();
        assertEquals(expected_url, actual_url);
    }
    @Test
    public void TestQLCHException(){
        driver.findElement(By.id("qlcauhinh")).click();
        String expected_url="http://localhost:8080/BHXH/ListConfig.js";
        String actual_url= driver.getCurrentUrl();
        assertEquals(expected_url, actual_url);
    }
     @Test
    public void TestQLDS(){
        driver.findElement(By.id("qldanhsach")).click();
        String expected_url="http://localhost:8080/BHXH/danhsach.jsp";
        String actual_url= driver.getCurrentUrl();
        assertEquals(expected_url, actual_url);
    }
    @Test
    public void TestQLDSException(){
        driver.findElement(By.id("qldanhsach")).click();
        String expected_url="http://localhost:8080/BHXH/danhsach.js";
        String actual_url= driver.getCurrentUrl();
        assertEquals(expected_url, actual_url);
    }
        @Test
    public void TestQLBC(){
        driver.findElement(By.id("qlbaocao")).click();
        String expected_url="http://localhost:8080/BHXH/Xuatbaocao.jsp";
        String actual_url= driver.getCurrentUrl();
        assertEquals(expected_url, actual_url);
    }
        @Test
    public void TestQLBCException(){
        driver.findElement(By.id("qlbaocao")).click();
        String expected_url="http://localhost:8080/BHXH/Xuatbaocao.jsps";
        String actual_url= driver.getCurrentUrl();
        assertEquals(expected_url, actual_url);
    }
}
