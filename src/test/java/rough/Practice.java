package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".zgh-login")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#login_id")).sendKeys("manasa.voletir@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#nextbtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#password")).sendKeys("Scientist@1509");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#nextbtn")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(8) > div:nth-child(1) > a:nth-child(1) > span:nth-child(1)")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[id='Visible_Accounts'] span")).click();
		
		
		
		
		
	}

}
