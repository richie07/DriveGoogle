package support;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features",
        tags="@create",
        glue="definitions",
        plugin={"json:target/cucumber-report/cucumber.json", "html:target/cucumber-report/"})
public class runtest {
}
