package Prototype;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args){

		Camiseta prototipoMCorta = new CamisetaMCorta(40, "Blanco", "Logotipo");
		Camiseta prototipoMLarga = new CamisetaMLarga(40, "Blanco", "Logotipo");

		ArrayList camisetas = new ArrayList();

		for(int i = 0; i<args.length;i++){
		                Camiseta cc =  prototipoMCorta.clone();
		                cc.setEstampado(args[i]);
		 
		                for(int j = 35; j<60; j++){
		                        Camiseta cc_talla = cc.clone();
		                        cc_talla.setTalla(j);
		                        camisetas.add(cc_talla);
		                }
		                
		 
		                Camiseta cl =  prototipoMLarga.clone();
		                cl.setEstampado(args[i]);
		                
		                for(int j = 35; j<60; j++){
		                        Camiseta cl_talla = cl.clone();
		                        cl_talla.setTalla(j);
		                        camisetas.add(cl_talla);
		                }               
		        }
		}
}
