package ejercicio1;

public abstract class Producto {

	protected double precio;
	protected String marca;
	protected int stock;
	
	public Producto(double precio, String marca, int stock) {
		this.precio = precio;
		this.marca = marca;
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public abstract double calcularPrecioU();
	
	
}
