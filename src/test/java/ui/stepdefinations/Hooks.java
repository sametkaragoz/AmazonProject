package ui.stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import ui.utilities.Driver;

public class Hooks {
    @After
    public void tearDown (Scenario scenario) {
        Driver.closeDriver();
    }
}
