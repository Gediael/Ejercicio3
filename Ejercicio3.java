import java.util.*;

public class Ejercicio3{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		int numeroFactorial =1;

		System.out.println("Ingrese un numero entero");
		n = entrada.nextInt();
			for (int i=1; i <= n  ; i++ ) {
				numeroFactorial = numeroFactorial*i;
		
			}

				System.out.println(" El factorial del numero ingresado es: " + numeroFactorial);

	}
}	