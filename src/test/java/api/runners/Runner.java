package api.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // features klasorunun path'i eklenir --> sag click, copy path, path from content root
        features = "src/test/resources/apiFeature",
        // features klasorundeki feature'larin kodalari cekecegi klasor (stepdefinations)
        glue = "src/test/java/api/stepdefinations",
        // hangi tag'lerin calistiralacagini secer
        tags = "",

        // true yapilirsa belirtilen tag'lerin kod derleme hatalarini kontrol eder
        // false yapilirsa belirtilen tag'leri calistirarak reeldeki hatalarini kontrol eder
        dryRun = false
)
public class Runner {
}
