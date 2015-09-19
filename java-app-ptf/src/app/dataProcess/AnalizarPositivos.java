package app.dataProcess;

import java.awt.List;
import java.util.ArrayList;

import app.dataAccess.FaceboookManager;
import app.dataAccess.TweetManager;
import app.interfaces.IMY_Interface;

public class AnalizarPositivos {

	public AnalizarPositivos() {
	}
	
	public void analizarPositivos(String jsonFromTwitter)
	{
		//
		//
		//
		//
		//
		
		String dataset = "";
		
		ArrayList<IMY_Interface> listaManagers = new ArrayList<IMY_Interface>();
		
		FaceboookManager manager = new FaceboookManager();
		listaManagers.add(manager);
		
		TweetManager tmanager = new TweetManager();
		listaManagers.add(tmanager);
		
		// ACA ENVIO INFO AL ENVIADOR
		EnviarResultados enviarResultados = new EnviarResultados();
		enviarResultados.enviar(dataset, listaManagers);
	}

}
