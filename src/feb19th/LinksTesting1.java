package feb19th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
				
		System.out.println(driver.findElement(By.className("login_title")).isDisplayed());
		
		System.out.println(driver.findElement(By.linkText("Go back to Login page")).isDisplayed());
		
		driver.quit();
		
		

	}

}
