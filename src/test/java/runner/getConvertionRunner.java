package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/getConvertionfeature.feature",
glue="pages",
plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
monochrome=true)


public class getConvertionRunner extends AbstractTestNGCucumberTests{

}
