package Selenium_Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 { 
	static  FileInputStream fl;
	public static void main(String[] args) throws IOException {
		
	Properties  pro = new Properties();
	 
 try {
	 fl = new FileInputStream("C:\\Users\\mohit.jaiswal\\Desktop\\Selenium\\Selenium_Basic\\src\\main\\java\\orgranhrm.properties");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 pro.load(fl);
 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mohit.jaiswal\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
	String URL=pro.getProperty("url");
	//System.out.println(URL);
	WebDriver driver= new ChromeDriver();
	driver.get(pro.getProperty("url"));
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	//driver.findElement(By.linkText("Contact Sales")).click();
	//driver.findElement(By.className("btn-orange contact-ohrm")).click();
	driver.findElement(By.cssSelector(".contact-ohrm")).click();
	
	driver.findElement(By.name("firstname")).sendKeys(pro.getProperty("fname"));
	//driver.findElement(By.className("hs-input")).sendKeys("mohit");
    driver.findElement(By.name("lastname")).sendKeys("jaiswal");
    //driver.findElement(By.id("company-40929fcd-ed29-4e47-af56-dc8899a6898a_#hbspt-form-1566563814700-6366303066")).sendKeys("Atmecs");
    
    //driver.findElement(By.cssSelector("#hsForm_40929fcd-ed29-4e47-af56-dc8899a6898a_\\#hbspt-form-1566565713472-2063736679 > div.hs_company.hs-company.hs-fieldtype-text.field.hs-form-field")).sendKeys("Atmecs");
    driver.findElement(By.xpath("//input[@name=\"company\"]")).sendKeys("Atmecs");
    driver.findElement(By.xpath("//select[@name=\"numemployees\"]//option[@value=\"11 - 15\"]")).click();
    driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("0987654321");
 /* List<WebElement> list = driver.findElements(By.xpath("//select[@name=\"country\"]//option "));
    System.out.println(list.size());
    for(int i=0;i<list.size();i++)
    {
    	
   if(list.get(i).equals("India"))
	   list.get(i).click();
   System.out.println(list.get(i));
   break;
    }
*/ 
   // driver.findElement(By.xpath("//select[@name=\"country\"]//option[@value=\"India"\])).click();
    driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("mohit@gmail.com");
    driver.findElement(By.xpath("//input[@data-reactid=\".hbspt-forms-0.1:$5.$jobtitle.0\"]")).sendKeys("Software Engineer");
    driver.findElement(By.xpath("//textarea[@data-reactid=\".hbspt-forms-0.1:$8.$message.0\"]")).sendKeys("Be happy");
    
   // driver.findElement(By.className("hs-input invalid error")).sendKeys("0-10");
    driver.findElement(By.className("hs-input")).sendKeys("123456789");
   // driver.findElement(By.name("jobtitle")).sendKeys("SDET");
    //driver.findElement(By.id("email-40929fcd-ed29-4e47-af56-dc8899a6898a_#hbspt-form-1566563814700-6366303066")).sendKeys("mohitjaiswal123@gmail.com");
  
	//driver.findElement(By.id("lastname-40929fcd-ed29-4e47-af56-dc8899a6898a_#hbspt-form-1566552197651-7019031303")).sendKeys("jaiswal");
	//System.out.println(driver.getTitle());
	}
	
	
}
