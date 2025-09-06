package e2e.pages;

import e2e.core.Core;
import org.openqa.selenium.By;

public class Windows extends Core {

    public By getBrowserWindows() {
        return getByXpath("//*[text()='Browser Windows']");
    }

    public By getBotaoNovaJanela() {
        return getById("windowButton");
    }

    public By getTextoNovaJanela() {
        return getById("sampleHeading");
    }
}