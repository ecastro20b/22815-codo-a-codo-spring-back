package ar.com.codoacodo;

//Nombre de la clases la primera letra es en mayuscula
public class Auto {

	/*
	 * atributos
	 */
	boolean encendido;
	float velocidadActual;
	String marca;
	String modelo;
	int anio;
	float velocidadMaxima;
	
	//todas las clases tienen un constructor por defecto
	//constructor por defecto / explicito
	Auto(){
		//aca va el codigo cuando nace el auto
		this.encendido = false; //esta apagado
		this.velocidadMaxima = 200;
		this.velocidadActual = 0;
	}
	
	Auto(final float velocidadMaxima){
		//this
		this.velocidadActual = 0;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	//metodos
	void encender() {
		if(!encendido) {
			encendido = true; //se enciende	
			System.out.println("se ha encendido");
		}else {
			System.out.println("ya esta encendido");
		}
		
	}
	
	void apagar() {
		
	}
	void acelerar() {
		if(encendido) {
			
			if(this.velocidadActual < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidadActual++;
			}else {
				System.out.println("se quema el auto");
			}
						
		}else {
			System.out.println("debe encender el auto");
		}
	}
	void frenar() {
		
	}
	void mostrarInfo() {
		System.out.println("encendido: " + encendido);
		System.out.println("velocidad actual: " + velocidadActual);
		System.out.println("velocidad maxima: " + velocidadMaxima);
	}
	
}
