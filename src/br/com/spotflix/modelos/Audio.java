package br.com.spotflix.modelos;

public class Audio {
	// Atributos
	private String titulo;
	private int duaracao;
	private int totalReproducoes;
	private int curtidas;
	private int classificacao;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuaracao() {
		return duaracao;
	}

	public void setDuaracao(int duaracao) {
		this.duaracao = duaracao;
	}

	public int getTotalReproducoes() {
		return totalReproducoes;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	
	// Metodos
	public void reproduzir() {
		this.totalReproducoes++;
	}
	
	public void curtir() {
		this.curtidas++;
	}
	
	public String estrelas() {
		String x = "*";
		if (this.getClassificacao() < 0 && this.getClassificacao() >= 0 && this.getClassificacao() < 1) {
			x = "*";
		} else if (this.getClassificacao() >= 1 && this.getClassificacao() < 2) {
			x = "⭐";
		} else if (this.getClassificacao() >= 2 && this.getClassificacao() < 3) {
			x = "⭐⭐";
		} else if (this.getClassificacao() >= 3 && this.getClassificacao() < 4) {
			x = "⭐⭐⭐";
		} else if (this.getClassificacao() >= 4 && this.getClassificacao() < 5) {
			x = "⭐⭐⭐⭐";
		} else if (this.getClassificacao() >= 5) {
			x = "⭐⭐⭐⭐⭐";
		}
		return x;
	}
}
