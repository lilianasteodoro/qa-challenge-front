@DemoQA @Forms @PracticeForm
Feature: Forms

  Scenario: Submeter formulário com dados aleatórios e upload de txt

    Given o usuário acessou a home do sistema DemoQA
    And acessou a opção Forms
    And acessou o submenu Practice Form
    When preencher o formulário com dados aleatórios
    And realizar o upload do um arquivo txt
    And submeter o formulário
    Then deve ser exibido um popup de confirmação