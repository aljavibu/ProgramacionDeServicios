package Ejercicio8UD1;

import java.util.ArrayList;
import java.util.Map;

public class ejercicio8UD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder pb= new ProcessBuilder();
		Map<String, String> arrayPb =pb.environment();
		System.out.println(arrayPb.toString());
		
		ArrayList<String> listaComando= new ArrayList<String>();
		listaComando.add("ls");
		ProcessBuilder pb2= new ProcessBuilder();
		System.out.println(pb.command());
		
	}

}
