package br.edu.univas.main;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		float num1, num2, val;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Bem vindo a Calculadora!!!");
		System.out.println("Antes de come�ar vou apresentar os comandos\r\n"
				+ "necess�rios para efetuar as equa��es: ");
		System.out.println("1. Somar\r\n" + 
				"2. Subtrair\r\n" + 
				"3. Multiplicar\r\n" + 
				"4. Dividir\r\n" + 
				"9. Sair\r Para utiliza-los digite o n�mero correspondente\r "+
				"a equa��o que deseja realizar e clique a tecla Enter do teclado.\r");		
		
		do{
			
			System.out.println("Qual equa��o voc� deseja realizar?\r");
			int menu = ler.nextInt();
		
			switch(menu) {
			case 1:
				System.out.println("Digite o primeiro n�mero: ");
				num1 = ler.nextFloat();
				System.out.println("Digite o segundo n�mero: ");
				num2 = ler.nextFloat();
				System.out.println("A soma de "+num1+" por "+num2+" � igual a: "+(num1+num2));
			break;
			case 2:
				System.out.println("Digite o primeiro n�mero: ");
				num1 = ler.nextFloat();
				System.out.println("Digite o segundo n�mero: ");
				num2 = ler.nextFloat();
				System.out.println("A subtra��o de "+num1+" por "+num2+" � igual a: "+(num1-num2));
			break;
			case 3:
				System.out.println("Digite o primeiro n�mero: ");
				num1 = ler.nextFloat();
				System.out.println("Digite o segundo n�mero: ");
				num2 = ler.nextFloat();
				System.out.println("A multiplica��o de "+num1+" por "+num2+" � igual a: "+(num1*num2));
			break;
			case 4:
				System.out.println("Digite o primeiro n�mero: ");
				num1 = ler.nextFloat();
				System.out.println("Digite o segundo n�mero: ");
				num2 = ler.nextFloat();
				System.out.println("A divis�o de "+num1+" por "+num2+" � igual a: "+(num1/num2));
			default:
				System.out.println("Op��o inv�lida! Por favor, digite uma op��o correta!");
			}
			
			if(menu == 9) {
				System.out.println("Obrigada por usar a calculadora!");
				break;
			}
			}while(true);
				
	}

}
