package main;

import java.util.Scanner;

import entities.SuperEroe;

public class MainSuperEroe {

	public static void main(String[] args) {
		Scanner tastiera  = new Scanner(System.in);
		int numeroEroi;
		
		System.out.println("Da quanti eroi è composta la tua squadra?");
		numeroEroi = Integer.parseInt(tastiera.nextLine());
		SuperEroe[] elenco = new SuperEroe[numeroEroi]; //VETTORE DI OGGETTI ELENCO
		//CARICO IL VETTORE ELENCO	
		for(int i = 0; i < elenco.length; i++)
		{
			elenco[i] = new SuperEroe();
			
			System.out.println("Inserisci il nome del tuo eroe");
			elenco[i].setNome(tastiera.nextLine());
			System.out.println("Inserisci il nickname del tuo eroe");
			elenco[i].setNickname(tastiera.nextLine());
			System.out.println("Inserisci l'abilità principale del tuo eroe");
			elenco[i].setAbilita(tastiera.nextLine());
		}
		//STAMPA L'ELENCO DEGLI EROI
		for(int i = 0; i < elenco.length; i++)
		{
			System.out.println(	"Eroe numero "
								+ (i + 1)
								+ " di "
								+ elenco.length //DIMENSIONE DEL VETTORE
								+ "\n" //VA A CAPO
								+ elenco[i].toString() //STAMPA GLI OGGETTI DEL VETTORE
								);
		}
		
		System.out.println("Di quale eroe vuoi la stampa?");
		int eroeDaStampare = Integer.parseInt(tastiera.nextLine());
		System.out.println(elenco[eroeDaStampare - 1].toString());
		tastiera.close();
	}
}
