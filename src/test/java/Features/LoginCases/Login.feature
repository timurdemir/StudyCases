Feature: Login

  Scenario: SuccessLogin
    Given Go to HomePage
    When  Hover myAccount
    And   Click login
    And   Fill email
    And   Click button
    And   Fill password
    And   Click button
    Then  Successful login is checked

  Scenario: LoginNullEmail
    Given Go to HomePage
    When  Hover myAccount
    And   Click login
    And   Click btnLogin
    Then  Incorrect operation is checked

  Scenario: LoginInvalidEmail
    Given Go to HomePage
    When  Hover myAccount
    And   Click login
    And   Fill invalid email
    And   Click button
    Then  Incorrect operation is checked

  Scenario: LoginWrongEmail
    Given Go to HomePage
    When  Hover myAccount
    And   Click login
    And   Fill wrong email
    And   Click button
    Then  Incorrect operation is checked

  Scenario:LoginWrongPassword
    Given Go to HomePage
    When  Hover myAccount
    And   Click login
    And   Fill email
    And   Click button
    And   Fill wrong password "Hb123456."
    And   Click button
    Then  Incorrect operation is checked

  Scenario: LoginInvalidGSM
    Given Go to HomePage
    When  Hover myAccount
    And   Click login
    And   Fill invalid GSM
    And   Click button
    Then  Incorrect operation is checked

  Scenario: LoginWrongGSM
    Given Go to HomePage
    When  Hover myAccount
    And   Click login
    And   Fill wrong GSM
    And   Click button
    Then  Incorrect operation is checked









