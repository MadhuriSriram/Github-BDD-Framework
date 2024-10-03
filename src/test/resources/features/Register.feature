Feature: Registration functionality

Scenario: User can create an account with only mandatory fields
Given User navigates to Register page
When User enters the below details into mandatory fields of registration page
|firstName   | Madhuri |
|lastName    | Sriram  |
|email       | srirammadhuri284@gmail.com |
|telephone   | 9392897212 |
|passowrd    | 12345 |
And User selects privacy policy
And User clicks on continue button
Then User account should get created successfully

Scenario: User can create an account with all fields
Given User navigates to Register page
When User enters the below details into mandatory fields of registration page
|firstName   | Madhuri |
|lastName    | Sriram  |
|email       | srirammadhuri284@gmail.com |
|telephone   | 9392897212 |
|passowrd    | 12345 |
And User selects Yes for newsletter
And User selects privacy policy
And User clicks on continue button
Then User account should get created successfully

Scenario: User can create already existed email account
Given User navigates to Register page
When User enters the below details into mandatory fields of registration page
|firstName   | Madhuri |
|lastName    | Sriram  |
|email       | srirammadhuri284@gmail.com |
|telephone   | 9392897212 |
|passowrd    | 12345 |
And User selects Yes for newsletter
And User selects privacy policy
And User clicks on continue button
Then User account should get created successfully

Scenario: User without entering any details
Given User navigates to Register page
When User dont enter any details
And User clicks on continue button
Then Proper warning messgae should displayed

