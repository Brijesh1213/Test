package test.Test1;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	WebDriver driver;



   
    @BeforeMethod
    
    public void initialisation()
    {  
    	
    	
    		WebDriverManager.firefoxdriver().setup();
    		driver = new FirefoxDriver();
    	    driver.get("http://seleniumtraining.guber.me/");
    }
    @AfterMethod
    public void tearDown() {
    	driver.close();
    }

}
