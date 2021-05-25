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
public class XuatBaoCaoTest {
    
    public XuatBaoCaoTest() {
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
        driver.get("http://localhost:8080/BHXH/Xuatbaocao.jsp");
    }
    
    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void xuatBaoCao() {
        driver.findElement(By.id("submit")).click();
        String expected_url="http://localhost:8080/BHXH/doXuatbaocao.jsp";
        String actual_url= driver.getCurrentUrl();
        
        assertEquals(expected_url, actual_url);
    }
        @Test
    public void xuatBaoCaoException() {
        driver.findElement(By.id("submit")).click();
        String expected_url="http://localhost:8080/BHXH/doXuatbaocao.js";
        String actual_url= driver.getCurrentUrl();
        assertEquals(expected_url, actual_url);
    }
    
}
