package Procesos;
public class main {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		//Creamos 5 procesos
		Proceso proceso1 =new Proceso((int) Math.floor(Math.random()*4+1)*1000);
		Proceso proceso2 =new Proceso((int) Math.floor(Math.random()*4+1)*1000);
		Proceso proceso3 =new Proceso((int) Math.floor(Math.random()*4+1)*1000);
		Proceso proceso4 =new Proceso((int) Math.floor(Math.random()*4+1)*1000);
		Proceso proceso5 =new Proceso((int) Math.floor(Math.random()*4+1)*1000);
		planificadorFCFS(proceso1,proceso2,proceso3,proceso4,proceso5);
		planificadorSTF(proceso1,proceso2,proceso3,proceso4,proceso5);
		
	}

	private static void planificadorSTF(Proceso proceso1, Proceso proceso2, Proceso proceso3, Proceso proceso4,
			Proceso proceso5) throws InterruptedException {
		///Creamos planificador
		PlanificadorShorterTimeFirst planificador= new PlanificadorShorterTimeFirst();
		//Añadimos los procesos
		planificador.put(proceso1);
		planificador.put(proceso2);
		planificador.put(proceso3);
		planificador.put(proceso4);
		planificador.put(proceso5);
		//Ordenamos por tiempo
		planificador.ordenar();
		//"Ejecutamos" el planificador
		planificador.sirve();
		
		
	}

	private static void planificadorFCFS(Proceso proceso1, Proceso proceso2, Proceso proceso3, Proceso proceso4, Proceso proceso5) throws InterruptedException {
		///Creamos planificador
		PlanificadorFCFS planificador= new PlanificadorFCFS();
		//Añadimos los procesos
		planificador.put(proceso1);
		planificador.put(proceso2);
		planificador.put(proceso3);
		planificador.put(proceso4);
		planificador.put(proceso5);
		//"Ejecutamos" el planificador
		planificador.sirve();
		
	}
	
	
}
