package trabalhoC2LPOO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Aplicativo {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Castelo> vetCastelos = new ArrayList<Castelo>();

		
		String casteloJ1 = "casteloJ1";
		Japones casteloJapones1 = new Japones(casteloJ1);
		String casteloJ2 = "casteloJ2";
		Japones casteloJapones2 = new Japones(casteloJ2);
		String casteloE1 = "casteloE1";
		Europeu casteloEuropeu1 = new Europeu(casteloE1);
		String casteloE2 = "casteloE2";
		Europeu casteloEuropeu2 = new Europeu(casteloE2);
		
		Castelo[] castelos = {casteloJapones1, casteloJapones2, casteloEuropeu1, casteloEuropeu2};
		
		vetCastelos.add(casteloJapones1);
		vetCastelos.add(casteloJapones2);
		vetCastelos.add(casteloEuropeu1);
		vetCastelos.add(casteloEuropeu2);
		
		Collections.shuffle(vetCastelos);
		
		System.out.println("\n-----BEM VINDO-----\n");
		
		Castelo c1 = vetCastelos.get(0);
		Castelo c2 = vetCastelos.get(1);
		Castelo c3 = vetCastelos.get(2);
		Castelo c4 = vetCastelos.get(3);
		
		System.out.println("Ordem da partida: "
				+ "\n1° "+c1.nome
				+"\n2° "+ c2.nome
				+"\n3° "+c3.nome
				+"\n4° "+c4.nome);
		
		System.out.println("");
		
		while (vetCastelos.size() != 1) {

			
			for(int i = 0; i < vetCastelos.size(); i++) {
				
				int escolha;
				
				do {
				escolha = sorteio(i);
				}while(escolha >= vetCastelos.size());
				
				System.out.println();
				System.out.println("O castelo "+ vetCastelos.get(i).getNome()+ " escolheu o castelo " +vetCastelos.get(escolha).nome);
				System.out.println("Situacao do castelo: " + vetCastelos.get(escolha).situacao());
				ataque(vetCastelos, escolha);
				
			}
		}
		
		for (Castelo castelo: vetCastelos) {
			
			if(castelo != null) {
				System.out.println("CASTELO" + castelo.nome + "VENCEDOR");
			}
				
		}

	}
	
	public static int sorteio(int castelo) {
		Random random = new Random();
		
		int escolha;
		
		do {
			escolha = random.nextInt(3);
		} while (escolha == castelo);
		
		return escolha;
	}
	
	public static void ataque(ArrayList<Castelo> vetCastelos, int atacado) {
		Random random = new Random();
		boolean continua;
		
		int ataque;
		ataque = random.nextInt(11);
		
		if(ataque == 0) {
			System.out.println("\nQue pena! Tirou 0 no dado, sua ver foi passada!");
		} else {
			System.out.println("\nSeu ataque foi de " + ataque +"!!");
			continua = vetCastelos.get(atacado).ataque(ataque);
			System.out.println("Situacao do castelo: " + vetCastelos.get(atacado).situacao());
			System.out.println();
			
			if(continua == false) {
				System.out.println("CASTELO " + vetCastelos.get(atacado)+ " DESTRUÍDO");
				vetCastelos.remove(atacado);
			}
			
			
			
		}
	}
	
}
