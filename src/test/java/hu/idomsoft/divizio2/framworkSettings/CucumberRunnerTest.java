package hu.idomsoft.divizio2.framworkSettings;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "src/test/java/hu/idomsoft/divizio2/framworkSettings",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"progress", "json:target/executable-specification/cucumber.json"},
        monochrome = true
)
public class CucumberRunnerTest {
}