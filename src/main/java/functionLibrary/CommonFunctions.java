package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.text.Element;
import java.io.File;

public class CommonFunctions {
    public String screenshotPath = new File("src/main/resources/errShots").getAbsolutePath();
    public static WebDriver driver;
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    public void closeBrowser()
    {

        driver.quit();
    }

    public void mouseover(WebElement element)
    {
        Actions actions=new Actions(driver);
        actions.moveToElement(element).build().perform();
    }

    public void takeScreenShot(String fileName) throws Exception
    {
        TakesScreenshot screenshot =((TakesScreenshot) driver);
        File virtualFile= screenshot.getScreenshotAs(OutputType.FILE);
        File destFile= new File(screenshotPath+fileName);
        FileUtils.copyFile(virtualFile,destFile);
    }
}
