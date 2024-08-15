package week4_day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(2);
		
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().defaultContent();//go to home main page
		
		driver.switchTo().parentFrame();//previous from it will navigate sequentially
		

	}

}
