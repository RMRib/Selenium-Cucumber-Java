#Author: Ricardo.moura@novigisolution.com.br
@featureTag
Feature: Login
  Como cliente da loja
  Quero fazer login
  Para realizar compras online

	##Background:
	##Given Que acessei o site da loja

  @ScenarioTag
  Scenario: Realizar login com sucesso
    Given Que acessei o site da loja
    When Eu preencher o usuario "standard_user"
    And Eu preencher a senha "secret_sauce"
    And Clicar em Login
    Then A página principal será exibida
	
	@Scenario2Tag
  Scenario Outline: Realizar login com sucesso tabela
    Given Que acessei o site da loja
    When Eu preencher o usuario <usuario>
    And Eu preencher a senha <senha>
    And Clicar em Login
    Then A página principal será exibida

    Examples: 
      | usuario         | senha          |
      | "standard_user" | "secret_sauce" |
	
	@WIP
  Scenario Outline: Realizar login Invalido
    Given Que acessei o site da loja
    When Eu preencher o usuario <usuario>
    And Eu preencher a senha <senha>
    And Clicar em Login
    Then será exibida a mensagem <mensagem>

    Examples: 
      | usuario           | senha           | mensagem                                                      |
      | "standard_user"   | "senhaInvalida" | "erro Username and password do not match any user in this service" |
      | "locked_out_user" | "secret_sauce"  | "Epic sadface: Sorry, this user has been locked out."                       |

    @LoginResumido
    Scenario: Realizar login com passos resumidos
    Given Que acessei o site da loja
    When Eu fizer login com usuário "standard_user" e senha "secret_sauce"
    Then A página principal será exibida