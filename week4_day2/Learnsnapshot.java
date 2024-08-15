package week4_day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learnsnapshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.switchTo().frame("iframeResult");
		Actions opt=new Actions(driver);
		opt.doubleClick(driver.findElement(By.xpath("//p[contains(text(),'Double')]"))).perform();
		
		
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File Trg= new File("./Snapshots/img1.png");
		FileUtils.copyFile(scr,Trg);
		

	}

}
