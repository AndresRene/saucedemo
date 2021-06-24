#Author: andresrene.hurtado@gmail.com
#Date: 17-06-2021
#Description: Set de pruebas para  probar el correcto funcionamiento de las historias de usuario del sitio  https://www.saucedemo.com/
#Primer Escenario login correcto
Feature: Validate Login Credentials

  Scenario Outline: Verify that a valid user can sign in
    Given browser is open
    And user goes to the webpage
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the shop page 

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario Outline: Verify that a in-valid users cannot sign in
    Given browser is open
    And user goes to the webpage
    When user enters <username> and <password>
    And clicks on login button
    Then user is not able to enter to the shop page

    Examples: 
      | username        | password     |
      | locked_out_user | secret_sauce |
      | prueba          |        12345 |
      
