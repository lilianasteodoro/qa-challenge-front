@DemoQA @Elements @WebTables
Feature: Elements

  Scenario: Realizar CRUD no formulário da tabela

    Given o usuário acessou a home do sistema DemoQA
    And acessou a opção Elements
    And acessou o submenu Web Tables
    When criar um novo registro
    And editar um novo registro
    Then deve deletar o registro

  Scenario Outline: Inserir registro dinamicamente no formulário da tabela

    Given o usuário acessou a home do sistema DemoQA
    And acessou a opção Elements
    And acessou o submenu Web Tables
    When clicar em criar novo registro
    And digitar o "<nome>" no campo First Name
    And digitar o "<sobrenome>" no campo Last Name
    And digitar o "<email>" no campo Email
    And digitar a "<idade>" no campo Age
    And digitar o "<salario>" no campo Salary
    And digitar o "<departamento>" no campo Department
    And salvar o registro
    Then deve deletar todos os novos registros

    Examples:
      | nome     | sobrenome | email                         | idade | salario | departamento |
      | Ana      | Pereira   | ana.pereira@techhub.com       | 29    | 4500    | Marketing    |
      | Celso    | Silva     | joao.silva@inovatech.com      | 34    | 6800    | TI           |
      | Carla    | Mendes    | carla.mendes@humanize.com     | 26    | 3900    | RH           |
      | Marcos   | Oliveira  | marcos.oliveira@finansys.com  | 41    | 9200    | Financeiro   |
      | Beatriz  | Santos    | beatriz.santos@lexcorp.com    | 37    | 7100    | Engenharia   |
      | Ricardo  | Almeida   | ricardo.almeida@lidera.com    | 45    | 12000   | Marketing    |
      | Fernanda | Costa     | fernanda.costa@creativus.com  | 31    | 5400    | TI           |
      | Gabriel  | Rocha     | gabriel.rocha@suportplus.com  | 28    | 4800    | Suporte      |
      | Larissa  | Lima      | larissa.lima@operamax.com     | 39    | 8500    | Financeiro   |
      | Pedro    | Gomes     | pedro.gomes@sellforce.com     | 33    | 6200    | Vendas       |
      | Camila   | Fernandes | camila.fernandes@desigrow.com | 27    | 4200    | Design       |
      | Thiago   | Barros    | thiago.barros@engenium.com    | 42    | 10300   | Engenharia   |