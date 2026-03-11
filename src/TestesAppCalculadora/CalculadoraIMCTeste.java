package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesAppCalculadora.CalculadoraIMC;

public class CalculadoraIMCTeste {
//Atributos teste
	double pesoInput;
	double alturaInput;
	double imcEsperado;
	double imcReal;
	@Test
	public void testeImcPeso100kgAltura2m() {
		CalculadoraIMC calculadora = new CalculadoraIMC();
		pesoInput=100;
		alturaInput= 2;
		imcEsperado = 25;
		imcReal= calculadora.calculaImc(pesoInput, alturaInput);
		assertEquals(imcEsperado, imcReal, 0);
	}

}
