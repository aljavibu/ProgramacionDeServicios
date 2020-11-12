package Procesos;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//take the runtime of java application
		Runtime builder = Runtime.getRuntime();
		
		//execute commands line
		String cmd = "ls";
		
		try(BufferedWriter br =new BufferedWriter(new FileWriter("resultadoCMD.txt"))) {
			//Ejecuta el comando 
			Process out = builder.exec(cmd);
			//Consigue el resultadod de out y lo lee con un bufferedReader
			BufferedReader bf = new BufferedReader(new InputStreamReader(out.getInputStream()));
			String linea;
			//Muesta el buffered reader por pantalla linea a linea
			while( (linea=bf.readLine()) != null) {
				System.out.println(linea);
				//Escribe en el nuevo fichero
				br.write(linea);
				br.newLine();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}