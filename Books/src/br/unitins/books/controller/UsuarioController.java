package br.unitins.books.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.books.models.Usuario;

@Named
@ViewScoped
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = -563227102506849534L;

	private Usuario usuario;
	
	public void incluir(){
		System.out.println(getUsuario().getNome());
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
