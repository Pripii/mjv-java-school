package model;

public class Musica {
	private Integer idMusica;
	private String nomeMusica;
	private String album;
	private Genero generoMusical;
	private Double duracao;
	private Artista cantorBanda;
	
	public Integer getIdMusica() {
		return idMusica;
	}
	
	public void setIdMusica(Integer idMusica) {
		this.idMusica = idMusica;
	}
	
	public String getNomeMusica() {
		return nomeMusica;
	}
	
	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public Genero getGeneroMusical() {
		return generoMusical;
	}
	
	public void setGeneroMusical(Genero generoMusical) {
		this.generoMusical = generoMusical;
	}
	
	public Double getDuracao() {
		return duracao;
	}
	
	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}
	
	public Artista getCantorBanda() {
		return cantorBanda;
	}
	
	public void setCantorBanda(Artista cantorBanda) {
		this.cantorBanda = cantorBanda;
	}
	
}
