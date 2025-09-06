@WIP
Feature: Elements

  Scenario: Validar abertura de nova janela

    Given o usuário acessou a home do sistema DemoQA
    And acessou a opção Alerts, Frame e Windows
    And acessou o submenu Browser Windows
    When clicar no botão New Window
    Then deve ser exibida uma nova janela