package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;*/

import Classes.Login;
import Classes.Register;
import Classes.Return_order;
import Classes.add_to_cart;
import Classes.capture_screenshot;
import Classes.checkout;
import Classes.wishlist;



public class TestClass {
	static WebDriver driver;
	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver (1).exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test(priority=1)
	public void Register_functionality() throws Exception{
		driver.get("https://demo.opencart.com/");
		Register register=PageFactory.initElements(driver, Register.class);
		register.newregister("Shivam", "Roy", "shivam1wq11s12342s2w@gmail.com", "7250782508", "123456", "123456");
		//change email id after every test case run
		capture_screenshot screenShot= PageFactory.initElements(driver, capture_screenshot.class);
		screenShot.getScreenShot(driver, "./screenshot/Register_succesfully.png");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/span")).getText(), "123456789");
		System.out.println("New User is registered succesfully");
		System.out.println("Register_functionality passes succesfully");
	}
	@Test(priority=2)
	public void Invalid_Login_functionality() throws Exception {
		Login login=PageFactory.initElements(driver, Login.class);
		login.LoginPage("soul@you.com", "12345");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/span")).getText(), "123456789");	
		System.out.println("Login from invalid username and password");
		System.out.println("Invalid_Login_functionality passes succesfully");
		

	}
	@Test(priority=3 )
	public void Login_functionality() throws Exception {

		Login login=PageFactory.initElements(driver, Login.class);
		login.LoginPage("opentesting@mail.com", "12345");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/span")).getText(), "123456789");
		System.out.println("Login from valid username and password");
		System.out.println("Login_functionality passes succesfully");
	}
	@Test(priority=4 )
	public void wishlist_functionality() throws Exception {
		wishlist Wish=PageFactory.initElements(driver, wishlist.class);
		Wish.addwishlist("mac","iphone","nikon d300", "Hp ");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/span")).getText(), "123456789");
		System.out.println("All products are added to wishlist succesfully");
		System.out.println("wishlist_functionality passed succesfully");
	}

	@Test(priority=5)
	public void Add_cart_functionality() throws Exception {
		add_to_cart addcart=PageFactory.initElements(driver, add_to_cart.class);
		addcart.cart();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/span")).getText(), "123456789");
		System.out.println("HP l300 are added to cart succesfully");
		System.out.println("Add_cart_functionality passes succesfully");
	}

	@Test(priority=6)
	public void placing_order() throws Exception{
		checkout checkb=PageFactory.initElements(driver,checkout.class);
		checkb.check("Shivam", "Roy", "HCL", "Near Thakur badi Mandir", "Baghmara", "Dhanbad", "828306", "India", "Bihar", "Sumit", "rana", "HCL", "Near axis bank", "kusum vihar", "Merrut","250001","India","Uttar Pradesh","Dilivery is done between 4PM to 6Pm ","You do not need to do payment payment is done");
		capture_screenshot screenShot= PageFactory.initElements(driver, capture_screenshot.class);
		screenShot.getScreenShot(driver, "./screenshot/order_placed.png");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/span")).getText(), "123456789");
		System.out.println("Hp l300 is order succesfully");
		System.out.println("placing_order is passes succesfully");
	}

	@Test(priority=7)
	public void Returning_order_functionality() throws Exception {
		Return_order returning=PageFactory.initElements(driver, Return_order.class) ;
		returning.orderreturn("Wrong product is recived ");
		capture_screenshot screenShot= PageFactory.initElements(driver, capture_screenshot.class);
		screenShot.getScreenShot(driver, "./screenshot/return_placed.png");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/span")).getText(), "123456789");
		System.out.println("Order is returned succesfully");
		System.out.println("Returning_order_functionality is passes succesfully");
		System.out.println("Thanks for visiting DemoOpenCart.com");
	}
	@AfterTest
	public void teardown() {
		driver.close();


	}

}
