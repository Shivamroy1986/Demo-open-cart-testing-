package Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class wishlist {
	WebDriver driver;
	public   wishlist(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath="//*[@id=\"search\"]/input")
	WebElement Search_box;
	@FindBy(xpath="//*[@id=\"search\"]/span/button")
	WebElement Search_button;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[4]/div/div[2]/div[2]/button[2]")
	WebElement macpro;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[2]")
	WebElement iphone;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[2]")
	WebElement nikon;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[2]")
	WebElement HpLP;
	public void addwishlist(String s1 , String s2 , String s3,String s4) throws InterruptedException {
		Thread.sleep(1000);
		Search_box.sendKeys(s1);
		Search_button.click();
		Thread.sleep(1000);
		macpro.click();
		System.out.println("Macbook pro added to wishlist succesfully");
		Thread.sleep(2000);
		Search_box.clear();
		Thread.sleep(1000);
		Search_box.sendKeys(s2);
		Search_button.click();
		Thread.sleep(1000);
		iphone.click();
		System.out.println("Iphone added to wishlist succesfully");
		Thread.sleep(2000);
		Search_box.clear();
		Thread.sleep(1000);
		Search_box.sendKeys(s3);
		Search_button.click();
		Thread.sleep(1000);
		nikon.click();
		System.out.println("Nikon D300 added to wishlist succesfully");
		Thread.sleep(2000);
		Search_box.clear();
		Thread.sleep(1000);
		Search_box.sendKeys(s4);
		Search_button.click();
		Thread.sleep(1000);
		HpLP.click();
		System.out.println("HP LP3065 added to wishlist succesfully");
		
		
	}
}
