package week4_day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");

		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> PW = driver.getWindowHandles();
		System.out.println(PW);
		
		
		String title = driver.getTitle();
		System.out.println("Parent Window:"+title);
		
		List<String> window=new ArrayList<String>(PW);
		String CW = driver.switchTo().window(window.get(1)).getTitle();
		System.out.println("Child Window:"+CW);
		
		driver.findElement(By.xpath("//textarea[@id='message']"))
		.sendKeys("Windows currently in child window");
		
		driver.close();
		driver.switchTo().window(window.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		driver.quit();
	}
	

}
