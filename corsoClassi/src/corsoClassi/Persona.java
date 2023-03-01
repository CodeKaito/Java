package corsoClassi;

public class Persona {
	String nome;
	String cognome;
	int eta;
	String colorePreferito;
	
	Persona(String nome, String cognome, int eta, String colorPreferito){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.colorePreferito = colorePreferito;
	}
	
	void saluta(){
		System.out.println("ciao sono " + this.nome);
	}
	
	void addizione(int a, int b) {
		int risultato = a + b;
		System.out.println("Il risultato è " + risultato);
	}
	
	void sottrazione(int a, int b) {
		int risultato = a - b;
		System.out.println("Il risultato è " + risultato);
	}
}
