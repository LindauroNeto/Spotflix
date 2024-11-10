package br.com.spotflix.operacoes;

import br.com.spotflix.modelos.Audio;

public class CalculoClassificacao {
	
	public float porcentagemAprovacao(Audio audio) {
		return (audio.getCurtidas()*100/audio.getTotalReproducoes());
	}
	
	public void obterClassificacao(Audio audio) {
		int x = (int) this.porcentagemAprovacao(audio)*5/100;
		audio.setClassificacao(x);
	}
}
