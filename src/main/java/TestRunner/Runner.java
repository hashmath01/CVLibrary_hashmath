package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\44744\\IdeaProjects\\CVLibrary\\src\\test\\java\\CVSearchFunctionality"
        ,glue={"StepDefinition"}
)

public class Runner {

}
