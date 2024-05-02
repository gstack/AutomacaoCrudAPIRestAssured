package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-reports/Report.json", "html:target/cucumber-reports/"},
        monochrome = true,
        glue = "{step_definitions}",
        tags = "@testCrud",
        features = "src/main/resources/features"
)
public class RunnerTest {
    public static void main(String [] args) {{io.cucumber.core.cli.Main.main(args);}}
}