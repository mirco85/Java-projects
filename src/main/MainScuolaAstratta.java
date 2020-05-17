package main;
import entities.Insegnante;
import entities.Persona;
import entities.Studente;

public class MainScuolaAstratta
{
	public static void main(String[] args)
	{
		Persona p = new Studente("Luca","Agliardi",32,10,10,10,10);
		Studente s = (Studente) p; //CAST DI P A STUDENTE
		
		Persona i = new Insegnante("Luca","Agliardi",32,5,"Informatica");
		Insegnante ins = (Insegnante) i;
		
		System.out.println(ins.toString());
		System.out.println(ins.stipendio());
		System.out.println("--------------------------------");
		System.out.println(s.toString());
	}
}