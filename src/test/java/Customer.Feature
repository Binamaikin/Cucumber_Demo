Feature: Customer
Scenario: Add a new customer
Given User Launch Chrome browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And user enters email as a "admin@yourstore.com" and Password as "admin"
And click on Login
Then User can view Dashboard
When User click on customer menu
And click on customer Menu Item 
And click on Add new button
Then User can view Add new customer page
When user enter customer info
And click on save button
Then User can view confirmation message "The new customer has been added successfully"
and close browser

