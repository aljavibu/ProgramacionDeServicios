package Procesos;
import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;

public class PlanificadorShorterTimeFirst {

	ArrayList<Proceso> procesos = new ArrayList<Proceso>(); // Create an ArrayList object
	Proceso procesoEnEjecucion;

	
	public PlanificadorShorterTimeFirst() {
	}

	public void put(Proceso procesoAIntroducir) {

		procesos.add(procesoAIntroducir);

	}

	public void ordenar() {
		Collections.sort(procesos);
	}

	public void sirve() throws InterruptedException {
		Proceso procesoPorPantalla;
		for (int i = 0; i < procesos.size(); i++) {
			procesoPorPantalla=procesos.get(i);
			System.out.println("Proceso "+procesoPorPantalla.getNombre()+" duracion "+procesoPorPantalla.getDuracion());
			Thread.sleep(procesoPorPantalla.getDuracion());
			System.out.println("Fin de proceso");

		}
	}

}
