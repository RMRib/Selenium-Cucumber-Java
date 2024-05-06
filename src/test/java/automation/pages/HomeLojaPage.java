package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.hooks.Hooks;

public class HomeLojaPage {

	public WebDriver driver;
	
	public WebDriver getDriver() {
		return driver == null?Hooks.getWebDriver():driver;
	}
	
	WebElement txt_titulo = getDriver().findElement(By.cssSelector("#inventory_filter_container > div"));

	
	
	public String get_titulo() {
		String titulo = txt_titulo.getText();
		return titulo;
	}
}
