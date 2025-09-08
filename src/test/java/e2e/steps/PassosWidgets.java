package e2e.steps;

import e2e.core.Core;
import e2e.pages.Widgets;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class PassosWidgets extends Core {

    private final Widgets paginaWidgets;

    public PassosWidgets() {
        paginaWidgets = new Widgets();
        PageFactory.initElements(driver, this.paginaWidgets);
    }

    @Before(value = "@Windows")
    public void before(Scenario cenario) {
        setCenario(cenario);
    }

    @And("^acessou o submenu Progress Bar$")
    public void acessou_o_submenu_Progress_Bar() {
        rolarPagina();
        clicar(paginaWidgets.getProgressBar());
    }

    @When("^clicar em iniciar a barra de progresso$")
    public void clicar_em_iniciar_a_barra_de_progresso() {
        rolarPagina();
        clicar(paginaWidgets.getBotaoStartStop());
    }

    @And("^parar o carregamento antes de 25%$")
    public void parar_o_carregamento_antes_de_25() {
        clicar(paginaWidgets.getBotaoStartStop());
        if (Integer.parseInt(returnGetAttribute(paginaWidgets.getBarraProgresso(), "aria-valuenow")) > 25) {
            Assert.fail("Barra de progresso acima de 25%");
        }
    }

    @And("^continuar o carregamento da barra de progresso$")
    public void continuar_o_carregamento_da_barra_de_progresso() {
        clicar(paginaWidgets.getBotaoStartStop());
    }

    @Then("^deve ser exibida a barra de progresso em 100%$")
    public void deve_ser_exibida_a_barra_de_progresso_em_100() {
        aguardarElementoPresente(paginaWidgets.getBarraProgressoFull());
        clicar(paginaWidgets.getBotaoReset());
    }
}