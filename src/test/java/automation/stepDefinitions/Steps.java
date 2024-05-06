package automation.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
//imports selenium
import org.openqa.selenium.WebDriver;

import automation.actions.LoginActions;
import automation.functions.LoginFunctions;
import automation.hooks.Hooks;
import automation.pages.HomeLojaPage;
import automation.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Steps {
	
	private WebDriver driver = Hooks.getWebDriver();

	@Given("^Que acessei o site da loja$")
	public void que_acessei_o_site_da_loja() throws Throwable {
	    driver.get("https://www.saucedemo.com/v1/");
	}

	// Nivel 1 = Identificação e interação com o elemento direto pelo step definition
	@When("^Eu preencher o usuario \"(.*?)\"$")
	public void eu_preencher_o_usuario(String user) throws Throwable {
		driver.findElement(By.id("user-name")).sendKeys(user);
	}

	// Nivel 2 = Uso de Page Objects para identificação, interação pelo step definition
	@When("^Eu preencher a senha \"(.*?)\"$")
	public void eu_preencher_a_senha(String password) throws Throwable {
		new LoginPage().campoSenha.sendKeys(password);
	}

	// Nivel 3 = Uso de Actions, identificação e interação centralizada na action
	@When("^Clicar em Login$")
	public void fizer_login() throws Throwable {
		new LoginActions().click_login();
	}

	// Nivel 2 + Asserção
	@Then("^A página principal será exibida$")
	public void a_página_principal_será_exibida() throws Throwable {
	    String titulo = new HomeLojaPage().get_titulo();
	    Assert.assertEquals("Produtos",titulo);
	}	
	
	// Nivel 3 com asserção na action
	@Then("^será exibida a mensagem \"(.*?)\"$")
	public void será_exibida_a_mensagem(String msg_erro) throws Throwable {
	    new LoginActions().valida_msg_erro(msg_erro);
	}
	
	// Nivel 4, uso de functions para features otimizadas
	@When("^Eu fizer login com usuário \"(.*?)\" e senha \"(.*?)\"$")
	public void eu_fizer_login_com_usuário_e_senha(String user, String senha) throws Throwable {
	    new LoginFunctions().realizaLogin(user, senha);
	}
	
}
