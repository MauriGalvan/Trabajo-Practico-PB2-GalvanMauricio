package clases;

public class InscripcionMateria {

	private Alumno alumno;
	private Materia materia;

	public InscripcionMateria(Alumno alumno, Materia materia) {
		this.alumno = alumno;
		this.materia = materia;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}
