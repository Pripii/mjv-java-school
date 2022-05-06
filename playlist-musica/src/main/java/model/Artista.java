package model;

public class Artista {
	private Integer idArtista;
	private String nomeArtista;
	private List<Musica> musicas; 
	
	public Integer getIdArtista() {
		return idArtista;
	}
	
	public void setIdArtista(Integer idArtista) {
		this.idArtista = idArtista;
	}
	
	public String getNomeArtista() {
		return nomeArtista;
	}
	
	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}
	
	public List<Musica> getMusicas() {
		return musicas;
	}
	
	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}
}
