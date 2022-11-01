
public class CalculadoraTestes {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		int resultadoDaSoma = calculadora.somar(3, 7);
		System.out.println(resultadoDaSoma);

		resultadoDaSoma = calculadora.somar(3, 0);
		System.out.println(resultadoDaSoma);

		resultadoDaSoma = calculadora.somar(0, 0);
		System.out.println(resultadoDaSoma);

		resultadoDaSoma = calculadora.somar(3, -1);
		System.out.println(resultadoDaSoma);

	}

}
