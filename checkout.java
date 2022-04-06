package Classes;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class checkout {
	WebDriver driver;
	public  checkout(WebDriver driver) {
		this.driver=driver;	
	}
	@FindBy(xpath="//*[@id=\"logo\"]/h1/a")
	WebElement home;
	@FindBy(xpath="//*[@id=\"cart\"]/button")
	WebElement cartbtn;
	@FindBy(xpath="//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")
	WebElement viewcart;
	@FindBy(xpath="//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")
	WebElement taxes;
	@FindBy(xpath="//*[@id=\"button-quote\"]")
	WebElement quote;
	@FindBy(xpath="//*[@id=\"modal-shipping\"]/div/div/div[2]/div/label/input")
	WebElement flate;
	@FindBy(xpath="//*[@id=\"button-shipping\"]")
	WebElement shiping;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/a")
	WebElement checkoutbtn;
	@FindBy(xpath="//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label/input")
	WebElement addradio1;
	@FindBy(xpath="//*[@id=\"input-payment-firstname\"]")
	WebElement fname1;
	@FindBy(xpath="//*[@id=\"input-payment-lastname\"]")
	WebElement lname1;
	@FindBy(xpath="//*[@id=\"input-payment-company\"]")
	WebElement com1;
	@FindBy(xpath="//*[@id=\"input-payment-address-1\"]")
	WebElement add1;
	@FindBy(xpath="//*[@id=\"input-payment-address-2\"]")
	WebElement add2;
	@FindBy(xpath="//*[@id=\"input-payment-city\"]")
	WebElement city1;
	@FindBy(xpath="//*[@id=\"input-payment-postcode\"]")
	WebElement post1;
	@FindBy(xpath="//*[@id=\"input-payment-country\"]")
	WebElement country1;
	@FindBy(xpath="//*[@id=\"input-payment-zone\"]")
	WebElement state1;
	@FindBy(xpath="//*[@id=\"button-payment-address\"]")
	WebElement continue1;
	@FindBy(xpath="//*[@id=\"collapse-shipping-address\"]/div/form/div[3]/label/input")
	WebElement addradio2;
	@FindBy(xpath="//*[@id=\"input-shipping-firstname\"]")
	WebElement fname2;
	@FindBy(xpath="//*[@id=\"input-shipping-lastname\"]")
	WebElement lname2;
	@FindBy(xpath="//*[@id=\"input-shipping-company\"]")
	WebElement com2;
	@FindBy(xpath="//*[@id=\"input-shipping-address-1\"]")
	WebElement add3;
	@FindBy(xpath="//*[@id=\"input-shipping-address-2\"]")
	WebElement add4;
	@FindBy(xpath="//*[@id=\"input-shipping-city\"]")
	WebElement city2;
	@FindBy(xpath="//*[@id=\"input-shipping-postcode\"]")
	WebElement post2;
	@FindBy(xpath="//*[@id=\"input-shipping-country\"]")
	WebElement country2;
	@FindBy(xpath="//*[@id=\"input-shipping-zone\"]")
	WebElement state2;
	@FindBy(xpath="//*[@id=\"button-shipping-address\"]")
	WebElement continue2;
	@FindBy(xpath="//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea")
	WebElement addcomment1;
	@FindBy(xpath="//*[@id=\"button-shipping-method\"]")
	WebElement continue3;
	@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/p[3]/textarea")
	WebElement addcomment2;
	@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")
	WebElement term;
	@FindBy(xpath="//*[@id=\"button-payment-method\"]")
	WebElement continue4;
	@FindBy(xpath="//*[@id=\"button-confirm\"]")
	WebElement confirm;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
	WebElement my_account;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement orderhistory;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[7]/a")
	WebElement view;
	
	
	@SuppressWarnings("deprecation")
	public void check(String dfname1 , String dlname1,String dcom1,String dadd1,String dadd2, String dcity1,String dpost1, String dcountry1, String dstate1, String dfname2,String dlname2 ,String dcom2,String dadd3,String dadd4,String dcity2,String dpost2,String dcountry2,String dstate2,String dcomment1,String dcomment2) throws InterruptedException{
		Thread.sleep(1000);
		home.click();
		Thread.sleep(1000);
		cartbtn.click();
		Thread.sleep(1000);
		viewcart.click();
		Thread.sleep(1000);
		taxes.click();
		Thread.sleep(1000);
		quote.click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", flate);
		flate.click();
		Thread.sleep(1000);
		shiping.click();
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()", checkoutbtn);
		System.out.println("Product is checkout succesfully");
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jse11 = (JavascriptExecutor)driver;
		jse11.executeScript("arguments[0].click()", addradio1);
		Thread.sleep(1000);
		fname1.sendKeys(dfname1);
		Thread.sleep(1000);
		lname1.sendKeys(dlname1);
		Thread.sleep(1000);
		com1.sendKeys(dcom1);
		Thread.sleep(1000);
		add1.sendKeys(dadd1);
		Thread.sleep(1000);
		add2.sendKeys(dadd2);
		Thread.sleep(1000);
		city1.sendKeys(dcity1);
		Thread.sleep(1000);
		post1.clear();
		post1.sendKeys(dpost1);
		Thread.sleep(1000);
		Select sc= new Select(country1);
		sc.selectByVisibleText(dcountry1);
		Thread.sleep(1000);
		Select sc11= new Select(state1);
		sc11.selectByVisibleText(dstate1);
		System.out.println("Billing details are added succesfully");
		Thread.sleep(1000);
		continue1.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jse111 = (JavascriptExecutor)driver;
		jse111.executeScript("arguments[0].click()", addradio2);
		Thread.sleep(1000);
		fname2.sendKeys(dfname2);
		Thread.sleep(1000);
		lname2.sendKeys(dlname2);
		Thread.sleep(1000);
		com2.sendKeys(dcom2);
		Thread.sleep(1000);
		add3.sendKeys(dadd3);
		Thread.sleep(1000);
		add4.sendKeys(dadd4);
		Thread.sleep(1000);
		city2.sendKeys(dcity2);
		Thread.sleep(1000);
		post2.clear();
		post2.sendKeys(dpost2);
		Thread.sleep(1000);
		Select sc1= new Select(country2);
		sc1.selectByVisibleText(dcountry2);
		Thread.sleep(1000);
		Select sc2= new Select(state2);
		sc2.selectByVisibleText(dstate2);
		Thread.sleep(1000);
		continue2.click();
		System.out.println("Dilivery address added succesfully");
		Thread.sleep(1000);
		addcomment1.sendKeys(dcomment1);
		Thread.sleep(1000);
		continue3.click();
		System.out.println("Delivery method is added succesfully");
		Thread.sleep(1000);
		addcomment2.sendKeys(dcomment2);
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor jse1111 = (JavascriptExecutor)driver;
		jse1111.executeScript("arguments[0].click()", term);
		Thread.sleep(1000);
		continue4.click();
		Thread.sleep(1000);
		System.out.println("Payment method is added succesfully");
		confirm.click();
		Thread.sleep(3000);
		System.out.println("Order is confirmed succesfully");
		my_account.click();
		Thread.sleep(1000);
		orderhistory.click();
		Thread.sleep(1000);
		view.click();
		Thread.sleep(1000);
		
	}
}
