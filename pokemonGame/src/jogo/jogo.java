package jogo;

import java.util.Scanner;

import classes.Pokemon;

public class jogo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		char quantidadeJogador; 
		int tipoJogo; 
		
		Pokemon charmander = new Pokemon("Charmander", 4000, 7000 ,35 , 25000, "Fire");
		Pokemon hooh = new Pokemon("Ho-Oh", 10000, 6000, 40, 40000, "Fire");
		Pokemon vulpix = new Pokemon("Vulpix", 3000, 5000, 50, 20000, "Fire");
		Pokemon magmar = new Pokemon("Magmar", 3000, 5000, 50, 20000, "Fire");
		
		
		System.out.println("Seja bem vindo ao Pokemon black and white:");
		System.out.println("Selecione se irá jogar multiplayer ou single player: (M/S)");
		quantidadeJogador = teclado.next().toUpperCase().charAt(0);
		
		if(quantidadeJogador == 'M') {
			System.out.println("O jogo será multiplayer!");
			tipoJogo = 2;
		} else if(quantidadeJogador == 'S') {
			System.out.println("O jogo será single player!");
			tipoJogo = 1;
		} else {
			System.out.println("Parece que você selecionou a opção errada, tente novamente para jogar.");
			tipoJogo = 3;
		}
	}

}
