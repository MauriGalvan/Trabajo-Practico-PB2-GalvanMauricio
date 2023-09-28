package test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import clases.Alumno;
import clases.CicloLectivo;
import clases.Comision;
import clases.Curso;
import clases.Docente;
import clases.Materia;
import clases.Turno;
import clases.Universidad;

public class TestUniversidad {
	
	@Test
	public void QueSePuedaRegistrarAlumno(){
		String nombre = "Unlam";		
		Universidad unlam = new Universidad(nombre);				
		nombre = "mau";
		String apellido = "galvan";
		Integer dni = 123;
		Alumno alumno = new Alumno(dni,apellido,nombre);
		
		boolean registroExistoso = unlam.registrarAlumno(alumno);
		assertTrue(registroExistoso);		
	}
	@Test
	public void QueNoSePuedaRegistrarAlumnoCuandoElAlumnoYaEsteRegistrado(){		
		Universidad unlam = new Universidad("Unlam");				
		Alumno alumno = new Alumno(123,"galvan","mau");
		Alumno alumno2 = new Alumno(123,"galvan","mau");
		unlam.registrarAlumno(alumno);		
		boolean registroExistoso = unlam.registrarAlumno(alumno2);
		assertFalse(registroExistoso);				
	}
	@Test
	public void QueSePuedaRegistrarMateria(){
		String nombre = "Unlam";		
		Universidad unlam = new Universidad(nombre);				
		nombre = "pb2";
		Integer id = 1;		
		Materia pb2 = new Materia(id,nombre);		
		boolean registroMateriaExitoso = unlam.registrarMateria(pb2);		
		assertTrue(registroMateriaExitoso);							
	}
	@Test
	public void QueSePuedaInscribirUnAlumnoEnUnaMateria(){
		String nombre = "Unlam";		
		Universidad unlam = new Universidad(nombre);
		Integer dni = 123;
		Alumno alumno = new Alumno(dni ,"galvan","mau");			
		Integer id = 1;
		Materia pb2 = new Materia(id,"pb2");		
		unlam.registrarAlumno(alumno);		
		unlam.registrarMateria(pb2);		
		assertTrue(unlam.inscribirAlumnoAUnaMateria(dni,id));		
	}

	@Test
	public void QueSePuedaCrearCicloLectivo (){
		
		Universidad unlam = new Universidad("unlam");
		CicloLectivo cicloLectivo;
		 Integer id = 1;
		LocalDate InicioCuatrimestre = LocalDate.of(2023, 8, 15);
		LocalDate FinCuatrimestre = LocalDate.of(2023, 12, 2);
		LocalDate InicioInscripcion= LocalDate.of(2023, 7, 15);
		LocalDate FinInscripcion = LocalDate.of(2023, 8, 1);
		
		cicloLectivo = new CicloLectivo(id,InicioCuatrimestre,FinCuatrimestre,InicioInscripcion,FinInscripcion);
		
		unlam.agregarCicloLectivo(cicloLectivo);
		assertEquals(id, cicloLectivo.getId());
		
		
	}
	
