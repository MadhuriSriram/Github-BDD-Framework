Feature: Login functionality

Scenario: Login with valid credentials
Given User navigates to login page
When User has enters valid email address "srirammadhuri284@gmail.com" into email field
And User has enters valid passowrd "12345" into passoword field
And User clicks on Login button
Then User should get successfully logged in

Scenario: Login with Invalid credentials
Given User navigates to login page
When User has enters Invalid email address "srirammadhuri28@gmail.com" into email field
And User has enters Invalid passowrd "12345789" into passoword field
And User clicks on Login button
Then User should get proper warning message about invalid credentials

Scenario: Login with Valid Email and Invalid password credentials
Given User navigates to login page
When User has enters valid email address "srirammadhuri284@gmail.com" into email field
And User has enters Invalid passowrd "12345789" into passoword field
And User clicks on Login button
Then User should get proper warning message about invalid credentials

Scenario: Login with Invalid email and valid passowrd credentials
Given User navigates to login page
When User has enters Invalid email address "srirammadhuri28@gmail.com" into email field
And User has enters valid passowrd "12345" into passoword field
And User clicks on Login button
Then User should get proper warning message about invalid credentials

Scenario: Login without enter any credentials
Given User navigates to login page
When User has to dont enters any email address into email field
And User has to dont enters any passowrd into passowrd field
And User clicks on Login button
Then User should get proper warning message about invalid credentials





