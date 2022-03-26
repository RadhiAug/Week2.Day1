package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Name");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("localname");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		 driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Description");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		 
		 WebElement newElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select state = new Select(newElement);
		 
		 state.selectByVisibleText("New York");
		 
		 //WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 //Select dropDown = new Select(element);
		 //dropDown.selectByVisibleText("Employee");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).clear();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New Test Company");
		 driver.findElement(By.id("createLeadForm_firstName")).clear();
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Roshini");
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 String title1 = driver.getTitle();
		 System.out.println(title1);
		
		 
		
		driver.close();
}
}


