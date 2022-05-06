package model;

public class Usuario {
	private Integer idUsuario;
	private String nomeUsuario;
	private String email;
	private String senha;
	private Playlist playlist;
	
	//poderia usar lommbok??? Pesquisar como faz
	public Playlist getPlaylist() {
		return playlist;
	}
	
	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
	
	public Integer getId() {
		return idUsuario;
	}
	
	public void setId(Integer id) { //talvez nao precise...
		this.idUsuario = id;
	}
	
	public String getNome() {
		return nomeUsuario;
	}
	
	public void setNome(String nome) {
		this.nomeUsuario = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
