@retail
Feature: - for this feature you have to have an existing account

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username 'edris@gmail.com' and password 'awds'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    And User fill affiliate form with below information
      | company | website        | taxID  | paymentMethod |
      | NETFLIX | www.net.com | 8877 | Cheque type   |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber  | swiftCode | accountName | accountNumber |  |
      | BOA     | 0033998855  |      3344 | Saving     |    042127837 |  |
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your account Information
    When User click on ‘Edit your account information’ link
    And User modify below information
      | firstName | lastName | email               | telephone |
      | Edris      | Sadat     | Edris.123@gmail.com | 998877665 |
    And User click on continue button
    Then User should see a message ‘Success: Your account has been successfully updated.’
