package task;

public class Cuenta {

	private String titular;
	private Double cantidad;

	public Cuenta(String titular, double cantidad) {
		this.setTitular(titular);
		this.setCantidad(cantidad);
	}
	public Cuenta(String titular) {
		this.setTitular(titular);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	private double GuessZero(double number) {
		return number < 0 ? 0 : number;
	}
	public void Ingresar(double cantidad) {
		this.setCantidad(this.GuessZero(cantidad));
	}
	public void Retirar(double cantidad) {
		double rest = this.getCantidad() - cantidad;
		this.setCantidad(this.GuessZero(rest));
	}
};

