package entities;

public abstract class Persona //CLASSE PADRE ASTRATTA
{
	String nome;
	String cognome;
	int eta;
	
	public Persona(String nome, String cognome, int eta) //COSTRUTTORE
	{
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public abstract String toString();
}