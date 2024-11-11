package br.com.spotflix.modelos;

import br.com.spotflix.operacoes.ApresentacaoDados;

public class Podcast extends Audio implements ApresentacaoDados {
	private String nomeDoPodcast;
	private String descricao;
	private int numeroDoEpisodio;
	private String hosts;

	public String getNomeDoPodcast() {
		return nomeDoPodcast;
	}

	public void setNomeDoPodcast(String nomeDoPodcast) {
		this.nomeDoPodcast = nomeDoPodcast;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumeroDoEpisodio() {
		return numeroDoEpisodio;
	}

	public void setNumeroDoEpisodio(int numeroDoEpisodio) {
		this.numeroDoEpisodio = numeroDoEpisodio;
	}

	public String getHosts() {
		return hosts;
	}

	public void setHosts(String hosts) {
		this.hosts = hosts;
	}

	@Override
	public void showDados() {
		System.out.println("Titulo do episodio: " + this.getTitulo());
		System.out.println("Nome do podcast: " + this.getNomeDoPodcast());
		System.out.println("Numero do episodio: #" + this.getNumeroDoEpisodio());
		System.out.println("Descricao do episodio: " + this.getDescricao());
		System.out.println("Apresentador(es): " + this.getHosts());
		System.out.println("Duracao do episodio: " + this.getDuaracao() + " min");
	}

	@Override
	public void showAvaliacoes() {
		System.out.println("A avaliacao do podcast eh de: " + this.getClassificacao() + " " + estrelas());
		
	}

	@Override
	public String toString() {
		return "Podcast: " + this.getTitulo() + " | " + this.getNomeDoPodcast() + ".";
	}

}
