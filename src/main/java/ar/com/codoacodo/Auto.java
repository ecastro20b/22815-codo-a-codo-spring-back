package ar.com.codoacodo;

//Nombre de la clases la primera letra es en mayuscula
public class Auto {

	/*
	 * atributos
	 */
	boolean encendido;
	float velocidad;
	String marca;
	String modelo;
	int anio;
	
	//todas las clases tienen un constructor por defecto
	//constructor por defecto / explicito
	Auto(){
		//aca va el codigo cuando nace el auto
		encendido = false; //esta apagado
	}
	
	//metodos
	void encender() {
		encendido = true; //esta encendido
	}
	
	void apagar() {
		
	}
	void acelerar() {
		
	}
	void frenar() {
		
	}
	void mostrarInfo() {
		System.out.println("encendido: " + encendido);
	}
	
}
