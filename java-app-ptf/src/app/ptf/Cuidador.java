package app.ptf;

public class Cuidador 
{
	public String nombre;
	public Integer edad;

	public Cuidador() {
	}
	
	
	
	public Boolean banar(Animal animalBase){
		animalBase.banar();
		return true;
	}

}
