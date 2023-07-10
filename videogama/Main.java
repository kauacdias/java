package videogama;

/**
 *
 * @Kaua C Dias
 */
public class Main {
    public static void main(String[] args) {
        
        VideoGame videogame = new VideoGame();
        
        videogame.ligar();
        videogame.jogar(new Xadrez());
        videogame.fechar();
        videogame.desligar();
        
        videogame.ligar();
        videogame.jogar(new TiroAoAlvoOnline());
        videogame.fechar();
        videogame.desligar();
        
        videogame.ligar();
        videogame.jogar(new PingPong());
        videogame.fechar();
        videogame.desligar();
        
    }
}
