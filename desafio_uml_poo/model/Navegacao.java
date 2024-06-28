package edu.desafio_uml_poo.model;

public interface Navegacao {

	String url = "";
	
	public String exibirPagina(String url);
	
	public boolean adicionarNovaAba();
	
	public void atualizarPagina();
}
