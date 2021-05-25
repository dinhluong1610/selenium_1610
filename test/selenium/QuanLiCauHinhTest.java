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
import static selenium.BHXHTest.driver;
import static selenium.TheoDoiDanhsachTest.driver;

/**
 *
 * @author dinhl
 */
public class QuanLiCauHinhTest {
    static WebDriver driver;
    public QuanLiCauHinhTest() {
    }
    
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
        driver.get("http://localhost:8080/BHXH/ListConfig.jsp");
    }
    
    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testNutThemCauHinh() {
         driver.findElement(By.id("themcauhinh")).click();
        String expected_url="http://localhost:8080/BHXH/AddConfig.jsp";
        String actual_url= driver.getCurrentUrl();
        
        assertEquals(expected_url, actual_url);
    }
    @Test
    public void testNutThemCauHinhException(){
        driver.findElement(By.id("themcauhinh")).click();
        String expected_url="http://localhost:8080/BHXH/AddConfig.js";
        String actual_url= driver.getCurrentUrl();
        
        assertEquals(expected_url, actual_url);
        
    }
     @Test
    public void testNutSua() {
         driver.findElement(By.id("3")).click();
        String expected_url="http://localhost:8080/BHXH/UpdateConfig.jsp?id=3";
        String actual_url= driver.getCurrentUrl();
        
        assertEquals(expected_url, actual_url);
    }
     @Test
    public void testNutSuaException() {
         driver.findElement(By.id("3")).click();
        String expected_url="http://localhost:8080/BHXH/UpdateConfig.jsp?id=2";
        String actual_url= driver.getCurrentUrl();
        
        assertEquals(expected_url, actual_url);
    }
     @Test
    public void testNutSuaException1() {
         driver.findElement(By.id("2")).click();
        String expected_url="http://localhost:8080/BHXH/UpdateConfig.jsp?id=";
        String actual_url= driver.getCurrentUrl();
        
        assertEquals(expected_url, actual_url);
    }
    
}
