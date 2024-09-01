public class PruebaCuentaAhorro {
	public static void main(String[] args) {
		// Crear dos instancias para los objetos CuentaAhorro
		Ahorrador ahorrador1 = new Ahorrador("Juan", 200000.00);
		Ahorrador ahorrador2 = new Ahorrador("María", 300000.00);

		// Establecer la tasa de interés anual en 4%
		CuentaAhorro.ModificaTasaInteres(0.04);

		// Calcular el interés mensual e imprimir los nuevos saldos
		System.out.println("Con TasaInteresAnual de 4%");
		ahorrador1.calcularYMostrarInteresMensual();
		ahorrador2.calcularYMostrarInteresMensual();

		// Establecer la tasa de interés anual en 5%
		CuentaAhorro.ModificaTasaInteres(0.05);

		// Calcular el interés del siguiente mes e imprimir los nuevos saldos
		System.out.println("\nCon TasaInteresAnual de 5%");
		ahorrador1.calcularYMostrarInteresMensual();
		ahorrador2.calcularYMostrarInteresMensual();
	}
}
