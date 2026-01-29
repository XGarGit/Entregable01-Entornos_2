package unidadentronos01;

/**
 * Clase que analiza un array de números enteros.
 * Comprueba si el número máximo se repite y calcula la media.
 *
 * @author Xavi
 */
public class p {

	/**
	 * Método que encuentra el número máximo en un array
	 * @param numeros para introducir el array seleccionado
	 * @return maximo para que se devuelva el número máximo
	 */
	public static int encontrarMáximo(int[] numeros) {
		int maximo=0;
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maximo) {
				maximo = numeros[i];
			}
		}
		return maximo;
	}


	/**
	 *Método que calcula si se repite el número máximo o no
	 * @param numeros Seleccionar el array deseado
	 * @param maximo El máximo encontrado en ese array
	 */
	public static int repeticionNum(int[] numeros, int maximo) {
		int contador = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == maximo) {
				contador++;
			}
		}
		return contador;
	}


	/**
	 * Metodo que calcula la media de los números
	 * @param numeros Array asignado
	 * @return devuelve la media
	 */
	public static double calcularMedia(int [] numeros) {
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}

		double media = (double) suma / numeros.length;
		System.out.println(media);
		return media;
	}

	public static void main(String[] args) {

		/**
		 *Variables iniciales
		 */
		int[] numeros = {5, 7, 3, 7, 2, 9, 7};
		boolean repetido = false;
		boolean aprobado = false;
		int maximo = encontrarMáximo(numeros);

		
		if (repeticionNum(numeros, maximo)>1) {
			repetido = true;
		}
		System.out.println(repetido ? "Se repite el número" : "No se repite el número");

		if (calcularMedia(numeros) >= 5) {
			aprobado = true;
		}
		System.out.println(aprobado ? "BIEN" : "MAL");
	}
}
