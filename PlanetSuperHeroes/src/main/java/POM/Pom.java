package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	WebDriver driver;
	public Pom(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//img[@class=\"img-responsive w-100 shadow-1-strong rounded cursor-pointer\"])[1]") private WebElement Ultimate_Animal_Shirts;
	@FindBy(xpath = "//img[@alt=\"PSH Classics T-Shirt - Female - Black\"]") private WebElement Classic_shirt;
	@FindBy(xpath = "(//div[@class=\"topright\"])[1]") private WebElement Wishlist;
	@FindBy(xpath = "//input[@type=\"search\"]") private WebElement Search_bar;
	@FindBy(xpath = "//img[@alt=\"Dreamhack Gamer  - Frame Poster\"]") private WebElement product;
	
	public void clickonUltimatewear()
	{
		Ultimate_Animal_Shirts.click();
	}
	
	public void clickonClassic_Shirt()
	{
		Classic_shirt.click();
	}
	
	public void ClickonWishlist()
	{
		Wishlist.click();
	}
	
	public void ClickonSearchBar(String Product) throws InterruptedException
	{
		Search_bar.click();
		Search_bar.sendKeys(Product);
		Search_bar.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	public void ClickonProduct()
	{
		product.click();
	}
	
}