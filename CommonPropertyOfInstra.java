 package InstragramProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonPropertyOfInstra implements CommonInterfaceofInstra{

	static WebDriver driver; 
	public void chrome() throws InterruptedException {
	System.setProperty(chromekey, chromepath);
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("Vandana");
	driver.findElement(By.name("password")).sendKeys("Nagre");
	//driver.findElement(By.xpath("//*[@id='loginForm']/div/div[3]")).submit();
	
	
	//xpath find using class name
	//driver.findElement(By.xpath("//*[@class='KPnG0']")).click();
	
	
	
	}
	public void login() throws InterruptedException {
		
		//xpath find using input (tagname)
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Vandana Andhale-Nagre");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9822694977");
		//driver.findElement(By.xpath("//*[@name='login']")).submit();
		
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).submit();
	}
	
	

}
