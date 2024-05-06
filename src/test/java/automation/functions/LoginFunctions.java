package automation.functions;

import automation.actions.LoginActions;

public class LoginFunctions extends LoginActions{
	
	public void realizaLogin(String user, String senha) {
		preencher_user(user);
		preencher_password(senha);
		click_login();
	}

}
