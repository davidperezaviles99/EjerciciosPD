package CircuitBreaker;

public class Main {

	public static void main(String[] args) {

		//Cerrado
		System.out.println("Estado : " + CircuitBreak.circuitBreak(0));
		
		//MedioAbierto
		System.out.println("Estado : " + CircuitBreak.circuitBreak(1)); 
		
		//Abierto
		System.out.println("Estado : " + CircuitBreak.circuitBreak(2));
		
		//Deshabilitado
		System.out.println("Estado : " + CircuitBreak.circuitBreak(3));
		
		//Forzar apertura
		System.out.println("Estado : " + CircuitBreak.circuitBreak(4));

	}

}
