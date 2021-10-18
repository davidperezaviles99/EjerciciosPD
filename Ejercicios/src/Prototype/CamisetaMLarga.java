package Prototype;

public class CamisetaMLarga extends Camiseta{
	
    public CamisetaMLarga(Integer talla, String color, String estampado){
    		this.nombre = "Prototipo";
            this.talla = talla;
            this.color = color;
            this.manga = "Larga";
            this.estampado = estampado;
            this.material = new Object();
    }
    public Camiseta clone(){
            return new CamisetaMLarga(this.talla, this.color, this.estampado);
    }
}
