/*Programa que gera uma tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
*/

package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tabuada: ");
		int tabuada = sc.nextInt();
		
		System.out.println("Tabuada de: " + tabuada);
		
		for(int i = 1; i <= 10; i = i + 1) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
		}
	}
}
