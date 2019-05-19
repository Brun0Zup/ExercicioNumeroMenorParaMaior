package com.br;

import java.util.Scanner;

public class AppDeDiferencaMaiorMenor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double numero1;
		double numero2;
		
		System.out.println("Número 1 é:");
		numero1 = entrada.nextDouble();
		
		System.out.println("Número 2 é:");
		numero2 = entrada.nextDouble();
		
		if(numero1 > numero2) {
		System.out.println("Diferença dos numeros é "+(numero1 - numero2));
	}else{
		
	System.out.println("Diferença dos numeros é "+(numero2 - numero1));
	
	}

	}
}
