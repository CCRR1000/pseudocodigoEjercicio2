/*
   2. Solicitar al usuario que ingrese un valor N y mostrar todos los valores comprendidos entre N y 1, comenzando desde N.
*/

import java.util.*;

public class Ejercicio2 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);

		int N;

		System.out.print("\nIngrese un numero: ");

		N = read.nextInt();

		while (N>0) {
			System.out.println(" - "+N+" - ");
			N--;
		}

		System.out.println();
	}


}

