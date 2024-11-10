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
		int y = this.getClassificacao();
		if (y < 0 && y >= 0 && y < 1) {
			x = "*";
		} else if (y >= 1 && y < 2) {
			x = "⭐";
		} else if (y >= 2 && y < 3) {
			x = "⭐⭐";
		} else if (y >= 3 && y < 4) {
			x = "⭐⭐⭐";
		} else if (y >= 4 && y < 5) {
			x = "⭐⭐⭐⭐";
		} else if (y >= 5) {
			x = "⭐⭐⭐⭐⭐";
		}
		return x;
	}
}
