package corsoClassi;

public class main {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Luca", "Rossi", 25, "blu");
		Persona persona2 = new Persona("Marco", "Verdi", 35, "rosso");
		
		System.out.println(persona2.nome);
		persona2.saluta();
		persona1.addizione(2, 3);
		persona2.sottrazione(3, 2);
	}
}
