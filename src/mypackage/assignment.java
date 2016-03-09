package mypackage;




import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class assignment {
	
	
	public static void main(String[] args) throws Exception{

	WebDriver driv = new FirefoxDriver();
	driv.manage().window().maximize();
	driv.get("http://www.google.com");
	driv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_CONTROL);
	
	r.keyRelease(KeyEvent.VK_T);
	driv.get("http://mail.blr.velankani.com");

	driv.findElement(By.id("horde_user")).sendKeys("emailid/phone");	
	
	driv.findElement(By.name("horde_pass")).sendKeys("password");
	driv.findElement(By.xpath(".//*[@id='login-button']"));
	  
	  
	  
	  }
	  
	  

	
		
	}	
		
		
		
		
		
		
		
		
	


		
	

		
		
		
		
