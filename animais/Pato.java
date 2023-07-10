package animais;

public class Pato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Pato: Quá");
    }

    @Override
    public void comer() {
        System.out.println("Pato: Peixe");
    }
}
