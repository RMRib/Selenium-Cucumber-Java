package automation.actions;

import org.openqa.selenium.WebElement;
import automation.hooks.Hooks;
import automation.pages.LoginPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginActions extends LoginPage{
	
	// metodos para interação com os elementos identificados na LoginPage, 
	public void preencher_user(String user) {
		campoUsuario.sendKeys(user);
	}
	
	public void preencher_password(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void click_login() {
		botaoLogin.click();
	}

	public void valida_msg_erro(String msg_erro) {
		String msg = msgErro().getText();
		System.out.println(msg);
		Assert.assertEquals(msg_erro,msg);
	}
}
