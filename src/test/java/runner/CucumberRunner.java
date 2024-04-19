package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features="src/test/java/features/PurchaseBeautyProduct.feature",
	    glue = {"pages","hooks"},
	   plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
	    monochrome=true,
	   publish=true
	)

public class CucumberRunner  extends AbstractTestNGCucumberTests {

}
