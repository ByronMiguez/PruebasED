package factorial;

public class Factorial {
	/**
	 * En el método cálculo se comprueba: 
	 * 
	 *   - Si el número es menor que 0, en este caso se lanza la excepción 
	 *   IllegalArgumentException con el mensaje “Número n no puede ser <0”.
	 *    
	 *   - Si el valor del factorial calculado es igual que 0 es que ha ocurrido 
	 *   un error de desbordamiento, en este caso se lanza la excepción 
	 *   ArithmeticException y se lanza el mensaje “Overflow, número n demasiado 
	 *   grande”
	 */

		public static int calculo(int n) {
			if (n < 0) {
				throw new IllegalArgumentException("Numero " + n + " no puede ser < 0");
			}

			int fact = 1;
			for (int i = 2; i <= n; i++) {
				fact *= i;
			}
			System.out.println("fact = " + fact);
			if (fact == 0) {
				throw new ArithmeticException("Overflow, numero " + n + " demasiado grande");
			}
			return fact;
		}

}

