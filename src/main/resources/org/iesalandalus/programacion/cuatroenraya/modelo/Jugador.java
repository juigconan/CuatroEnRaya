package org.iesalandalus.programacion.cuatroenraya.modelo;

public class Jugador {

	private String nombre;
	private Ficha colorFichas;
	
	public Jugador (String nombre, Ficha colorFicha) {
		setNombre(nombre);
		setColorFichas(colorFicha);
	}

	public String getNombre() {
		return nombre;
	}

	public Ficha getColorFichas() {
		return colorFichas;
	}

	private void setNombre(String nombre) {
		if(nombre == null) {
			throw new NullPointerException("ERROR: El nombre no puede ser nulo.");
		}
		if(nombre.isBlank()) {
			throw new IllegalArgumentException("ERROR: El nombre no puede estar vacío.");
		}
		this.nombre = nombre;
	}

	private void setColorFichas(Ficha colorFichas) {
		if(colorFichas == null) {
			throw new NullPointerException("ERROR: El color de las fichas no puede ser nulo.");
		}
		this.colorFichas = colorFichas;
	}
	
	@Override
	public String toString() {
	return String.format("%s (%s)",nombre, colorFichas.name());
	}

}
