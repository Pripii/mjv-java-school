package model;

public class Playlist {
	private Integer idPlaylist;
	private String nomePlaylist;
	private Genero generoMusical;
	private List<Musica> musicas;
	
	public Genero getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(Genero generoMusical) {
		this.generoMusical = generoMusical;
	}

	public List<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<Musica> musicas) {
		this.musicas = musicas;
	}

	public Integer getIdPlaylist() {
		return idPlaylist;
	}
	
	public void setIdPlaylist(Integer idPlaylist) {
		this.idPlaylist = idPlaylist;
	}
	
	public String getNomePlaylist() {
		return nomePlaylist;
	}
	
	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}	
}
