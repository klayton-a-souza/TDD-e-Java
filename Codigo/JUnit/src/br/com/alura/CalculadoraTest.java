package br.com.alura;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumeroPossitivos() {
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.somar(3, 7);
		
		Assert.assertEquals(10,soma);
	}

}
