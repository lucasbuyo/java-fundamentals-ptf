package app;

import app.ptf.Animal;
import app.ptf.Cuidador;
import app.ptf.Jirafa;
import app.ptf.Leon;

public class Main {

	/**
	 * 
	 */
	public Main() {
		// Constructor
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Entry point for java-app-ptf");
		
		Animal miAnimal = new Animal();
		miAnimal.cantPatas = 4;
		miAnimal.nombre = "Animal Base";
		miAnimal.sonido = "No se";
		miAnimal.tipo = "Base";
		System.out.println("miAnimal-- " + miAnimal.nombre);
		
		Leon miLeon = new Leon();
		miLeon.cantPatas = 4;
		miLeon.nombre = "Leoncito 2";
		miLeon.sonido = "Groooarrrr";
		miLeon.tipo = "Felino";
		System.out.println("miLeon-- " + miLeon.nombre);
		
		Jirafa mijirafa = new Jirafa();
		mijirafa.cantPatas = 4;
		mijirafa.nombre = "Jirafa";
		mijirafa.sonido = "no tiene";
		mijirafa.tipo = "dromedario";
		System.out.println("miLeon-- " + mijirafa.nombre);

		
		
		Cuidador micuidador = new Cuidador();
		micuidador.banar(miLeon);
		micuidador.banar(mijirafa);

	}

}
