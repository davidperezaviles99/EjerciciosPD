package Singleton;

public class Main {

	public static void main(String[] args) {

		Singleton s = Singleton.getSingletonInstance("David", "david@gmail.com", "Thailandia");
	
		//No se crea el objeto
		Singleton s1 = Singleton.getSingletonInstance("Natalia", "natalia@gmail.com", "Thailandia");
		
		System.out.println(s.getNombre());
		
		System.out.println(s.getDireccion());
		
		System.out.println(s.getEmail());
	}

}
