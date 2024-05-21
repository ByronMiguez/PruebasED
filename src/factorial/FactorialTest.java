package factorial;

import static org.junit.Assert.*;
import org.junit.Test;

class FactorialTest {

	@Test (expected= IllegalArgumentException.class)
	 void test1() {
	    Factorial.calculo(-1);
	}


	@Test
	 void test2() {
		Factorial.calculo(1);
	}
	
	@Test (expected= ArithmeticException.class)
	 void test3() {
		Factorial.calculo(949758489);
	}
}
