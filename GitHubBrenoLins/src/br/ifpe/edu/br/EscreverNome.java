package br.ifpe.edu.br;

import java.util.Scanner;

public class EscreverNome {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual seu nome?");

		String nomePessoa = "Bruno";
		String nome2;
		nome2 = ler.next();
		System.out.println("Seu nome é: "+nome2);
		System.out.println("Seu nome é: "+nomePessoa);
		

	}

}
