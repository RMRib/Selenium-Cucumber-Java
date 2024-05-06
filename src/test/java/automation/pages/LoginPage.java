package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.hooks.Hooks;

public class LoginPage {

	public WebDriver driver;
	
	public WebDriver getDriver() {
		return driver == null?Hooks.getWebDriver():driver;
	}

	//Listagem de todos os elementos presentes na página de login
	public WebElement campoUsuario = getDriver().findElement(By.id("user-name"));
	public WebElement campoSenha = getDriver().findElement(By.name("password"));
	public WebElement botaoLogin = getDriver().findElement(By.xpath("//*[@id=\"login-button\"]"));
	
	
	public WebElement msgErro() {
		WebElement msgErro = getDriver().findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/h3"));
		return msgErro;
	}
}