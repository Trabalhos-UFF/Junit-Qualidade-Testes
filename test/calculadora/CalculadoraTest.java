package calculadora;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {

	private Calculadora calc;

	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}

	@DisplayName("Testa a soma de dois n�meros")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);
		Assertions.assertEquals(9, soma);
	}

	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}

	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exce��o n�o lan�ada");
		} catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}
	}

	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}

	@Test
	public void testSubtracao() {
		int[][] cases = {{2, 1, 1}, {0, 0, 0}, {1,2,-1}};
		for (int i = 0; i < cases.length; i++) {
			int result = calc.subtracao(cases[i][0], cases[i][1]);
			Assertions.assertEquals(cases[i][2], result);
		}
	}
	@Test
	public void testMultiplicacao() {
		int[][] cases = {{2, 2, 4}, {-1, 5, -5}, {0,2,0},{3,2,6}};
		for (int i = 0; i < cases.length; i++) {
			int result = calc.multiplicacao(cases[i][0], cases[i][1]);
			Assertions.assertEquals(cases[i][2], result);
		}
	}
	@Test
	public void testSomatoria() {
		int[][] cases = {{2, 3}, {4, 10}, {10,55},{3,6}};
		for (int i = 0; i < cases.length; i++) {
			int result = calc.somatoria(cases[i][0]);
			Assertions.assertEquals(cases[i][1], result);
		}
	}
	@Test
	public void testEhPositivo() {
		int [] trueValues = {2,4,6};
		int [] falseValues = {-2,-4,-6};
		for (int i = 0; i < trueValues.length; i++) {
			boolean result = calc.ehPositivo(trueValues[i]);
			Assertions.assertTrue(result);
		}
		for (int i = 0; i < falseValues.length; i++) {
			boolean result = calc.ehPositivo(falseValues[i]);
			Assertions.assertFalse(result);
		}

	}
	@Test
	public void testCompara() {
		int[][] cases = {{1, 2, -1}, {3,2, 1}, {2,2,0}};
		for (int i = 0; i < cases.length; i++) {
			int result = calc.compara(cases[i][0], cases[i][1]);
			Assertions.assertEquals(cases[i][2], result);
		}
	}
}
