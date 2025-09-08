package e2e.steps;

import e2e.core.Core;
import e2e.pages.Tables;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class PassosTables extends Core {

    private final Tables paginaTables;

    public PassosTables() {
        paginaTables = new Tables();
        PageFactory.initElements(driver, this.paginaTables);
    }

    @Before(value = "@WebTables")
    public void before(Scenario cenario) {
        setCenario(cenario);
    }

    @And("^acessou o submenu Web Tables$")
    public void acessou_o_submenu_Web_Tables() {
        if (getCenario().getLine() <= 30) {
            clicar(paginaTables.getWebTables());
        }
    }

    @When("^criar um novo registro$")
    public void criar_um_novo_registro() {
        rolarPagina();
        clicar(paginaTables.getBotaoAdd());
        digitarCampo(paginaTables.getCampoNome(), faker.name().firstName());
        digitarCampo(paginaTables.getCampoSobrenome(), faker.name().lastName());
        digitarCampo(paginaTables.getCampoEmail(), faker.internet().emailAddress());
        digitarCampo(paginaTables.getCampoIdade(), faker.number().digits(2));
        digitarCampo(paginaTables.getCampoSalario(), faker.number().digits(9));
        digitarCampo(paginaTables.getCampoDepartamento(), faker.commerce().department());
        clicar(paginaTables.getBotaoSubmit());
    }

    @When("^clicar em criar novo registro$")
    public void clicar_em_criar_novo_registro() {
        rolarPagina();
        clicar(paginaTables.getBotaoAdd());
    }

    @And("^editar um novo registro$")
    public void editar_um_novo_registro() {
        clicar(paginaTables.getBotaoEditar());
        digitarCampo(paginaTables.getCampoNome(), faker.name().firstName());
        digitarCampo(paginaTables.getCampoSobrenome(), faker.name().lastName());
        digitarCampo(paginaTables.getCampoEmail(), faker.internet().emailAddress());
        digitarCampo(paginaTables.getCampoIdade(), faker.number().digits(2));
        digitarCampo(paginaTables.getCampoSalario(), faker.number().digits(7));
        digitarCampo(paginaTables.getCampoDepartamento(), faker.commerce().department());
        clicar(paginaTables.getBotaoSubmit());
    }

    @Then("^deve deletar o registro$")
    public void deve_deletar_o_registro() {
        clicar(paginaTables.getBotaoDeletar());
    }

    @And("^digitar o \"([^\"]*)\" no campo First Name$")
    public void digitar_o_no_campo_First_Name(String nome) {
        digitarCampo(paginaTables.getCampoNome(), nome);
    }

    @And("^digitar o \"([^\"]*)\" no campo Last Name$")
    public void digitar_o_no_campo_Last_Name(String sobrenome) {
        digitarCampo(paginaTables.getCampoSobrenome(), sobrenome);
    }

    @And("^digitar o \"([^\"]*)\" no campo Email$")
    public void digitar_o_no_campo_Email(String email) {
        digitarCampo(paginaTables.getCampoEmail(), email);
    }

    @And("^digitar a \"([^\"]*)\" no campo Age$")
    public void digitar_a_no_campo_Age(String idade) {
        digitarCampo(paginaTables.getCampoIdade(), idade);
    }

    @And("^digitar o \"([^\"]*)\" no campo Salary$")
    public void digitar_o_no_campo_Salary(String salario) {
        digitarCampo(paginaTables.getCampoSalario(), salario);
    }


    @And("^digitar o \"([^\"]*)\" no campo Department$")
    public void digitar_o_no_campo_Department(String departamento) {
        digitarCampo(paginaTables.getCampoDepartamento(), departamento);
    }

    @And("^salvar o registro$")
    public void salvar_o_registro() {
        clicar(paginaTables.getBotaoSubmit());
    }

    @And("^deve deletar todos os novos registros$")
    public void deve_deletar_todos_os_novos_registros() {
        if (getCenario().getLine() == 41) {
            for (int i = 4; i <= 15; i++) {
                clicar(paginaTables.getBotaoDeletarTodos(i));
            }
        }
    }
}