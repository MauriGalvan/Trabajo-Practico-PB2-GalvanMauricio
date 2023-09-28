package clases;

import java.time.LocalDate;

public class CicloLectivo {

	private LocalDate inicioCuatrimestre;
	private LocalDate finCuatrimestre;
	private LocalDate inicioInscripcion;
	private LocalDate finInscripcion;
	private Integer id;

	public CicloLectivo(Integer id, LocalDate inicioCuatrimestre, LocalDate finCuatrimestre, LocalDate inicioInscripcion,
			LocalDate finInscripcion) {
		this.inicioCuatrimestre = inicioCuatrimestre;
		this.finCuatrimestre = finCuatrimestre;
		this.inicioInscripcion = inicioCuatrimestre;
		this.finInscripcion = finCuatrimestre;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getInicioCuatrimestre() {
		return inicioCuatrimestre;
	}

	public void setInicioCuatrimestre(LocalDate inicioCuatrimestre) {
		this.inicioCuatrimestre = inicioCuatrimestre;
	}

	public LocalDate getFinCuatrimestre() {
		return finCuatrimestre;
	}

	public void setFinCuatrimestre(LocalDate finCuatrimestre) {
		this.finCuatrimestre = finCuatrimestre;
	}

	public LocalDate getInicioInscripcion() {
		return inicioInscripcion;
	}

	public void setInicioInscripcion(LocalDate inicioInscripcion) {
		this.inicioInscripcion = inicioInscripcion;
	}

	public LocalDate getFinInscripcion() {
		return finInscripcion;
	}

	public void setFinInscripcion(LocalDate finInscripcion) {
		this.finInscripcion = finInscripcion;
	}

}
