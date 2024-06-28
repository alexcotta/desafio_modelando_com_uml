package edu.desafio_uml_poo.model;

public interface Reproducao {
	String musica = "";
	
	public void tocar();
	
	public void pausar();
	
	public void selecionarMusica(String musica);
}
