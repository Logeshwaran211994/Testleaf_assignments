package week4_day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");

		driver.switchTo().frame("iframeResult");
		Actions opt = new Actions(driver);
		opt.doubleClick(driver.findElement(By.xpath("//p[contains(text(),'Double')]"))).perform();

		// driver.executeScript("arguments[0].Click();", js); use this code for java
		// click
	}

}
