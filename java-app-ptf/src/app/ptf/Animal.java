package app.ptf;

public class Animal {

    //-- propiedades
    public String nombre;
    public Integer cantPatas;
    public String tipo;
    public String sonido;
    public String cuidador;

    //---------------- CONSTRUCTOR
	public Animal() {
    	System.out.println("Nueva instancia Animal ");
	}

    //--------- metodos -----------
	
    public void caminar(String distancia){
    	System.out.println("Metodo Caminar " + distancia);
    }
    
    public Integer correr(){
    	return 5;
    }
    
    public void banar(){
    	System.out.println("Ya esta bañado " + nombre);
    }
    
//    reproducirSonido
    
//    banarse




}
