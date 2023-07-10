package videogama;

/**
 *
 * @Kaua C Dias
 */
public class PingPong implements Jogo{

    @Override
    public void jogar() {
        System.out.println(" --- Vamos começar PING PONG --- ");
        System.out.println(" --- Saque ---");
    }

    @Override
    public void fechar() {
        System.out.println("Fim de jogo");
    }
    
}
