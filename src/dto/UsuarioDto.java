package dto;

public class UsuarioDto {
	private long idUsuario;
	private String nombreUsuario = "aaaaa";
	private String contUsuario = "aaaaa";
	private String descUsuario = "aaaaa";
	private String enlaceImagenUsuario = "aaaaa";
	
	/**
	 * @return the enlaceImagenUsuario
	 */
	public String getEnlaceImagenUsuario() {
		return enlaceImagenUsuario;
	}
	/**
	 * @param enlaceImagenUsuario the enlaceImagenUsuario to set
	 */
	public void setEnlaceImagenUsuario(String enlaceImagenUsuario) {
		this.enlaceImagenUsuario = enlaceImagenUsuario;
	}
	/**
	 * @return the idUsuario
	 */
	public long getIdUsuario() {
		return idUsuario;
	}
	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	/**
	 * @return the descUsuario
	 */
	public String getDescUsuario() {
		return descUsuario;
	}
	/**
	 * @param descUsuario the descUsuario to set
	 */
	public void setDescUsuario(String descUsuario) {
		this.descUsuario = descUsuario;
	}
	/**
	 * @return the contUsuario
	 */
	public String getContUsuario() {
		return contUsuario;
	}
	/**
	 * @param contUsuario the contUsuario to set
	 */
	public void setContUsuario(String contUsuario) {
		this.contUsuario = contUsuario;
	}
}
