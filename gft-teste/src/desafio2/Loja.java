package desafio2;

import java.util.List;
public class Loja {
	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;

	public Loja() {

	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	public void listaLivros() {
		if (this.livros != null) {

			for (Livro livro : this.livros) {
				System.out.println(livro.toString());
			}

		} else {
			System.out.println("A loja não tem livros no seu estoque");
		}
	}

	public void listaVideoGames() {
		if (this.videoGames != null) {

			for (VideoGame videoGame : this.videoGames) {
				System.out.println(videoGame.toString());
			}

		} else {
			System.out.println("A loja não tem livros no seu estoque");
		}
	}

	public Double calcularPatrimonio() {
		Double patrimonioVideoGame = 0.0;
		Double patrimonioLivro = 0.0;
		Double total = 0.0;

		for (VideoGame videoGame : this.videoGames) {
			patrimonioVideoGame = videoGame.getPreco() * videoGame.getQtd();
			total = total + patrimonioVideoGame;
		}

		for (Livro livro : this.livros) {
			patrimonioLivro = livro.getPreco() * livro.getQtd();
			total = total + patrimonioLivro;
		}

		return total;
	}

}