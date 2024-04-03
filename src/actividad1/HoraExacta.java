package actividad1;

public class HoraExacta extends Hora {
    private int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);

        if (segundos >= 0 && segundos <= 60) {
            this.segundos = segundos;
        } else {
            this.segundos = 0;
        }
    }
	/**
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}
    public boolean setSegundo(int valor) {
        if (valor >= 0 && valor <= 59) {
            segundos = valor;
            return true;
        } else {
            return false;
        }
    }

    public void inc() {
        if (segundos < 59) {
            segundos++;
        } else {
            segundos = 0;
            super.inc();
        }
    }

    public String toString() {
        return super.toString() + ":" + (segundos < 10 ? "0" + segundos : segundos);
    }


}