	@Test
	public void QueNoSePuedaDuplicarElMismoCicloLectivo (){
		Universidad unlam = new Universidad("unlam");
		CicloLectivo cicloLectivo;
		
		Integer id = 1;
		
		LocalDate InicioCuatrimestre = LocalDate.of(2023, 8, 15);
		LocalDate FinCuatrimestre = LocalDate.of(2023, 12, 2);
		LocalDate InicioInscripcion= LocalDate.of(2023, 7, 15);
		LocalDate FinInscripcion = LocalDate.of(2023, 8, 1);
		CicloLectivo cicloLectivo2;
		Integer id2 = 1;
		LocalDate InicioCuatrimestre2 = LocalDate.of(2023, 8, 15);
		LocalDate FinCuatrimestre2 = LocalDate.of(2023, 12, 2);
		LocalDate InicioInscripcion2= LocalDate.of(2023, 7, 15);
		LocalDate FinInscripcion2 = LocalDate.of(2023, 8, 1);
	
		cicloLectivo = new CicloLectivo(id,InicioCuatrimestre,FinCuatrimestre,InicioInscripcion,FinInscripcion);
		cicloLectivo2 = new CicloLectivo(id2,InicioCuatrimestre2,FinCuatrimestre2,InicioInscripcion2,FinInscripcion2);
		
	unlam.agregarCicloLectivo(cicloLectivo);
	
	boolean asignacionExitosa = unlam.agregarCicloLectivo(cicloLectivo2);
	assertFalse(asignacionExitosa);
		
		
		
	}
	@Test
	public void QueSePuedaCrearCurso(){
		
		Universidad unlam = new Universidad("unlam");
		Integer id = 1;
		
		String nombre = "pb1";
		
		Curso pb1 = new Curso(id,nombre);
		Integer ve=1;
		unlam.agregarCurso(pb1);
		assertEquals(ve, pb1.getId());	
	}
	
	
	
	
	@Test
	public void QueSePuedaCrearDocente(){
		String nombre = "Unlam";		
		Universidad unlam = new Universidad(nombre);				
		nombre = "profe";
		String apellido = "galvan";
		Integer	idDocente = 12;
		Docente docente = new Docente(idDocente,apellido,nombre);
		Integer ve = 12;
		unlam.registrarDocente(docente);
		assertEquals(ve, docente.getDni());
		  
			
	}
	@Test
	public void queSePuedaGenerarComisiones(){		
		Universidad unlam = new Universidad("unlam");	
		
		Integer idComision = 1;
		Materia materia = new Materia (01,"pb1");
		LocalDate InicioCuatrimestre = LocalDate.of(2023, 8, 15);
		LocalDate FinCuatrimestre = LocalDate.of(2023, 12, 2);
		LocalDate InicioInscripcion= LocalDate.of(2023, 7, 15);
		LocalDate FinInscripcion = LocalDate.of(2023, 8, 1);
		CicloLectivo cicloLectivo = new CicloLectivo(idComision, InicioCuatrimestre, FinCuatrimestre, InicioInscripcion, FinInscripcion);
		
		
		Comision comision = new Comision(idComision);
		unlam.generarComision(comision);
	}
	@Test
	public void queNoSePuedaGenerar2ComisionesIGUALES(){		
		Universidad unlam = new Universidad("unlam");	
		
		Integer idComision = 1;
		Materia materia = new Materia (01,"pb1");
		LocalDate InicioCuatrimestre = LocalDate.of(2023, 8, 15);
		LocalDate FinCuatrimestre = LocalDate.of(2023, 12, 2);
		LocalDate InicioInscripcion= LocalDate.of(2023, 7, 15);
		LocalDate FinInscripcion = LocalDate.of(2023, 8, 1);
		CicloLectivo cicloLectivo = new CicloLectivo(idComision, InicioCuatrimestre, FinCuatrimestre, InicioInscripcion, FinInscripcion);
		
		Integer idComision2 = 1;
		Materia materia2 = new Materia (01,"pb1");
		LocalDate InicioCuatrimestre2 = LocalDate.of(2023, 8, 15);
		LocalDate FinCuatrimestre2 = LocalDate.of(2023, 12, 2);
		LocalDate InicioInscripcion2= LocalDate.of(2023, 7, 15);
		LocalDate FinInscripcion2 = LocalDate.of(2023, 8, 1);
		CicloLectivo cicloLectivo2 = new CicloLectivo(idComision2, InicioCuatrimestre2, FinCuatrimestre2, InicioInscripcion2, FinInscripcion2);
		Comision comision1 = new Comision(idComision,materia,cicloLectivo,Turno.mañana);
		Comision comision2 = new Comision(idComision2,materia2,cicloLectivo2,Turno.mañana);
		unlam.generarComision(comision1);
		
		boolean generacionExitosa = unlam.generarComision(comision2);
		assertFalse(generacionExitosa);
		
	}
	@Test
    public void QueSePuedaAsignarMateriaCorrelativa() {
	Universidad unlam = new Universidad("unlam");	
		
		Materia materiaCorrelativa = new Materia (1,"pb1");
		unlam.registrarMateria(materiaCorrelativa);
		Materia materiaPrincipal = new Materia (2,"pb2");
		unlam.registrarMateria(materiaPrincipal);

        assertTrue(unlam.asignarMateriaCorrelativa(1, 2));
      
    }

	@Test
	public void QueSePuedaEliminarCorrelativa(){
		
	}
	@Test
	public void QueSePuedaInscribirAlumnoACurso(){
		
	}
	
	
	
	
	
	
	
	
	
}
