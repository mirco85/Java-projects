package entities;

public class Studente extends Persona
{ /*LA CLASSE FIGLIA (STUDENTE) ESTENDE LA CLASSE PADRE (PERSONA), 
    CIOè PRENDE LE PROPRIETà DELLA CLASSE PERSONA
  */
	int votoIta;
	int votoMate;
	int votoIng;
	int votoFra;
	
	public Studente(String nome, String cognome, int eta,
					int votoIta, int votoMate, int votoIng, int votoFra
					) //COSTRUTTORE
	{
		super(nome, cognome, eta); //PROPRIETA' DELLA CLASSE PADRE PERSONA
		this.votoIta = votoIta;
		this.votoMate = votoMate;
		this.votoIng = votoIng;
		this.votoFra = votoFra;
	}

	@Override
	public String toString() //METODO STAMPA 
	{
		return 	"Nome: "			+	super.nome			+
				"\nCognome: "		+	super.cognome		+
				"\nEtà: "			+	super.eta			+
				"\nItaliano: "		+	votoIta				+
				"\nMatematica: "	+	votoMate			+
				"\nInglese: "		+	votoIng				+
				"\nFrancese: "		+	votoFra				;
	}
}