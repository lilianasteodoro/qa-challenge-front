package e2e.steps;

import e2e.core.Core;
import e2e.pages.Windows;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class PassosWindows extends Core {

    private final Windows paginaWindows;

    public PassosWindows() {
        paginaWindows = new Windows();
        PageFactory.initElements(driver, this.paginaWindows);
    }

    @Before(value = "@Widgets")
    public void before(Scenario cenario) {
        setCenario(cenario);
    }

    @And("^acessou o submenu Browser Windows$")
    public void acessou_o_submenu_Browser_Windows() {
        clicar(paginaWindows.getBrowserWindows());
    }

    @When("^clicar no botão New Window$")
    public void clicar_no_botao_New_Window() {
        rolarPagina();
        clicar(paginaWindows.getBotaoNovaJanela());
    }

    @Then("^deve ser exibida uma nova janela$")
    public void deve_ser_exibida_uma_nova_janela() {
        alternarJanela();
        validarCampoGetText(paginaWindows.getTextoNovaJanela(), "This is a sample page");
        fecharJanela();
    }
}