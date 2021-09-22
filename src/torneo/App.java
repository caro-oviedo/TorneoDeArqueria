package torneo;

import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		Torneo arqueros = new Torneo("fileName.csv");
		arqueros.getSalida();
		

	}

}
