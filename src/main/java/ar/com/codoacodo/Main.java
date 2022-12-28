package ar.com.codoacodo;

public class Main {

	public static void main(String[] args) {
				
		//velocidad maxima 5 km/h
		Auto miPrimerAuto = new Auto(5); 
				
		miPrimerAuto.encender();
		
		miPrimerAuto.acelerar();
		miPrimerAuto.acelerar();
		miPrimerAuto.acelerar();
		miPrimerAuto.acelerar();
		miPrimerAuto.acelerar();
		
		miPrimerAuto.acelerar();
		
		miPrimerAuto.mostrarInfo();
	}

}
