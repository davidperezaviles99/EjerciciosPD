package CircuitBreaker;

public class CircuitBreak {

	public static int circuitBreak(int error) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		switch (error) {
		case 0: {
			System.out.println("Cerrado");
			return 0;
		}
		case 1: {
			System.out.println("Medio Abierto");
			return 1;

		}
		case 2: {
			System.out.println("Abierto");
			return 2;
		}
		case 3: {
			System.out.println("Deshabilitado");
			return 3;

		}
		case 4: {
			System.out.println("Forzar Apertura");
			return 4;
		}
		default: {
			return -1;
		}
		
		}

	}
}
