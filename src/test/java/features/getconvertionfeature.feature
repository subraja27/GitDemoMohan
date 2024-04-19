Feature: Get Conversion Rate
  
Scenario Outline: Get the conversion rate for the given Currency
Given set the endpoint for the request 
When place the get request 
Then get the conversion rate for the currency <currency>

Examples:
|currency|
|INR|
