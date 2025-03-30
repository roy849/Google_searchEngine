Feature: searching products

  Scenario Outline: log in amazon page
    Given i am on the amazon home page
    When i enter "<Email>" in the email text  box
        And i click on the continue button
    And i enter "<password>" in the password text box
    And i click on the sign in button
    Then i can loginto my account successful
    Examples:
      |Email |password|
      |Abc123@gmail.com|Bnm123|
    |Asdf123@gmail.com| Asd123|
    |Flower123@gmail.com|Fl123@gmail.com|
    |phone123@gmail.com|Ph123@gmail.com |