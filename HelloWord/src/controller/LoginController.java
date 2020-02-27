package controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginController {
	
	private String login;
	private String senha;
	
	public String entrar() {
		if(login.equals("joao") && senha.equals("123")) {
			
			//redirecionar
			return "helloword.xhtml";	
		}
		//if der errado mandar mensagem
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, 
				"Login ou Senha Invalido.", null));
		
		return null;
	}
	public void limpar() {
		login = "";
		senha = "";
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
