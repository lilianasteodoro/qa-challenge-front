package e2e.pages;

import e2e.core.Core;
import org.openqa.selenium.By;

public class Forms extends Core {

    public By getPracticeForm() {
        return getByXpath("//*[text()='Practice Form']");
    }

    public By getCampoNome() {
        return getById("firstName");
    }

    public By getCampoSobreNome() {
        return getById("lastName");
    }

    public By getCampoEmail() {
        return getById("userEmail");
    }

    public By getRadio(int radio) {
        if (radio == 0) {
            return getByCss("label[for='gender-radio-1']");
        } else if (radio == 1) {
            return getByCss("label[for='gender-radio-2']");
        } else {
            return getByCss("label[for='gender-radio-3']");
        }
    }

    public By getCampoCelular() {
        return getById("userNumber");
    }

    public By getCampoDataNascimento() {
        return getById("dateOfBirthInput");
    }

    public By getCampoAssuntos() {
        return getById("subjectsInput");
    }

    public By getCheck(int check) {
        if (check == 0) {
            return getByCss("label[for='hobbies-checkbox-1']");
        } else if (check == 1) {
            return getByCss("label[for='hobbies-checkbox-2']");
        } else {
            return getByCss("label[for='hobbies-checkbox-3']");
        }

    }

    public By getCampoUpload() {
        return getById("uploadPicture");
    }

    public By getCampoEndereco() {
        return getById("currentAddress");
    }

    public By getCampoEstado() {
        return getById("react-select-3-input");
    }

    public By getCampoCidade() {
        return getById("react-select-4-input");
    }

    public By getBotaoSubmit() {
        return getById("submit");
    }

    public By getTituloModal() {
        return getById("example-modal-sizes-title-lg");
    }

    public By getFecharModal() {
        return getById("closeLargeModal");
    }
}