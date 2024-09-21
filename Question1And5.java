package Task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1And5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); // intializing the chromeDriver
		driver.manage().window().maximize();
		driver.navigate().to("http://google.com");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String url=driver.getCurrentUrl();
		System.out.println("The current url of the page:"+url);
		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("selenium browser driver");
		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys(Keys.ENTER);
		String ActualPage = driver.findElement(By.xpath("//span[contains(text(),'You can also find a list of previous releases')]")).getText();
		System.out.println(ActualPage);
		if(ActualPage.contains("You can also find a list of previous releases, source code, and additional information for Maven users."))
		{
			System.out.println("User is able to search with selenium browser driver");
		} else {
			System.out.println("User is unable to search with selenium browser driver");
		}
		driver.close();
	}

}
