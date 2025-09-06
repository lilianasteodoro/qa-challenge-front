package e2e.steps;

import e2e.core.Core;
import e2e.pages.Interactions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class PassosInteractions extends Core {

    private final Interactions paginaInteractions;

    public PassosInteractions() {
        paginaInteractions = new Interactions();
        PageFactory.initElements(driver, this.paginaInteractions);
    }

    @And("^acessou o submenu Sortable$")
    public void acessou_o_submenu_Sortable() {
        rolarPagina();
        clicar(paginaInteractions.getSortable());
    }

    @When("^embaralhar os itens$")
    public void embaralhar_os_itens() {
        dragAndDrop(getElementos(paginaInteractions.getListaNumeros()).get(1), paginaInteractions.getContainer());
        dragAndDrop(getElementos(paginaInteractions.getListaNumeros()).get(2), paginaInteractions.getContainer());
        dragAndDrop(getElementos(paginaInteractions.getListaNumeros()).get(3), paginaInteractions.getContainer());
        dragAndDrop(getElementos(paginaInteractions.getListaNumeros()).get(4), paginaInteractions.getContainer());
        dragAndDrop(getElementos(paginaInteractions.getListaNumeros()).get(5), paginaInteractions.getContainer());
    }

    @And("^deve mover os itens para ordem crescente$")
    public void deve_mover_os_itens_para_ordem_crescente() {
        dragAndDrop(getElementos(paginaInteractions.getListaNumeros()).get(1), paginaInteractions.getContainer());
        dragAndDrop(getElementos(paginaInteractions.getListaNumeros()).get(2), paginaInteractions.getContainer());
        dragAndDrop(getElementos(paginaInteractions.getListaNumeros()).get(3), paginaInteractions.getContainer());
        dragAndDrop(getElementos(paginaInteractions.getListaNumeros()).get(4), paginaInteractions.getContainer());
        dragAndDrop(getElementos(paginaInteractions.getListaNumeros()).get(5), paginaInteractions.getContainer());
    }
}