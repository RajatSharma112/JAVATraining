package firstActivity;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Activity1 {
    WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        
        driver.get("https://www.training-support.net");
    }

    @Test
    public void exampleTestCase() throws Exception {

        String title = driver.getTitle();
            
        System.out.println("Page title is: " + title);

        Assert.assertEquals("Training Support", title);
        Thread.sleep(10000);
                   
        driver.findElement(By.id("about-link")).click();
                    
        System.out.println("New page title is: " + driver.getTitle());
        
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}