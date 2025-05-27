package com.atividade.ci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class CiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void sumNumber(){
		Integer number1 = 2;
		Integer number2 = 2;

		Assertions.assertEquals(4, number1+number2);
	}

	@Test
	public void subtractNumber(){
		Integer number1 = 4;
		Integer number2 = 2;

		Assertions.assertEquals(2, number1-number2);
	}
}
