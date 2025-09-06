package e2e.steps;

import e2e.core.Core;
import e2e.pages.Home;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.PageFactory;

public class PassosHome extends Core {

    private final Home paginaHome;

    public PassosHome() {
        paginaHome = new Home();
        PageFactory.initElements(driver, this.paginaHome);
    }

    @Given("^o usuário acessou a home do sistema DemoQA$")
    public void o_usuario_acessou_a_home_do_sistema_DemoQA() {
        acessarPagina(paginaHome.getUrl());
    }

    @And("^acessou a opção Forms$")
    public void acessou_a_opcao_Forms() {
        rolarPagina();
        clicar(paginaHome.getForms());
    }

    @And("^acessou a opção Alerts, Frame e Windows$")
    public void acessou_a_opcao_Alerts_Frame_e_Windows() {
        rolarPagina();
        clicar(paginaHome.getAlertsFrameWindows());
    }

    @And("^acessou a opção Interactions$")
    public void acessou_a_opcao_Interactions() {
        rolarPagina();
        clicar(paginaHome.getInteractions());
    }

    @And("^acessou a opção Widgets")
    public void acessou_a_opcao_Widgets() {
        rolarPagina();
        clicar(paginaHome.getWidgets());
    }
}