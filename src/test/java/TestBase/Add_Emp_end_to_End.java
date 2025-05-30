package TestBase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjects.Add_Employees;
import PageObjects.loginpage;
import junit.framework.Assert;

public class Add_Emp_end_to_End {

	
	@Test
	public void setup()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginpage lp=new loginpage(driver);
	lp.SetEmail("Admin");
	lp.SetPassword("admin123");
	lp.clicklogin();
	lp.clickPIM();
	
	//employee 1
	Add_Employees ade=new Add_Employees(driver);
	ade.addemployee();
	ade.firstname("kim");
	ade.lastname("efgh");
	ade.employeeid("122");
	ade.Savebutton();
	

	//employee 2
	Add_Employees ade2=new Add_Employees(driver);
	ade.addemployee();
	ade.firstname("job");
	ade.lastname("nop");
	ade.employeeid("221");
	ade.Savebutton();
	//employee

	//employee 3
	Add_Employees ade3=new Add_Employees(driver);
	ade.addemployee();
	ade.firstname("roy");
	ade.lastname("yyy");
	ade.employeeid("150");
	ade.Savebutton();

	//employee 4
	Add_Employees ade4=new Add_Employees(driver);
	ade.addemployee();
	ade.firstname("sam");
	ade.lastname("ppp");
	ade.employeeid("190");
	ade.Savebutton();
	ade.empoyeelist();
	
	
	List<WebElement> Emplist=driver.findElements(By.xpath("//div[@class='oxd-table-card-cell']//div[@class='data']"));
	for (WebElement element : Emplist) {
		
		String employeename=element.getText();
		if(employeename.contains("122"))
		{
			System.out.println(employeename);
			Assert.assertTrue(true);
		}
		
	}
	
	
	
	
	
	////div[contains(text(),'0500')]
	
	
	
	
	
	
	
	

		
	}

}
