package CHECKINGJENKINS;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinTest {
	@Test
	public void jenkinTest() throws Throwable {
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  		  
		
	 FileInputStream fis=new FileInputStream("./data/common.properties"); 
	Properties  p=new Properties();
		 p.load(fis);
		 System.out.println("LOGIN TO Application");
		 String Url=p.getProperty("url");
		 //String username=p.getProperty("un");
		 //String password=p.getProperty("pwd");
		 
		 driver.get(Url);
		//String URL = System.getProperty("url");
		//System.out.println(URL);
		//driver.get(URL);
		//System.out.println("welcome to jenkins");
		System.out.println("Good Evening");
		System.out.println("Welcome");
		
		
	}
	
	

}
