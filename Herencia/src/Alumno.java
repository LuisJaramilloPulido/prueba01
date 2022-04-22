
public class Alumno extends Persona {
	private long numMatricula;
	private int creditosAprobados;

	public Alumno() {
		numMatricula = -1;
		creditosAprobados = 0;
	}

	public long getNumMatricula() {
		return numMatricula;
	}

	public long getCreditosAprobados() {
		return creditosAprobados;
	}

	public void setNumMatricula(int m) {
		numMatricula = m;
	}

	public void setCreditosAprobados(int c) {
		creditosAprobados = c;
	}

	public String toString() {// overriding the toString() method
		return this.getDni() + " " + this.getNombre() + " " + numMatricula + " " + creditosAprobados;
	}

}
