package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue="stepDefinitions",
        tags = "@regression",
        plugin = {"pretty","html:target/cucumber.html"},
        monochrome = true
)
public class TestRunner {
    // where we will run our code

}
