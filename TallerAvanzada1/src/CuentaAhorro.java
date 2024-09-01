class CuentaAhorro {
	private static double TasaInteresAnual;
	private double SaldoAhorro;

	public CuentaAhorro(double saldoInicial) {
		this.SaldoAhorro = saldoInicial;
	}

	public double CalculaInteresMensual() {
		double interesMensual = (SaldoAhorro * TasaInteresAnual) / 12;
		SaldoAhorro += interesMensual;
		return interesMensual;
	}

	public static void ModificaTasaInteres(double nuevaTasa) {
		TasaInteresAnual = nuevaTasa;
	}

	public double getSaldoAhorro() {
		return SaldoAhorro;
	}

	@Override
	public String toString() {
		return "Saldo de Ahorro: " + SaldoAhorro;
	}
}