package edu.desafio_uml_poo.model;

public class Iphone {

	public static void main(String[] args) {
		
		ReprodutorMusical rm = new ReprodutorMusical("mid_player", 1234);
		rm.tocar();
		rm.pausar();
		rm.selecionarMusica("Musica escolhida");

	}

}
