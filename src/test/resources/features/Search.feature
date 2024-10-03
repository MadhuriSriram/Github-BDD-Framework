Feature: Search Functionality

Scenario: Uesr searches for a valid product
Given User opens the application
When User enters the valid product "HP" into search field
And User Clicks on search button
Then User should get valid product displayed in search list


Scenario: Uesr searches for a valid product
Given User opens the application
When User enters the Invalid product "HONDA" into search field
And User Clicks on search button
Then User should get proper warning message

Scenario: Uesr search with out any product
Given User opens the application
When User dont enter anything into search field
And User Clicks on search button
Then User should get proper warning message
