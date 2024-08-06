package week2_day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://platform.testleaf.com/#/");
Thread.sleep(10000);
driver.close();
//driver.quit();
	}

}
