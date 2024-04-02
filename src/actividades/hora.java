/**
 * 
 */
package actividades;

/** 
 * 
 */

 class hora {
	private int minutos;
	private int horas;

	

	hora() {

	}

	hora(int minutos, int horas) {
		this.minutos = minutos;
		this.horas = horas;
		this.segundos = segundos;
	}

	public void inc() {
		this.minutos = this.minutos + 1;

	}

	public boolean setMinutosa(int minutos) {
		boolean setMinutosa = false;
		if (minutos >= 0) {
			setMinutos(minutos);
			setMinutosa = true;
		}
		return setMinutosa;

	}

	boolean setHora(int horas) {
		boolean setHora = false;
		if (horas >= 0 && horas < 23) {
			setHoras(horas);
			setHora = true;
		}
		return setHora;

	}

	public String toString() {
		String hora = "La hora es  " + this.horas + ":" + this.minutos;
		return hora;

	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	/**
	 * 
	 */
	
}

