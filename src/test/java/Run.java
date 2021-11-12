import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@search1",dryRun = false,
plugin = {"pretty","html:target/report.html"})

public class Run {
}
