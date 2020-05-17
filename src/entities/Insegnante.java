package entities;

public class Insegnante extends Persona
{
	private int anniLavorati;
	private String materia;
	
	public Insegnante(	String nome, String cognome, int eta,
						int anniLavorati, String materia
						)
	{
		super(nome, cognome, eta);
		this.anniLavorati = anniLavorati;
		this.materia = materia;
	}

	public int stipendio()
	{
		return 1000;
	}
	
	@Override
	public String toString()
	{
		return 	"Nome: "			+	super.nome			+
				"\nCognome: "		+	super.cognome		+
				"\nEtà: "			+	super.eta			+
				"\nAnni di lavoro: "+	anniLavorati		+
				"\nMaterie: "		+	materia				;
	}
}