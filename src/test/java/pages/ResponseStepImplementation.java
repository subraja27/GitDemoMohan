package pages;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ResponseStepImplementation {
	
	public Response response;
	
	@Given("set the endpoint for the request")
	public void setupEndpoint ()
	{
		RestAssured.baseURI="https://v6.exchangerate-api.com/v6/cd79a95b42c26ca4f0f003ef/latest/USD";
	}
	
	
	@When("place the get request")
	public void placeRequest()
	{
		 response = RestAssured.get();
	}
	
	@Then("get the conversion rate for the currency (.*)$")
	public void getTheConversionRate(String currency)
	
	{ 
		
		JsonPath jsonPath = response.jsonPath();
		Object object =jsonPath.get("conversion_rates."+currency);	
		System.out.println(object);
		System.out.println(response.statusCode());
		Assert.assertEquals(200, response.statusCode());
		
	}
	
}
