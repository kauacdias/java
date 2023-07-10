package animais;

public class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Cachorro: AuAu");
    }

    @Override
    public void comer() {
        System.out.println("Cachorro: Carne");
    }

}
