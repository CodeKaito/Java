package Oggetti;

public class Persona {
    
    String nome = "Luca";
    String cognome = "Rossi";
    int eta = 25;
    String colorepReferito = "Blu";

    void saluta(){
        System.out.println("Ciao sono" + nome);
    }

    void cammina(){
        System.out.println("Sto camminando..");
    }
}
