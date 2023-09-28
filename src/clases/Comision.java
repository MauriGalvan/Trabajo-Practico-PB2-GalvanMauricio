package clases;

import java.util.ArrayList;

public class Comision {

	private Integer idcomision;
	private Turno turno;
	private ArrayList<Materia> materia;
	private ArrayList<CicloLectivo>cicloLectivos;
	public Comision(Integer idComision) {
		this.idcomision = idComision;
		
	}

	public Comision(Integer idComision2, Materia materia, CicloLectivo cicloLectivo,Turno turno) {
		this.idcomision = idComision2;
		this.cicloLectivos = new ArrayList<CicloLectivo>();
		this.materia = new ArrayList<Materia>();
		this.turno = turno;
		
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public ArrayList<Materia> getMateria() {
		return materia;
	}

	public void setMateria(ArrayList<Materia> materia) {
		this.materia = materia;
	}

	public ArrayList<CicloLectivo> getCicloLectivos() {
		return cicloLectivos;
	}

	public void setCicloLectivos(ArrayList<CicloLectivo> cicloLectivos) {
		this.cicloLectivos = cicloLectivos;
	}

	public Integer getIdcomision() {
		return idcomision;
	}

	public void setIdcomision(Integer idcomision) {
		this.idcomision = idcomision;
	}

}
