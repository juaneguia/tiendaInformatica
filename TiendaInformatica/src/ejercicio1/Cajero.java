package ejercicio1;

public class Cajero {

	private String nombreCajero;
	private Producto producto;
	private int cantidad;
	public Cajero(String nombreCajero, Producto producto, int cantidad) {
		super();
		this.nombreCajero = nombreCajero;
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public String getNombreCajero() {
		return nombreCajero;
	}
	public void setNombreCajero(String nombreCajero) {
		this.nombreCajero = nombreCajero;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double calcularPrecioFinal() {
		double precioFinal = producto.calcularPrecioU() * cantidad;
		return precioFinal;
	}
	
}
