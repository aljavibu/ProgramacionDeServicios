package Procesos;

public class Proceso  implements Comparable<Proceso>{
	private int duracion;
	private static int contadorNombre=0;
	private String nombre;
	
	public Proceso(int duración) {
	
		this.duracion = duración;
		this.nombre ="P_"+contadorNombre;
		//Incluyo una variable estatica que pondra automaticamente el nombre a los procesos
		contadorNombre++;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duración) {
		this.duracion = duración;
	}
	@Override
	public String toString() {
		return "Proceso [duracion=" + duracion + ", nombre=" + nombre + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int compareTo(Proceso p) {
		if(p.getDuracion()>duracion) {
			return -1;
		}else if(p.getDuracion()==duracion) {
			return 0;
		}else
		return 1;
	}
	
}
