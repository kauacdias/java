package animais;

public class Gato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Gato: Miau");
    }

    @Override
    public void comer() {
        System.out.println("Gato: Ração");
    }

    
    
}
