package Prototype;

public abstract class Camiseta {
	protected String nombre;
    protected Integer talla;
    protected String color;
    protected String manga;
    protected String estampado;
    protected Object material;

    public Camiseta (String nombre,Integer talla, String color, String manga, String estampado, Object material){
            this.nombre = nombre;
            this.talla = talla;
            this.color = color;
            this.manga = manga;
            this.estampado = estampado;
            this.material = material;
    }
    public abstract Camiseta clone();
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getTalla() {
		return talla;
	}
	public void setTalla(Integer talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getManga() {
		return manga;
	}
	public void setManga(String manga) {
		this.manga = manga;
	}
	public String getEstampado() {
		return estampado;
	}
	public void setEstampado(String estampado) {
		this.estampado = estampado;
	}
	public Object getMaterial() {
		return material;
	}
	public void setMaterial(Object material) {
		this.material = material;
	}  
    
}
