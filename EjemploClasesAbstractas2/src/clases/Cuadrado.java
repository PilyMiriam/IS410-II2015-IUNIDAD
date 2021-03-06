package clases;

public class Cuadrado extends Rectangulo {
	public Cuadrado(int x, int y, 
			String color, String nombre, 
			int lado) {
		super(x, y, color, nombre, lado, lado);
	}
	public Cuadrado(){}
	
	public void dibujar(){
		System.out.println("Dibujando cuadrado");
	}
	@Override
	public String toString() {
		return "Cuadrado [ancho=" + ancho + ", alto=" + alto + ", x=" + x
				+ ", y=" + y + ", color=" + color + ", nombre=" + nombre + "]";
	}	
}
