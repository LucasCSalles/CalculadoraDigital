package FontesAppCalculadora;

public class CalculadoraIMC {
	
	//Atributos do calculo do IMC 
	private double imcCalculado;
	private double alturaAoQuadrada;
	
	public double calculaImc(double peso, double altura) {
		Calculadora calc = new Calculadora();
		
		alturaAoQuadrada = calc.multiplicar(altura, altura);
		imcCalculado = calc.dividir(peso, alturaAoQuadrada);
		
		return imcCalculado; 
	}
}
