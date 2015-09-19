package app.dataProcess;

import java.util.ArrayList;

import app.interfaces.IMY_Interface;

public class EnviarResultados {

	public EnviarResultados() {
	}
	
	/**
	 * Este metodo va a enviar resultados de el procesamiento positivo
	 * 
	 * @param dataset este es el resultado del procesamiento
	 * @param managers de redes sociales
	 * @return List<String>
	 * 
	 * 
	 */
	public void enviar(String dataset, ArrayList<IMY_Interface> managers)
	{
		// LO QUE TENGA QUE HACER
		
		for (IMY_Interface pepe : managers) {
			pepe.post(dataset);
		}
		
	}

}
