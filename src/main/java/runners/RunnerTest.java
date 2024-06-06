package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        monochrome = true,
        glue = "{step_definitions}",
        tags = "@testCrud",
        features = "src/main/resources/features"
)
public class RunnerTest {
    public static void main(String [] args) {{io.cucumber.core.cli.Main.main(args);}}
}
// para rodar em sua máquina utilize esta linha e gerará o relatório na linha 09;
//        plugin = {"pretty" "json:target/cucumber-reports/Report.json", "html:target/cucumber-reports/"},