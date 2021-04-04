package Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetWindowSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        WebDriverWait wait= new WebDriverWait(driver, 10);
        driver.manage().deleteAllCookies();
        String wid= driver.getWindowHandle();
        System.out.println(wid);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.salesforce.com/in/");
        
       Dimension ddd= driver.findElement(By.xpath("//a[@class=\"btn btn-lg btn-nav salesforce-sans-regular    \"][1]")).getSize();
        
       System.out.println("Size of Tab element is " + ddd.height);
       System.out.println("Width of Tab Element is " + ddd.width);
        
      String text= driver.findElement(By.xpath("\"//a[@class=\\\"btn btn-lg btn-nav salesforce-sans-regular    \\\"][1]\"")).getCssValue("Font-size");
		System.out.println(text);
		
		
		
		
		
		
	}

}
