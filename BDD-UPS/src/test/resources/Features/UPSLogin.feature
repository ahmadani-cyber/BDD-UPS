Feature: UPS Login Feature
  This feature will test UPS Login functionality
  Background:
  Given UPS login page launched
  
  
  @Sanity @Sprint1 @Auto
  Scenario: Verify customer login using wrong user name and wrong password
    When Customer input wrong UserName "Daniyal" and wrong password "Pass"
    And Customer click on LogIn button
    Then Customer recieve an error message
  
  
  @Regression @Sprint1 @Manual
  Scenario Outline: Verify customer login using correct user name and correct password
    When Customer input correct UserName "<Username>" and correct password "<password>"
    And Customer click on LogIn button
    Then Customer should be able to login

    Examples: 
      | Username  | password |
      | Daniyal   |  Pass    | 
      | XYZ       | pass123  | 
      | TalenTech |  passtt  |