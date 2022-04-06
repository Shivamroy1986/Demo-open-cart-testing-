package Classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Return_order {
	WebDriver driver;
	public  Return_order(WebDriver driver) {
		this.driver=driver;	
	}
	@FindBy(xpath="//*[@id=\"logo\"]/h1/a")
	WebElement home_page;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
	WebElement my_account;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement orderhistory;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[7]/a")
	WebElement view;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/a[2]")
	WebElement returnbtn;
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[4]/div/div[5]/label/input")
	WebElement wrongitem;
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[2]/div[5]/div/label[1]/input")
	WebElement yesradio;
	@FindBy(xpath="//*[@id=\"input-comment\"]")
	WebElement addcomment;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div[2]/input")
	WebElement submitbtn;
	
	//public void addwishlist(String s1 , String s2 , String s3,String s4) throws InterruptedException {
	@SuppressWarnings("deprecation")
	public void orderreturn(String comment) throws InterruptedException {
		home_page.click();
		Thread.sleep(1000);
		my_account.click();
		Thread.sleep(1000);
		orderhistory.click();
		Thread.sleep(1000);
		view.click();
		Thread.sleep(1000);
		returnbtn.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", wrongitem);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()", yesradio);
		Thread.sleep(2000);
		addcomment.sendKeys(comment);
		Thread.sleep(1000);
		submitbtn.click();
		
		
	}

}
