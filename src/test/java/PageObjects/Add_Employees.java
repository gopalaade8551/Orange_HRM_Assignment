package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Employees extends BasePage {
	WebDriver driver;
	
	public Add_Employees(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[normalize-space()='Add Employee']") WebElement addemp;
	@FindBy(xpath="//input[@name='firstName']") WebElement Firstname;
	@FindBy(xpath="//input[@name='lastName']") WebElement lastName;
	@FindBy(xpath="//input[@name='middleName']") WebElement middleName;
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']") WebElement empid;
	//button[@type='submit']
	@FindBy(xpath="//button[@type='submit']") WebElement save;
	@FindBy(xpath="//a[normalize-space()='Employee List']") WebElement Emplist;
	
	
	//action methods
	
	public void addemployee()
	{
		addemp.click();
	}
	public void firstname(String firstname)
	{
		Firstname.clear();
		Firstname.sendKeys(firstname);
	}
	
	public void lastname(String lastname)
	{
		lastName.clear();
		lastName.sendKeys(lastname);
	}
	public void employeeid(String emplid)
	{
	
		empid.clear();
		empid.sendKeys(emplid);
	}
	
	public void Savebutton()
	{
	
	save.click();
	}
	
	public void empoyeelist()
	{
		Emplist.click();
	}
	
	
	
	
	

	
	
	
}
