package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchSteps extends CommonFunctions {

    @When("I enter search term {string}")
    public void i_enter_search_term(String searchTerm)
    {
       driver.findElement(By.id("sli_search_1")).sendKeys(searchTerm);
     }
    @When("I click search icon")
    public void i_click_search_icon()
    {
        driver.findElement(By.xpath("//input[@title='Search Items']")).click();
    }
    @Then("I should see  relevant products related to {string} in search result page")
    public void i_should_see_relevant_products_related_to_in_search_result_page(String expectedSearchTerm)
    {
      List<WebElement> allProducts = driver.findElements(By.xpath("//a[@class='TitleText']/span"));

      for (WebElement eachProduct : allProducts)
      {
          String productName = eachProduct.getText();
          System.out.println(productName);
          Assert.assertTrue(productName.contains(expectedSearchTerm));
      }


    }

    @Then("I should not get results instead a message {string}")
    public void i_should_not_get_results_instead_a_message(String noResultsReturned)
    {
       String actualResultsReturned= driver.findElement(By.xpath("//*[@id=\"newsearch\"]/div[2]/div[1]/div/div[1]/strong")).getText();
       Assert.assertEquals(noResultsReturned,actualResultsReturned);
    }

}
