package testngpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoLoginDemo {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("C:\\Users\\Plutus-Dev\\Desktop\\Kashyapqa\\Selenium\\DataDrivenFramework.txt");
		Properties p = new Properties();
		p.load(fis);
		String urldata = p.getProperty("url");
		String undata = p.getProperty("username");
		String pdata = p.getProperty("password");
		System.out.println(urldata);
		System.out.println(undata);
		System.out.println(pdata);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urldata);
		Thread.sleep(5000);

		driver.findElement(By.id("username")).sendKeys(undata);
		driver.findElement(By.id("password")).sendKeys(pdata);
		
		driver.findElement(By.id("login-button")).click();
		
		
//		driver.findElement(By.linkText("Log out")).click();
//
//
//		Thread.sleep(2000);
//		driver.quit();
	}

}
