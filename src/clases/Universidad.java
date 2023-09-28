package clases;

import java.util.ArrayList;
import java.util.HashSet;

public class Universidad {
	private String nombre;
	private ArrayList<Alumno> alumnos;
	private ArrayList<Materia> materias;
	private ArrayList<InscripcionMateria> inscripcionesMateria;
	private ArrayList<CicloLectivo> cicloLectivos;
	private ArrayList<Docente> docentes;
	private HashSet<Curso> cursos;
	private ArrayList<Comision> comisiones;
	public Universidad(String nombre) {
		this.nombre = nombre;
		this.alumnos = new ArrayList<Alumno>();
		this.materias = new ArrayList<Materia>();
		this.inscripcionesMateria = new ArrayList<InscripcionMateria>();
		this.cicloLectivos = new ArrayList<CicloLectivo>();
		this.docentes = new ArrayList<Docente>();
		this.cursos = new HashSet<Curso>();
		this.comisiones = new ArrayList<Comision>();
	}

public Comision existeComision(Integer idComision) {
		
		for (Comision comision : comisiones) {
			if(comision.getIdcomision().equals(idComision)) {
				return comision;
			}
		}
		return null;
		
	}
public boolean generarComision(Comision idComision) {
	if(existeComision(idComision.getIdcomision())==null) {
		return comisiones.add(idComision);
	}
	return false;
	
}

	public boolean registrarAlumno(Alumno alumno) {
		
		if(BuscarAlumnoPorDni(alumno.getDni())== null) {
		return alumnos.add(alumno);
		}
		return false;
	}

	
	public Alumno BuscarAlumnoPorDni(Integer dni) {
		
		for (Alumno alumno : alumnos) {
			if(alumno.getDni().equals(dni)) {
				return alumno;
			}
		}
		
		
		return null;
	}
	

	public boolean registrarMateria(Materia materia) {
		if(BuscarMateriaPorID(materia.getId()) == null)
			return materias.add(materia);
		
		
		return false;
		
		
	}

	private Materia BuscarMateriaPorID(Integer id) {
		
		for (Materia materia : materias) {
			if(materia.getId().equals(id)) {
				return materia;
			}
		}
		return null;
		
	}

	public boolean inscribirAlumnoAUnaMateria(Integer dni, Integer id) {
		Alumno alumno = this.BuscarAlumnoPorDni(dni);
		Materia materia = this.BuscarMateriaPorID(id);
		
		if(alumno != null && materia !=null) {
		InscripcionMateria inscripcionMateria = new InscripcionMateria(alumno,materia);
		return this.inscripcionesMateria.add(inscripcionMateria);
		}
		return false;
	}
	public boolean asignarMateriaCorrelativa(Integer codigoMateria, Integer codigoMateriaCorrelativa) {
	    Materia materiaPrincipal = BuscarMateriaPorID(codigoMateria);
	    Materia materiaCorrelativa = BuscarMateriaPorID(codigoMateriaCorrelativa);


	    if (materiaPrincipal != null && materiaCorrelativa != null) {
	        materiaPrincipal.agregarCorrelativa(materiaCorrelativa);
	        return true;
	    }

	    return false;
	}

	
	public boolean agregarCicloLectivo(CicloLectivo cicloLectivo) {
		if(buscarCicloLectivoPorID(cicloLectivo.getId())== null )
			
			return cicloLectivos.add(cicloLectivo);
		
		return false;
	}
	
	
	public CicloLectivo buscarCicloLectivoPorID(Integer id) {
		
		for (CicloLectivo ciclolectivo : cicloLectivos) {
			if(ciclolectivo.getId().equals(id)) {
				return ciclolectivo;
			}
		
	}
		return null;
	}

	
	
	
	
	
	
	
	
	
	public void registrarDocente(Docente docente) {
		
		
		docentes.add(docente);
	}

	public void agregarCurso(Curso pb1) {
		cursos.add(pb1);
		
	}

	

	
	
	
	
	
	
	
	
	



}
