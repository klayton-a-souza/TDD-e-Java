package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	public void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
//		assertThrows(IllegalArgumentException.class,
//				() -> service.calcularBonus(new Funcionario("Klayton", LocalDate.now(), new BigDecimal("50000"))));
		
		try {
			service.calcularBonus(new Funcionario("Klayton", LocalDate.now(), new BigDecimal("50000")));
			fail("A exception nao foi lançada");
		} catch (Exception e) {
			assertEquals("Funcionario com salario maior que R$ 10000 nao pode receber bonus", e.getMessage());
		}

	}

	@Test
	public void bonusDeveriasSerDezPorcentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Klayton", LocalDate.now(), new BigDecimal("5000")));

		assertEquals(new BigDecimal("500.00"), bonus);
	}

	@Test
	public void bonusDeveriaSerDezPorcentoParaSalarioDeExatamente10000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Klayton", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
