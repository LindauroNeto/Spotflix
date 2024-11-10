package br.com.spotlfix;
import br.com.spotflix.modelos.Musica;
import br.com.spotflix.modelos.Podcast;
import br.com.spotflix.operacoes.CalculoClassificacao;

public class Principal {

	public static void main(String[] args) {
		Musica musica1 = new Musica();
		Podcast podcast1 = new Podcast();
		CalculoClassificacao classificador = new CalculoClassificacao();
		
		musica1.setTitulo("Like Him");
		musica1.setAlbum("CHROMAKOPIA");
		musica1.setArtista("Tyler, the Creator");
		musica1.setDuaracao(4);
		musica1.setGenero("Pop");
		
		podcast1.setTitulo("GLORIA GROOVE - Flow #406");
		podcast1.setNomeDoPodcast("Flow Podcast");
		podcast1.setDescricao("Gloria Groove é cantora e compositora...");
		podcast1.setHosts("Igor");
		podcast1.setNumeroDoEpisodio(406);
		podcast1.setDuaracao(106);
		
		musica1.showDados();
		for (int i = 0; i < 4742; i++) {
			musica1.reproduzir();
		}
		for (int i = 0; i < 3180; i++) {
			musica1.curtir();
		}
		
		classificador.obterClassificacao(musica1);
		musica1.showAvaliacoes();
		
		System.out.println();
		
		podcast1.showDados();
		for (int i = 0; i < 572; i++) {
			podcast1.reproduzir();
		}
		for (int i = 0; i < 312; i++) {
			podcast1.curtir();
		}
		
		classificador.obterClassificacao(podcast1);
		podcast1.showAvaliacoes();
		
	}

}
