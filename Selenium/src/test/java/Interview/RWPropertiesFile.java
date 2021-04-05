package Interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class RWPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		String F ="C:\\Users\\arpit\\git\\Maaa-Selenium\\Selenium\\MoMaaProperties";
		Properties p =new Properties();
		/*FileInputStream FIS= new FileInputStream(F);
		p.load(FIS);
		System.out.println(p.getProperty("Name"));
		System.out.println(p.getProperty("username"));*/
		
		FileOutputStream OS= new FileOutputStream(F);
		
		System.out.println(p.setProperty("Name", "Mago"));
		p.store(OS, "Final Update Data");
		
		

	}

	

}
