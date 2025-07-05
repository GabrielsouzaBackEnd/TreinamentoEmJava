import br.com.alura.ScreenMatch.Desafio.Musica;
import br.com.alura.ScreenMatch.Desafio.Podcast;
import br.com.alura.ScreenMatch.calculos.CalculadorDeTempo;
import br.com.alura.ScreenMatch.calculos.FiltroRecomendacao;
import br.com.alura.ScreenMatch.modelos.Episodio;
import br.com.alura.ScreenMatch.modelos.Filme;
import br.com.alura.ScreenMatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
       Filme meuFilme = new Filme();
       meuFilme.setNome(" O poderoso chefão ");
       meuFilme.setAnoDeLancamento(1972);
       meuFilme.setDuracaoEmMinutos(175);
       System.out.println("Duração do Filme : " + meuFilme.getDuracaoEmMinutos());

       meuFilme.exibirFichaTecnica();
       meuFilme.avaliar( 10);
       meuFilme.avaliar(7);
       meuFilme.avaliar(5);
       System.out.println("Total de Avalições " + meuFilme.getTotalDeAvaliacoes());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        System.out.println(meuFilme.pegaMedia());

      Serie lost = new Serie();
      lost.setNome("Lost");
      lost.setAnoDeLancamento(2000);
      lost.exibirFichaTecnica();
      lost.setTemporadas(10);
      lost.setEpisodiosPorTemporada(10);
      lost.setMinutoPorEpisodio(50);
      System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadorDeTempo calculadora = new CalculadorDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.Filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);
        filtro.Filtra(episodio);

        Musica musica = new Musica();
        musica.setArtista("Luan Santana ");
        musica.setAlbum("Luan City ");

        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }
        for (int i = 0; i < 1000; i++) {
            musica.curtir();
        }
        Podcast podcast = new Podcast();
        podcast.setTitulo("Serjão dos Foguetes #1");
        podcast.setHost("Sejão");

        for (int i = 0; i < 1000; i++) {
            podcast.reproduzir();
        }
        for (int i = 0; i < 1000; i++) {
            podcast.curtir();
        }
    }
}
