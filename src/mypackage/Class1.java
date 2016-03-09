package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	System.setProperty("webdriver.chrome.driver","C:/Users/deepthi.moolam/Downloads/chromedriver_win32/");
	WebDriver driver= new ChromeDriver();
	
	String baseurl = "http://www.velankani.com";
	String expectedTitle = "Velankani communication Technologies";
	String actualTitle = " ";
	driver.get(baseurl);
	System.out.println(actualTitle= driver.getTitle());
	String baseurl111= "http://www.velankani.com";     //renamed//
	String expectedTitle@1 = "Velankani communication Technologies"; //renamed//
	String actualTitle@1 = " "; //renamed//
	driver.get(baseurl);
	System.out.println(actualTitle= driver.getTitle());
	if(actualTitle.contentEquals(expectedTitle))
	{
	System.out.println("TestPassed");
	}
	else
	{
		System.out.println("TestFail");
	}
	driver.close();
	System.exit(0);
	
	
	
	// test///
	//String names are not updated in localrepo//
	
	}
	
	
	

}
