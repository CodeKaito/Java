package corsoClassi;

public class main {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Luca", "Rossi", 25, "blu");
		Persona persona2 = new Persona("Marco", "Verdi", 35, "rosso");
		
		System.out.println(persona2.nome);
		System.out.println(persona1.nome);
	}
}
