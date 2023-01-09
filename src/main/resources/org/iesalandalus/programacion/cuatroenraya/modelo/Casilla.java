package org.iesalandalus.programacion.cuatroenraya.modelo;

import javax.naming.OperationNotSupportedException;

public class Casilla {

	private Ficha ficha;

	public Casilla() {
		ficha = null;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) throws OperationNotSupportedException {
		if(ficha == null) {
			throw new NullPointerException("ERROR: No se puede poner una ficha nula.");
		}
		if (estaOcupada()) {
			throw new OperationNotSupportedException("ERROR: Ya contengo una ficha.");
		}
		this.ficha = ficha;
	}

	public boolean estaOcupada() {
		boolean ocupado = true;
		if (ficha == null) {
			ocupado = false;
		}
		return ocupado;
	}

	@Override
	public String toString() {
		return String.format("%s", ficha == null ? " " : ficha.name().charAt(0));
	}

}