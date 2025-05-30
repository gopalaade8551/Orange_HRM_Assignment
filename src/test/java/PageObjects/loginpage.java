package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;






public class loginpage extends BasePage {
		
		
		WebDriver driver;
		public loginpage(WebDriver driver)
		{
			
			super(driver);
		}
		
		
		
		
		//locators
//	    @FindBy(xpath="//a[@title='My Account']") WebElement myaccountt;
//	    
//	    @FindBy(xpath="//a[normalize-space()='Register']") WebElement register;
//	    
//	    @FindBy(xpath="//a[normalize-space()='Login']") WebElement linklgin;
		
		
		
		
		//Locators
		@FindBy(xpath="//input[@placeholder='Username']") WebElement email;
		@FindBy(xpath="//input[@placeholder='Password']") WebElement passwd;
		@FindBy(xpath="//button[normalize-space()='Login']") WebElement login_btn;
		@FindBy(xpath="//p[@class='oxd-userdropdown-name']") WebElement profile_dpn;
		@FindBy(xpath="//a[normalize-space()='Logout']") WebElement logout_btn;
		@FindBy(xpath="//span[normalize-space()='PIM']") WebElement PIM;
		
	    
	    //action methods
	    
//	   public void  clickmyaccount()
//	    {
//		   myaccountt.click();
//	    }
//	   public void clickregister()
//	   {
//		   register.click();
//	   }
//	   public void clicklogin()
//	   {
//		   linklgin.click();
//	   }
		
		
		
		
		public void SetEmail(String emailid)
		{
			email.clear();
			email.sendKeys(emailid);
		}
		public void SetPassword(String password)
		{
			passwd.clear();
			passwd.sendKeys(password);
		}
		public void clicklogin()
		{
			login_btn.click();
		}
		public void clickLogout()
		{
			profile_dpn.click();
			logout_btn.click();
		}
		
//		public void clickPIM()
//		{
//			PIM.click();
//		}
		public void clickPIM() {
			// TODO Auto-generated method stub
			PIM.click();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

}
