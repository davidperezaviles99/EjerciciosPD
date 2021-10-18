package Prototype;

public class CamisetaMCorta extends Camiseta{
	
    public CamisetaMCorta(Integer talla, String color, String estampado){
            this.nombre = "Prototipo";
            this.talla = talla;
            this.color = color;
            this.manga = "Corta";
            this.estampado = estampado;
            this.material = new Object();
    }
    public Camiseta clone(){
            return new CamisetaMCorta(this.talla, this.color, this.estampado);
    }
}

