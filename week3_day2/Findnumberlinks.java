package week3_day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findnumberlinks {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/?locale=in");
		List<WebElement> total = driver.findElements(By.tagName("a"));
		int size = total.size();
		System.out.println(size);

		String text = total.get(2).getText();
		System.out.println(text);
		
		for (int i = 0; i < total.size(); i++) {
			String text2 = total.get(i).getText();
			System.out.println(text2);
			
		}
	}

}
