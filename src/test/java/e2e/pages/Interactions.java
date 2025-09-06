package e2e.pages;

import e2e.core.Core;
import org.openqa.selenium.By;

public class Interactions extends Core {

    public By getSortable() {
        return getByXpath("//*[text()='Sortable']");
    }

    public By getListaNumeros() {
        return getByCss("div[class='list-group-item list-group-item-action']");
    }

    public By getContainer() {
        return getByCss("nav[class='nav nav-tabs']");
    }
}