package week4_day2;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MovetoElements {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		//co.addArguments("--incognito");
		co.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		WebElement mo = driver.findElement(By.xpath("//span[text()='HOME AND KITCHEN']"));
		//driver.findElement(By.xpath("//Strong[text()='Allow Location']")).click();
		//System.out.println("done");
        Actions opt=new Actions(driver);
        opt.moveToElement(mo).perform();
        
	}

}
