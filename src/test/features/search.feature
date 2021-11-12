Feature: Search
  As a user
  I should search and get appropriate results
   @search,@search1
  Scenario: verify search with valid product/brand name

    Given I'm on home page "http://www.next.co.uk"
    When I enter search term "Jeans"
    When I click search icon
    Then I should see  relevant products related to "Jeans" in search result page

     @search
    Scenario: verify search with Invalid product/brand name

      Given I'm on home page "http://www.next.co.uk"
      When I enter search term "Flower"
      When I click search icon
      Then I should not get results instead a message "No results returned"