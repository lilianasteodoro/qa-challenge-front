package e2e.steps;

import e2e.core.Core;
import e2e.pages.Forms;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class PassosForms extends Core {

    private final Forms paginaForms;
    private final Integer random;

    public PassosForms() {
        paginaForms = new Forms();
        PageFactory.initElements(driver, this.paginaForms);
        random = (int) (Math.random() * 3);
    }

    @And("^acessou o submenu Practice Form$")
    public void acessou_o_submenu_Practice_Form() {
        clicar(paginaForms.getPracticeForm());
    }

    @When("^preencher o formulário com dados aleatórios$")
    public void preencher_o_formulario_com_dados_aleatorios() {
        digitarCampo(paginaForms.getCampoNome(), faker.name().firstName());
        digitarCampo(paginaForms.getCampoSobreNome(), faker.name().lastName());
        digitarCampo(paginaForms.getCampoEmail(), faker.internet().emailAddress());
        rolarPagina();
        clicar(paginaForms.getRadio(random));
        digitarCampo(paginaForms.getCampoCelular(), faker.number().digits(10));
        digitarSaindoCampo(paginaForms.getCampoDataNascimento(), faker.date().birthday().toString());
        digitarSaindoCampo(paginaForms.getCampoAssuntos(), "Computer");
        clicar(paginaForms.getCheck(random));
        digitarCampo(paginaForms.getCampoEndereco(), faker.address().fullAddress());
        digitarSaindoCampo(paginaForms.getCampoEstado(), "Haryana");
        digitarSaindoCampo(paginaForms.getCampoCidade(), "Panipat");
    }

    @And("^realizar o upload do um arquivo txt$")
    public void realizar_o_upload_do_um_arquivo_txt() {
        anexarArquivo(paginaForms.getCampoUpload(), "testes.txt");
    }

    @And("^submeter o formulário$")
    public void submeter_o_formulario() {
        clicar(paginaForms.getBotaoSubmit());
    }

    @Then("^deve ser exibido um popup de confirmação$")
    public void deve_ser_exibido_um_popup_de_confirmacao() {
        validarCampoGetText(paginaForms.getTituloModal(), "Thanks for submitting the form");
        clicarByAction(paginaForms.getFecharModal());
    }
}