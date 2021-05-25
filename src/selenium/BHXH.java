/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author dinhl
 */
public class BHXH {
    public static void main(String[] args) {
        WebDriver driver;
         System.setProperty("webdriver.chrome.driver", "G:\\download1\\download\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/BHXH/");
          driver.findElement(By.id("qlcauhinh")).click();
        String a=driver.getCurrentUrl();
        System.out.println(a);
    }
}
