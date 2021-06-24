#Author: andresrene.hurtado@gmail.com
#Date: 23-06-2021
#Description: Set de pruebas para  probar el correcto funcionamiento de las historias de usuario del sitio  https://www.saucedemo.com/
Feature: Buy In the Shop

  Scenario Outline: Buy the maximum and the minimum price item of the store
    Given browser is open
    And user goes to the webpage
    When user enters standard_user and secret_sauce
    And clicks on login button
    Then user select the max and min price item 
    And clicks on the shopping cart
    Then click on checkout
    Then enters <firstName> <lastName> <postalCode>
    And click on continue
    Then See the summary and click on finish
    And the order is complete

    Examples: 
      | firstName | lastName | postalCode |
      | Pedro     | Probador |     101101 |