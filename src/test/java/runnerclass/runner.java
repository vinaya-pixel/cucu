package runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="myfeature",glue ="cuuc_package",
plugin = {"pretty","html:target/cucumber-html-report","json:target/ashdemo_JSON-report"})
public class runner {
}
