package edu.desafio_uml_poo.model;

public interface Telefone {

	String numero = "";
	
	public void ligar(String numero);
	
	public void atender();
	
	public void iniciarCorreioVoz();
}
