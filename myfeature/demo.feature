Feature: mydemoapp


Background: launch
Given lauching the test me app


Scenario: user logins to the account of test me app vindhya
Given  launching the app
Then click on login button to login
And user provides credentials for login

Scenario: add to cart by searching the product item vindhya
Given search items to be added to he cart
Then click on search item
And add the item to cart