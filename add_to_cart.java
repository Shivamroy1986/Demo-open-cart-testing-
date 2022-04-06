package Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class add_to_cart {
	WebDriver driver;
	public  add_to_cart(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath="//*[@id=\"logo\"]/h1/a")
	WebElement home;
	@FindBy(xpath="//*[@id=\"wishlist-total\"]")
	WebElement wishlist;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr[2]/td[6]/a")
	WebElement removeiphone;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr[2]/td[6]/a")
	WebElement removemac;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[6]/a")
	WebElement removenikkon;
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/button")
	WebElement addhp;
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/a")
	WebElement continuebtn;
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	WebElement addcartbtn;
	
	
	public void cart() throws InterruptedException  {
		Thread.sleep(1000);
		home.click();
		Thread.sleep(2000);
		wishlist.click();
		Thread.sleep(1000);
		removeiphone.click();
		System.out.println("Iphone is removed from wishlist because not available in the stock");
		Thread.sleep(1000);
		removemac.click();
		System.out.println("Mac BookPro is removed from wishlist because not available in the stock");
		Thread.sleep(1000);
		removenikkon.click();
		System.out.println("Nikon d300  is removed from wishlist because not available in the stock");
		Thread.sleep(1000);
		addhp.click();
		Thread.sleep(2000);
		addcartbtn.click();
		System.out.println("Hp L300 is added to cart succesfully");
	}

}
