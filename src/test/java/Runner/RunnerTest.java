package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources/features",
        glue = {"StepsDefinition"},
        monochrome = false,
        plugin = {"pretty", "html:target/HtmlReports/Report.html",
                "pretty", "json:target/JsonReports/Report.json",
                "pretty", "junit:target/XMLReports/Report.xml"})
public class RunnerTest {

}
