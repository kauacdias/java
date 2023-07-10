package animais;

public class Galo implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Galo: Cocoricó");
    }

    @Override
    public void comer() {
        System.out.println("Galo: Milho");
    }

}
