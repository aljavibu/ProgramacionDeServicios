package CodificadorCesar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TransformarCodigo {

	public static void main(String[] args) {
		String ruta = "fichero.txt";
		//Si el texto esta codificado llamará al metodo descodificar 
		//y si no al de codificar
		boolean esCodificado=true;
		
		tranformarTexto(ruta,esCodificado);
		
	}
	//Metodo que leer por filas un fichero,lo codifica y escribe en un nuevo fichero
	private static void tranformarTexto(String ruta, Boolean esCodificado) {
		try(BufferedReader br =new BufferedReader(new FileReader(ruta))){
			
			String textoOriginal;
			String textoModificado;
		
			textoOriginal=br.readLine();
			
			while(textoOriginal!=null) {
				
				//Si el fichero original ya estaba codificado lo descodifica
				if(esCodificado) {
					textoModificado=Codificador.decodifica(textoOriginal);
				}else {
					//Si no,lo codifica
					textoModificado=Codificador.codifica(textoOriginal);
				}
				
				escribir(textoModificado);
				
				//Lee la siguiente linea del fichero
				textoOriginal=br.readLine();	
			}
		
		System.out.println("Transformación completada");
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void escribir(String contenido) {
		//El nuevo fichero será ficheroNuevo.txt
		try(BufferedWriter br =new BufferedWriter(new FileWriter("ficheroNuevo.txt",true))){	
		
			//Escribe la linea que le llega y hace un salto de línea
			br.write(contenido);
			br.newLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
		

}
