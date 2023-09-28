package clases;

import java.util.ArrayList;

public class Materia {

	private Integer id;
	private String nombre;
	 private ArrayList<Materia> correlativas;
	public Materia(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.correlativas = new ArrayList<Materia>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Materia> getCorrelativas() {
		return correlativas;
	}

	public void setCorrelativas(ArrayList<Materia> correlativas) {
		this.correlativas = correlativas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarCorrelativa(Materia materiaCorrelativa) {
		correlativas.add(materiaCorrelativa);
		
	}

	public boolean tieneCorrelativa(Integer id) {
		for (Materia correlativa : correlativas) {
			if(correlativa.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

}
