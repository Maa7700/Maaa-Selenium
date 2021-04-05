package Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizableWidget {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.getWindowHandle();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/resizable/");
        
        WebElement frames= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frames);
        
        
        WebElement ele= driver.findElement(By.xpath("//div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]"));
       Actions action = new Actions(driver);
       action.dragAndDropBy(ele, 200, 300);
   
	}

}
