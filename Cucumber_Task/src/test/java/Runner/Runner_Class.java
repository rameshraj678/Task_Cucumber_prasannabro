package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\file\\java\\features\\DataBaseusingRegExp.feature",
								glue= {"StepDefinations"}
//								tags= "@smoke or @production",
//								plugin={"pretty"}

)
public class Runner_Class {
}
