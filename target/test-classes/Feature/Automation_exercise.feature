Feature: regester functionality

  Background:
    Given i should launch browser
#@smoke
  Scenario: register  valid credentials
    When i enter into home page navigate to "http://automationexercise.com"
    Then check whether it has been nagivated
    When i Click on Signup / Login button
    When i enter the username as "mohnish"
    And i enter the email as "jonny1657@gmail.com"
    And i Click Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    When i click the check box as "Mr"
    And i enter password as "12345"
    And i enter Date of birth as "11" Octomber "2004"
    When Select checkbox Sign up for our newsletter!
    When Select checkbox Receive special offers from our partners!
    And i enter the first name as "mohnish"
    And i enter the last name as "PC"
    And i enter the company name as "IIAT"
    And i enter the address as "no.1 anna university staff qtrs"
    And i enter the address2 as "nasuhfaubfafu"
    And i enter the country as "India"
    And i enter the state as "TamilNadu"
    And i enter the city as "Chennai"
    And i enter the Zipcode as "600085"
    And i enter the Mobile Number as "1234567890"
    And Click Create Account button
    Then Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    Then Verify that " Logged in as " is visible
    And Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible and click Continue button

  #Scenario: login valid credentials
   #Then check whether it has been nagivated to
    #When i click on Signup / Login button
    #Then Verify 'Login to your account' is visible
    #And Enter correct email address and password
    #And Click login button
    #Then i Verify that "Logged in as username" is visible
    #And i Click Delete Account Button
    #Then i Verify that "ACCOUNT DELETED!" is visible
  #@san  
#Scenario Outline: user register funtionality 
 #   When i enter into home page navigate to "http://automationexercise.com"
  #  Then check whether it has been nagivated
   # When i Click on Signup / Login button
    #When i enter the username as "<user>"
   # And i enter the email as "<email>"
   # And i Click Signup button
    #Examples:
    #| user | email |
    #| Mohnish12345 | jonny12345@gmail.com |
    #|         hfyw | bfgdeiuqeuo |
    #| Mohnsih | 1234@$ |
    #| shravan | !@$nbduufegfeh.gmail.com |
    


