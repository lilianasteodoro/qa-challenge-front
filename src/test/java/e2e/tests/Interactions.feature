@DemoQA @Interactions @Sortable
Feature: Interactions

  Scenario: Validar organização dos itens da lista usando drag and drop

    Given o usuário acessou a home do sistema DemoQA
    And acessou a opção Interactions
    And acessou o submenu Sortable
    When embaralhar os itens
    Then deve mover os itens para ordem crescente