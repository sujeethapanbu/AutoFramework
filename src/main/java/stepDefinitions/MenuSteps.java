package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuSteps extends CommonFunctions {
    @When("I mouse over menu option {string}")
    public void i_mouse_over_menu_option(String menuoption)
    {
        WebElement menu =driver.findElement(By.xpath("//span=[text()='"+menuoption+"']"));
        mouseover(menu);
        menu.click();

    }
    @Then("I should be on the appropriate page with title {string}")
    public void i_should_be_on_the_appropriate_page_with_title(String expectedTitle)
    {
       String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle ));
    }

}
