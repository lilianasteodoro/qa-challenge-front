package e2e.pages;

import e2e.core.Core;
import org.openqa.selenium.By;

public class Tables extends Core {

    public By getWebTables() {
        return getByXpath("//*[text()='Web Tables']");
    }

    public By getBotaoAdd() {
        return getById("addNewRecordButton");
    }

    public By getCampoNome() {
        return getById("firstName");
    }

    public By getCampoSobrenome() {
        return getById("lastName");
    }

    public By getCampoEmail() {
        return getById("userEmail");
    }

    public By getCampoIdade() {
        return getById("age");
    }

    public By getCampoSalario() {
        return getById("salary");
    }

    public By getCampoDepartamento() {
        return getById("department");
    }

    public By getBotaoSubmit() {
        return getById("submit");
    }

    public By getBotaoEditar() {
        return getById("edit-record-4");
    }

    public By getBotaoDeletar() {
        return getById("delete-record-4");
    }

    public By getBotaoDeletarTodos(int posicao) {
        return getById("delete-record-" + posicao);
    }
}