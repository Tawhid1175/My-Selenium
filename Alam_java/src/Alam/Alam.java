package Alam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alam {

	public static void main(String[] args) {
		

		
		
		System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();
        
        
        
        
        
      driver.findElement(By.cssSelector("input[name='email']")).sendKeys("alam@gamil.com");
        

		

	}

}
