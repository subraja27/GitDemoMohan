package hooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class HooksImplementation extends BaseClass{

	@Before
	public void preCondition() {
		driver = new ChromeDriver();
		driver.get("https://commercejs-demo-store.netlify.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	@After
	public void postCondition() {
		driver.quit();

	}

	@AfterStep
	public void attachScreenshot(Scenario scenario) throws FileNotFoundException {
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		Allure.addAttachment("Snaphot:" ,new FileInputStream(src));


	}






}
