package week2_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		//Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Logeshwaran Moorthy");
		
		//verify title
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Facebook")) {
			System.out.println("Correct title");}
			else {
				System.out.println("Incorrect title");
			
		}
		//verify Current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//get text from web application:, use test lead portal to execute this piece of code
	
		String text = driver.findElement(By.id("firstname")).getText();
		System.out.println(text);
		if(text.contains("Logeshwaran Moorthy")) {
			System.out.println("Text is available");
		}
		else {
			System.out.println("Text not available");
		}
			
		
	}

}
