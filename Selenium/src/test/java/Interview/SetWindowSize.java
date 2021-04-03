package Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\arpit\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.getWindowHandle();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        
        Dimension d= new Dimension(200,300);
        
        driver.manage().window().setSize(d);
        driver.close();
        
		
		
		
		
	}

}
