package interfaces;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        
        System.out.println("Cachorro: " + cachorro.emitirSom());
        System.out.println("Gato: " + gato.emitirSom());
    }
}
