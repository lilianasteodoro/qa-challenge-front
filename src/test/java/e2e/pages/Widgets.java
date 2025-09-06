package e2e.pages;

import e2e.core.Core;
import org.openqa.selenium.By;

public class Widgets extends Core {

    public By getProgressBar() {
        return getByXpath("//*[text()='Progress Bar']");
    }

    public By getBotaoStartStop() {
        return getById("startStopButton");
    }

    public By getBarraProgresso() {
        return getByCss("div[role='progressbar']");
    }

    public By getBarraProgressoFull() {
        return getByCss("div[aria-valuenow='100']");
    }

    public By getBotaoReset() {
        return getById("resetButton");
    }
}