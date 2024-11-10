package br.com.spotflix.modelos;

import br.com.spotflix.operacoes.ApresentacaoDados;

public class Musica extends Audio implements ApresentacaoDados{
	private String genero;
	private String artista;
	private String album;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public void showDados() {
		System.out.println("Nome da musica: " + this.getTitulo());
		System.out.println("Nome do album: " + this.getAlbum());
		System.out.println("Nome do(a) artista: " + this.getArtista());
		System.out.println("Duracao da musica: " + this.getDuaracao() + " min");
		System.out.println("Genero: " + this.getGenero());
	}

	@Override
	public void showAvaliacoes() {
		System.out.println("A avaliacao da musica eh de: " + this.getClassificacao() + " " + estrelas());
		
	}
	
	

}
