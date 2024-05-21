package factorial;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {

	@Test (expected= IllegalArgumentException.class)
	 public void test1() {
	    Factorial.calculo(-1);
	}


	@Test
	 public void test2() {
		Factorial.calculo(1);
	}
	
	@Test (expected= ArithmeticException.class)
	 public void test3() {
		Factorial.calculo(94975);
	}
}
