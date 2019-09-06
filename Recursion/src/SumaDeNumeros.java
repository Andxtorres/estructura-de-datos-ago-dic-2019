
public class SumaDeNumeros {

	
	public static int sumaDeNumerosConsecutivos(int numeroMaximo) {
		int resultado=0;
		for (int i = 0; i <= numeroMaximo; i++) {
			resultado+=i;
		}
		return resultado;
		
	}
	
	public static int sumaDeConsecutivosRecursiva(int numeroMaximo) {
		if(numeroMaximo==1) {
			return 1;
		}else {
			return numeroMaximo + sumaDeConsecutivosRecursiva(numeroMaximo-1);
		}
	}
	
	public static int fibonacciRecursivo(int numeroMaximo) {
		if(numeroMaximo==0||numeroMaximo==1) {
			return numeroMaximo;
		}
		return fibonacciRecursivo(numeroMaximo-1)+fibonacciRecursivo(numeroMaximo-2);
		
	}
	
}
