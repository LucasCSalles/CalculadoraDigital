package TestesAppCalculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FontesAppCalculadora.Calculadora;

public class CalculadoraTeste {
	static int contadorTeste;
	String nomeTeste;
	double resultadoReal;
	
	//Prep do teste
	@Before
	public void preparaTeste() {
		   contadorTeste = contadorTeste+1;
		   System.out.println("Teste numero:" +contadorTeste);
	}
	
	//Encerramento do teste
	@After
	public void encerraTeste() {
	       System.out.println(nomeTeste );
	       System.out.print("Resultado: ");
	       System.out.print(resultadoReal);
	       System.out.println(" ");
	}
	   @Test
	   public void testeSomar5com5() {
		   nomeTeste = "Teste de soma de 5 com 5";

		   double nro1 = 5;
		   double nro2 = 5;
	       Calculadora calc= new Calculadora();
	       double resultadoEsperado = 10;
	        resultadoReal= calc.somar(nro1, nro2); 

	       
	       assertEquals(resultadoEsperado, resultadoReal, 0);
	   }
	   
	   @Test
	   public void testeSubtrair3de5() {
		   nomeTeste = "Teste de subtrair 3 com 5";
	 	  double nro1 = 5;
	 	  double nro2 = 3;
	       Calculadora calc = new Calculadora();
	       double resultadoEsperado= 2;
	        resultadoReal= calc.subtrair(nro1, nro2);
	       assertEquals(resultadoEsperado, resultadoReal, 0);
	   }

	   
	   @Test
	   public void testeMultiplicar3por3() {
		   nomeTeste = "Teste de multiplicar 3 por 3";

		   double nro1 = 3;
		   double nro2 = 3;
	       Calculadora calc = new Calculadora();
	       double resultadoEsperado = 9;
	        resultadoReal = calc.multiplicar(nro1, nro2);
	       assertEquals(resultadoEsperado, resultadoReal, 0);
	   }

	   @Test
	   public void testeDividir3por2() {
		   nomeTeste = "Teste de dividir 3 por 2";
	 	  double nro1 = 3;
	 	  double nro2 = 2;
	       Calculadora calc = new Calculadora();
	       double resultadoEsperado= 1.5;
	        resultadoReal = calc.dividir(nro1, nro2);

	       assertEquals(resultadoEsperado, resultadoReal, 0.01);
	   }
	   @Test
	   public void testeDividir3por7() {
		   nomeTeste = "Teste de dividir 3 por 7";

	 	  double nro1 = 3;
	 	  double nro2 = 7;
	       Calculadora calc = new Calculadora();
	       double resultadoEsperado= 0.4285;
	        resultadoReal = calc.dividir(nro1, nro2);

	       assertEquals(resultadoEsperado, resultadoReal, 0.0001);
	   }
}




