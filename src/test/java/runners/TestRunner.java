package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue="stepDefinitions",
        tags = "@SmokingTest",
        plugin = {"pretty","html:target/cucumber-reports"},
        monochrome = true
)
public class TestRunner {
    // where we will run our code

}
