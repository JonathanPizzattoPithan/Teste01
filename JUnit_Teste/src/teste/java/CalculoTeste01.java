package teste.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculoTeste01 {

	@Test
	void TesteExecutaCalculo() {
		
		//Define valores a serem calculados e testados
		float passaValor1 = 10;
		float passavalor2 = 5;
		float retornoEsperado = 15;
		
		Calculo c = new Calculo();
		float retornoFeito = c.soma(passaValor1, passavalor2);
		
		assertEquals(retornoEsperado, retornoFeito);
		
	}

}
