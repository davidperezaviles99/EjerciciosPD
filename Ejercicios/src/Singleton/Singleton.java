package Singleton;

public class Singleton {

	private String nombre;
	private String email;
	private String direccion;
	
	private static Singleton unico;
	
	public Singleton(String nombre, String email, String direccion) {
		this.nombre = nombre;
		this.email = email;
		this.direccion = direccion;
		
		System.out.println("Mi nombre es: " + this.nombre + "\nMi email es: " +this.email+ "\nMi direccion es: " +this.direccion);
	}
	
	public static Singleton getSingletonInstance(String nombre, String email, String direccion ) {
		if(unico == null) {
			unico = new Singleton(nombre,email,direccion);
		}else {
			System.out.println("No se puede crear el objeto" +nombre + "\nporque ya existe");
		}
		return unico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}		
		
}
