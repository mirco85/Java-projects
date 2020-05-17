package entities;

public class SuperEroe {
	    //PROPRIETA' DELL'OGGETTO
		private String nome;
		private String nickname;
		private String abilita;
		
		//PROPRIETA' DI CLASSE
		private static final int LETTEREMAX = 10;
		private static final int LETTEREMIN = 0;
		
		public SuperEroe(){};
		
		public SuperEroe(String nome, String nickname, String abilita)
		{
			setNome(nome);
			setNickname(nickname);
			setAbilita(abilita);
		}
		
		public boolean validaStringa(String stringaDaVerificare)
		{
			boolean ris = false;
			if(	!stringaDaVerificare.isEmpty() 				&&
				stringaDaVerificare.length() < LETTEREMAX 	&&
				stringaDaVerificare.length() > LETTEREMIN
					)
				ris =  true;
			return ris;
		}

		public String getNome()
		{
			return nome;
		}

		public void setNome(String nome)
		{
			if(validaStringa(nome))
				this.nome = nome;
		}

		public String getNickname()
		{
			return nickname;
		}

		public void setNickname(String nickname)
		{
			if(validaStringa(nickname))
			this.nickname = nickname;
		}

		public String getAbilita()
		{
			return abilita;
		}

		public void setAbilita(String abilita)
		{
			if(validaStringa(abilita))
				this.abilita = abilita;
		}
		
		public String toString()
		{
			return 	"Nome: " 		+ 	nome 		+
					"\nNickname: " 	+	nickname 	+
					"\nAbilita: "	+	abilita		;
		}

}
