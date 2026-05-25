Feature: Automation Exercise Login Functionality
Background:
    Given i should launch browser

Scenario: login valid credentials
    When Navigate to url 'http://automationexercise.com'
    And i should Verify that home page is visible successfully
    When i click on Signup / Login button
    Then Verify "Login to your account" is visible
    And Enter correct email address and password
    And Click login button
    Then i should Verify that "Logged in as " is visible
    And i should Click Delete Account button
    Then i should Verify that "ACCOUNT DELETED!" is visible
    
    
