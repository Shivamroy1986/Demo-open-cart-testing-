package Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	WebDriver driver;
	public  Login(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
	WebElement My_account;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement lgn;
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement Email_box;
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement Password_Box;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement login_button;
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a")
	WebElement Forgotten_Password;
	@FindBy(xpath="//*[@id=\"account-login\"]/div[1]")
	WebElement Invalid_login;
	@FindBy(xpath="//*[@id=\"account-login\"]/div[1]")
	WebElement invalid_message;
	
	
	public void LoginPage(String eml, String pass ) throws InterruptedException  {
		Thread.sleep(1000);
		My_account.click();
		Thread.sleep(1000);
		lgn.click();
		Thread.sleep(1000);
		Email_box.sendKeys(eml);
		Thread.sleep(1000);
		Password_Box.sendKeys(pass);
		Thread.sleep(1000);
		login_button.click();
		
	}
	

}
