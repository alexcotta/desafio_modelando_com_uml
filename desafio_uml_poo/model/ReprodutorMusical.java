package edu.desafio_uml_poo.model;

import java.util.List;

public class ReprodutorMusical extends Aplicativo implements Reproducao, Colecao{

	public ReprodutorMusical(String nome, double id) {
		super(nome, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> criarColecao(String nomeColecao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean adicionarItem(String nomeMusida) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void tocar() {
		System.out.println(">> Música tocando.");
		
	}

	@Override
	public void pausar() {
		System.out.println(">> Música pausada.");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println(">> Música selecionada: " + musica);
		
	}

}
