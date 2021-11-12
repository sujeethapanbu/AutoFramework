Feature: Header
  As a user
  I should get redirected appropriately.

  @HeaderTests
  Scenario:verify header links redirection.

    Given I'm on home page "http://www.next.co.uk"
    When I click on MyAccountLink
    Then I should be on the appropriate page with title as "Sign In | My Account | Next Directory Online"
