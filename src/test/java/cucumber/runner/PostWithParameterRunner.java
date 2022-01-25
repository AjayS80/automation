package cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/cucumber/features/PostWithParameter.feature"},
        glue = {"cucumber/steps"}

)

public class PostWithParameterRunner {

}
