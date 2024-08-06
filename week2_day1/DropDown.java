package week2_day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement dd = driver.findElement(By.className("ui-selectonemenu"));
		
		Select opt=new Select(dd);
		opt.selectByVisibleText("Cypress");
		//opt.selectByIndex(4);
	
		
	}

}
