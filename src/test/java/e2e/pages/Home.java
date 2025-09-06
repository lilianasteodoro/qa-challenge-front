package e2e.pages;

import e2e.core.Core;
import org.openqa.selenium.By;

public class Home extends Core {

    public String getUrl() {
        return "https://demoqa.com/";
    }

    public By getForms() {
        return getByXpath("//*[text()='Forms']");
    }

    public By getAlertsFrameWindows() {
        return getByXpath("//*[text()='Alerts, Frame & Windows']");
    }

    public By getInteractions() {
        return getByXpath("//*[text()='Interactions']");
    }

    public By getWidgets() {
        return getByXpath("//*[text()='Widgets']");
    }
}