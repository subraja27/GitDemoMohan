package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class OrderPage extends BaseClass{

	@Then(" verify the order id and print in the console")
	public void verify_the_order_id_and_print_in_the_console() {
		try {

			String text = driver.findElement(By.xpath("//p[@class='font-color-light mb-2']")).getText();
			String[] split = text.split(":");
			String actualOrderNumber = split[split.length-1];
			int parseInt = Integer.parseInt(actualOrderNumber);
			Assert.assertTrue(parseInt>0, "The number contains digits");
		} 
		catch (Exception e) {

			e.printStackTrace();
		}
	}

}
