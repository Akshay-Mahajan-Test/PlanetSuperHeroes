package TestExecution;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Basic.TestBase;
import POM.Pom;

public class TestCases_01 extends TestBase{
	
	@Test
	public void AddtoProductInWishlist()
	{
		System.out.println("Add to Product in Wishlist before Login: ");
		Pom pom = new Pom(driver);
		pom.clickonUltimatewear();
		pom.clickonClassic_Shirt();
		String ActualTitle =driver.getTitle();
		System.out.println("Product Name: "+ActualTitle);
		assertEquals(ActualTitle, "PSH Classics T-Shirt - Female - Black");
		pom.ClickonWishlist();
	}
	
	@Test
	public void SearchProductName() throws InterruptedException
	{
		Pom pom = new Pom(driver);
		pom.ClickonSearchBar("Dreamhack Gamer - Frame Poster");
		pom.ClickonProduct();
		String Actual = driver.getTitle();
		System.out.println("Product Name: "+Actual);
		assertEquals(Actual, "Dreamhack Gamer - Frame Poster");
		
	}
}
