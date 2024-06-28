package edu.desafio_uml_poo.model;

public abstract class Aplicativo {

	public String nome;
	double id;
	
	public Aplicativo(String nome, double id) {
		
		this.nome = nome;
		this.id = id;
	}
	
	public void abrir() {
		System.out.println(">> Aba aplicativo aberta.");
	}
	
	public void fechar() {
		System.out.println(">> Aba aplicativo fechada.");
	}
}
