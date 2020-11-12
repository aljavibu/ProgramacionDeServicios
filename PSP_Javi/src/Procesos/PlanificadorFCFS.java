package Procesos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PlanificadorFCFS {

	Queue<Proceso> colaProcesos = new LinkedList<>();
	Proceso procesoEnEjecucion;

	public PlanificadorFCFS() {

	}

	public Proceso get() {
		// Devuelve el ultimo proceso de la cola y lo elimina

		return colaProcesos.poll();

	}

	public void put(Proceso procesoAIntroducir) {
		// Incluye proceso en el planificador
		colaProcesos.add(procesoAIntroducir);

	}

	public void sirve() throws InterruptedException {
		// Randomiza las posiciones
		Collections.shuffle((List<?>) colaProcesos);

		// Obtenemos el primer proceso y entramos en el bucle
		procesoEnEjecucion = get();
		while (procesoEnEjecucion != null) {

			// El bucle llamara al metodo get hasta que reciba un null(Fin de la cola)

			// Con cada proceso escribira su nombre,duracion y esperara lo que dure ésta

			System.out.println("Proceso   " + procesoEnEjecucion.getNombre() + " Tiempo de ejecución "
					+ procesoEnEjecucion.getDuracion());
			Thread.sleep(procesoEnEjecucion.getDuracion());
			System.out.println("Fin de proceso");
			procesoEnEjecucion = get();
		}
		// Al terminar el bucle
		System.out.println("Fin de todos los procesos");
	}

}
