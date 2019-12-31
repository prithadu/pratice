import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\PrithaDutta\\Desktop\\JarDownload\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.manage().window().maximize();

		 driver.get("https://newtours.demoaut.com/");
		 
	}
}