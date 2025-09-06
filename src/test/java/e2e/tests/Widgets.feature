@DemoQA @Widgets @ProgressBar
Feature: Widgets

  Scenario: Validar status parcial e final da progress bar

    Given o usuário acessou a home do sistema DemoQA
    And acessou a opção Widgets
    And acessou o submenu Progress Bar
    When clicar em iniciar a barra de progresso
    And parar o carregamento antes de 25%
    And continuar o carregamento da barra de progresso
    Then deve ser exibida a barra de progresso em 100%