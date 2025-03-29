Feature: searching products
  Scenario Outline: searching products on google

  Given  i am on the google home page

  When i enter "<product_name>" in the search bar
  And i click on the search button
  Then  i can see the search result successful


  Examples:
  |product_name|
  |flower      |
  |toy         |
  |Artificial inteligents|
  | water                |
