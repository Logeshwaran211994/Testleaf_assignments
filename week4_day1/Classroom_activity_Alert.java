package week4_day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom_activity_Alert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(("(//span[text()='Show'])[5]"))).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Logeshwaran");
		//Thread.sleep(5000);
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		String text1 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text1);
		driver.close();
		
}
}
