Feature: Menu
  As a user
  I should navigate to appropriate products using menu

  Background: Home page
    Given I'm on home page "http://www.nwxt.co.uk"
  @Menu
  Scenario Outline: Menu re-direction verification

    When I mouse over menu option "<Menu>"
    Then I should be on the appropriate page with title "<ExpectedTitle>"

    Examples:
      | Menu  | ExpectedTitle |
      | Men   | Men'Shop      |
      | Women | Women's Shop  |
      | Baby  | Baby's Shop   |