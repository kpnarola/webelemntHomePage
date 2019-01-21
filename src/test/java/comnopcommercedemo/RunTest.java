package comnopcommercedemo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@apparel, @book,  @computer, @digitalDownloads,@electronics,@giftCards,@jewelry")

public class RunTest {


}
