package Builder;
 
public class Main {

	public static void main(String[] args) {
		
		Usuario usuario= new UsuarioBuilder().build("David", "david@gmail.com", "213456789", "C Japon N1");
		System.out.println(usuario);

	}

}
