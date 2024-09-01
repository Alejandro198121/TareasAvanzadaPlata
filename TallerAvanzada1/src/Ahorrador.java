class Ahorrador {
	private String nombre;
	private CuentaAhorro cuenta;

	public Ahorrador(String nombre, double saldoInicial) {
		this.nombre = nombre;
		this.cuenta = new CuentaAhorro(saldoInicial);
	}

	public void calcularYMostrarInteresMensual() {
		double interes = cuenta.CalculaInteresMensual();
		System.out.println("Interés mensual calculado para " + nombre + ": " + interes);
		System.out.println("Nuevo saldo: " + cuenta.getSaldoAhorro());
	}

	public CuentaAhorro getCuenta() {
		return cuenta;
	}

	@Override
	public String toString() {
		return "Ahorrador: " + nombre + ", " + cuenta;
	}
}