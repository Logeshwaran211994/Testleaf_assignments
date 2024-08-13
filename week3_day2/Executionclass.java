package week3_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executionclass  extends SBI{


	public void PL() {
		System.out.println("13.45%");
		
	}

	public void KYC() {
		System.out.println("Pancard");
		
	}
	public static void main(String[] args) {
		Executionclass ec= new Executionclass();
 ec.PL();
 ec.rdroi();
 ec.KYC();
 ec.minbalance();
	
	ChromeDriver driver =new ChromeDriver();	
	driver.findElement(By.id(null)).sendKeys();
	}


}
