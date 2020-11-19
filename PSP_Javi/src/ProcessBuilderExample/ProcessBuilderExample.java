package ProcessBuilderExample;

import java.io.IOException;

public class ProcessBuilderExample {

	public static void main(String[] args) {
		try {
			Process pb=new ProcessBuilder("firefox","localhost:9000").start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
