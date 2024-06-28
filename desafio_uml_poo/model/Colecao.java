package edu.desafio_uml_poo.model;

import java.util.List;

public interface Colecao {
	
	String nomeColecao = "";
	String nomeMusica = "";
	
	public List<String> criarColecao(String nomeColecao);
	
	public boolean adicionarItem(String nomeMusida);
}
