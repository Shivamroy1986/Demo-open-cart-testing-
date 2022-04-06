package Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	WebDriver driver;
	public   Register(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
	WebElement my_account;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement register;
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement fname;
	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	WebElement lname;
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	WebElement telphone;
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"input-confirm\"]")
	WebElement confirmpass;
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
	WebElement yessub;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement policy;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement continuebtn;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
	WebElement logoutbtn;
	@SuppressWarnings("deprecation")
	
	public void newregister(String dfname,String dlname,String demail,String dphone,String dpass,String dconfirmpass ) throws InterruptedException  {
		
		my_account.click();
		Thread.sleep(1000);
		register.click();
		Thread.sleep(1000);
		fname.sendKeys(dfname);
		Thread.sleep(1000);
		lname.sendKeys(dlname);
		Thread.sleep(1000);
		email.sendKeys(demail);
		Thread.sleep(1000);
		telphone.sendKeys(dphone);
		Thread.sleep(1000);
		password.sendKeys(dpass);
		Thread.sleep(1000);
		confirmpass.sendKeys(dconfirmpass);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", yessub);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()", policy);
		Thread.sleep(1000);
		continuebtn.click();
		Thread.sleep(4000);
		my_account.click();
		Thread.sleep(1000);
		logoutbtn.click();
		
	}

}
