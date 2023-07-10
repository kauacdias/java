package animais;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();
        
        System.out.println("Que som faz?");
        cachorro.emitirSom();
        gato.emitirSom();
        galo.emitirSom();
        pato.emitirSom();
        System.out.println("");
        System.out.println("Que come?");
        cachorro.comer();
        gato.comer();
        galo.comer();
        pato.comer();
}
 
}
