package dto;
/**
 * BD de los alumnos
 * @author nrojlla 200924
 */

import java.time.LocalDate;

public class AlumnoDto {
	
	long idAlumno;
	String nombreAlumno = "aaaaa";
	String apellidosAlumno = "aaaaa";
	String dniAlumno = "aaaaa";
	String correoAlumno = "aaaaa";
	int telAlumno = 111111;
	LocalDate fchaNacimientoAlumno;
	
	@Override
	public String toString() {
		return "AlumnoDto [idAlumno=" + idAlumno + ", nombreAlumno=" + nombreAlumno + ", apellidosAlumno="
				+ apellidosAlumno + ", dniAlumno=" + dniAlumno + ", correoAlumno=" + correoAlumno + ", telAlumno="
				+ telAlumno + ", fchaNacimientoAlumno=" + fchaNacimientoAlumno + "]";
	}
	/**
	 * @return the idAlumno
	 */
	public long getIdAlumno() {
		return idAlumno;
	}
	/**
	 * @param idAlumno the idAlumno to set
	 */
	public void setIdAlumno(long idAlumno) {
		this.idAlumno = idAlumno;
	}
	/**
	 * @return the nombreAlumno
	 */
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	/**
	 * @param nombreAlumno the nombreAlumno to set
	 */
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	/**
	 * @return the apellidosAlumno
	 */
	public String getApellidosAlumno() {
		return apellidosAlumno;
	}
	/**
	 * @param apellidosAlumno the apellidosAlumno to set
	 */
	public void setApellidosAlumno(String apellidosAlumno) {
		this.apellidosAlumno = apellidosAlumno;
	}
	/**
	 * @return the dniAlumno
	 */
	public String getDniAlumno() {
		return dniAlumno;
	}
	/**
	 * @param dniAlumno the dniAlumno to set
	 */
	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}
	/**
	 * @return the correoAlumno
	 */
	public String getCorreoAlumno() {
		return correoAlumno;
	}
	/**
	 * @param correoAlumno the correoAlumno to set
	 */
	public void setCorreoAlumno(String correoAlumno) {
		this.correoAlumno = correoAlumno;
	}
	/**
	 * @return the telAlumno
	 */
	public int getTelAlumno() {
		return telAlumno;
	}
	/**
	 * @param telAlumno the telAlumno to set
	 */
	public void setTelAlumno(int telAlumno) {
		this.telAlumno = telAlumno;
	}
	/**
	 * @return the fchaNacimientoAlumno
	 */
	public LocalDate getFchaNacimientoAlumno() {
		return fchaNacimientoAlumno;
	}
	/**
	 * @param fchaNacimientoAlumno the fchaNacimientoAlumno to set
	 */
	public void setFchaNacimientoAlumno(LocalDate fchaNacimientoAlumno) {
		this.fchaNacimientoAlumno = fchaNacimientoAlumno;
	}
	
	
}
